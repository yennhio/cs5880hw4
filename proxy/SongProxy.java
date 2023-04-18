package proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongProxy implements SongService {
    SongService tempStorage;
    Map<Integer, Song> cache;

    public SongProxy(SongService tempStorage) {
        this.tempStorage = tempStorage;
        this.cache = new HashMap<>();
    }

    @Override
    public Song searchById(Integer songID) {
        Song song = cache.get(songID);
        if (song == null) {
            song = tempStorage.searchById(songID);
            cache.put(songID, song);
        }
        return song; 
    }

    @Override
    public List<Song> searchByTitle(String title) {
        return tempStorage.searchByTitle(title);

    }

    @Override
    public List<Song> searchByAlbum(String album) {
        return tempStorage.searchByAlbum(album);

    }

}
