package proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SongServer implements SongService {

    Map<Integer, Song> songs;

    public SongServer() {
        this.songs = new HashMap<>();
    }

    public void addSong(Song song, Integer songID) {
        songs.put(songID, song);
    }

    public Song searchById(Integer songID) {
        try {
            Thread.sleep(1000);
            } catch (Exception e) {}
            
        return songs.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        try {
            Thread.sleep(1000);
            } catch (Exception e) {}
            
        List result = new ArrayList<>();
        for (Song song : songs.values()) {
            if (song.getTitle().equals(title)) {
                result.add(song);
            }
        }

        return result;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000); // simulate network latency
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Song> result = new ArrayList<>();
        for (Song song : songs.values()) {
            if (song.getAlbum().equals(album)) {
                result.add(song);
            }
        }

        return result;
    }
}

