import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * BS"D
 */
public class Main {
    public Scanner scanner = new Scanner(System.in);
    ArrayList<String> allAlbums = new ArrayList<>();
    Collection<String> myAlbums;

    public static void main(String[] args) {



    }

    public void addAlbum() {
        System.out.println("Please enter album name: ");
        String albumName = scanner.nextLine().toLowerCase();
        myAlbums.add(new Album(new ArrayList<>(), albumName));
        allAlbums.add(albumName);
        System.out.println(albumName + " added to your album list.");
    }

    public void addSong() {
        boolean moveOn = false;
        while(!moveOn) {
            System.out.println("Choose an album: ");
            String albumName = scanner.nextLine().toLowerCase();
            for(int i=0; i<myAlbums.size(); i++) {
                if(myAlbums.contains(Album(albumName)) {
                    System.out.println("Please enter a song name: ");
                    String songName = scanner.nextLine().toLowerCase();
                    moveOn = true;
                }
                    System.out.println("Album not found.");
                }
            }
        }
    }

}
