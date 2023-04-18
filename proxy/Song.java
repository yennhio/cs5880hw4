package proxy;

public class Song {
    
    private String title;
    private String artist;
    private String album;
    private int duration;

    public Song(String title, String artist, String album, int duration) {
        this.album = album;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public int getDuration() {
        return duration;
    }


}
