import java.util.ArrayList;

/**
 * BS"D
 */
public class Album {

    private ArrayList<Song> songList;
    private String title;


    public Album(ArrayList<Song> songList, String title) {
        this.songList = songList;
        this.title = title;
    }

    public Album(String title) {
        this.title = title;
    }

    public void addSong(String title) {
        songList.add(song);
    }

    public void removeSong(String song) {
        songList.remove(song);
    }



}
