package proxy;

import java.util.List;

public class SongServiceDriver {
    public static void main(String[] args) {

        SongServer server1 = new SongServer();
        server1.addSong(new Song("Song 1", "Artist 1", "Album 1", 100), 1);
        server1.addSong(new Song("Song 2", "Artist 2", "Album 2", 129), 2);
        server1.addSong(new Song("Song 3", "Artist 3", "Album 2", 100), 3);
        server1.addSong(new Song("Song 4", "Artist 4", "Album 1", 20), 4);
        server1.addSong(new Song("Song 5", "Artist 5", "Album 5", 329), 5);

        SongProxy proxy = new SongProxy(server1);

        Song song1 = proxy.searchById(2);
        System.out.println("Search by ID=2: ");
        System.out.println(song1.getTitle() + " by " + song1.getArtist() + " in " + song1.getAlbum());
        System.out.println("Duration: " + song1.getDuration());

        List<Song> songList1 = proxy.searchByTitle("Song 3");
        System.out.println("Search by Title='Song 3': ");
        for (Song song : songList1) {
            System.out.println(song.getTitle() + " by " + song.getArtist() + " in " + song.getAlbum());
            System.out.println("Duration: " + song.getDuration());
        }

        List<Song> songList2 = proxy.searchByAlbum("Album 2");
        System.out.println("Search by Album='Album 2': ");
        for (Song song : songList2) {
            System.out.println(song.getTitle() + " by " + song.getArtist() + " in " + song.getAlbum());
            System.out.println("Duration: " + song.getDuration());
        }
        

    }
    
}
