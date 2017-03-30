import java.util.Scanner;

/**
 * Created by eliyahudorsky on 1/27/16. BS"D
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static mobilePhone newList = new mobilePhone();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        printInstructions();

        while(!quit) {
            System.out.println("Choose an option:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    searchContact();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }



    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - Main Menu");
        System.out.println("\t 1 - Add a Contact");
        System.out.println("\t 2 - Remove a Contact");
        System.out.println("\t 3 - Modify a Contact");
        System.out.println("\t 4 - Search for a Contact");
        System.out.println("\t 5 - Quit");
    }

    public static void addContact() {
        System.out.println("Please enter the name of the add contact: ");
        String addName = scanner.nextLine();
        if(newList.searchName(addName) != null) {
            System.out.println("This contact is already on the list.");
        } else {
            newList.addName(addName);
        }
    }

    public static void removeContact() {
        System.out.println("Please enter the name of the remove contact: ");
        String removeName = scanner.nextLine();
        newList.removeName(removeName);
    }


    public static void modifyContact() {
        System.out.println("Please enter the name you want to replace: ");
        String originalName = scanner.nextLine();
        int originalNamePosition = newList.positionSearch(originalName);
        if(newList.searchName(originalName) != null) {
            System.out.println("Please enter the replacement name: ");
            String newName = scanner.nextLine();
            newList.modifyName(originalNamePosition, originalName, newName);
        }
    }

    public static void searchContact() {
        System.out.println("Please enter the name you want to search for: ");
        String searchWord = scanner.nextLine();
        if(newList.searchName(searchWord) != null) {
            System.out.println(searchWord + " was found in the contacts list.");
        } else {
            System.out.println(searchWord + " was not found in the contacts list.");
        }
    }
}
