import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by eliyahudorsky on 1/26/16. BS"D
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your item: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchforItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

        public static void processList() {
            ArrayList<String> newArray = new ArrayList<>(); // or new ArrayList<>(groceryList.getGroceryList());
            String[] myArray = new String[groceryList.getGroceryList().size()];
            myArray = groceryList.getGroceryList().toArray(myArray);
            newArray.addAll(groceryList.getGroceryList());
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - List of items.");
        System.out.println("\t 2 - Add to list");
        System.out.println("\t 3 - Modify an item.");
        System.out.println("\t 4 - Remove an item.");
        System.out.println("\t 5 - Search for an item.");
        System.out.println("\t 6 - Quit.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() { // May want to use search function instead
        System.out.println("Enter item number: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem((itemNumber-1), newItem);
    }

    public static void removeItem() {
        System.out.println("Select an item to remove: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem((itemNumber-1)); // <--- better to update main class
    }

    public static void searchforItem() {
        System.out.println("Enter search item: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + "in the grocery list.");
        } else {
            System.out.println(searchItem + "is not in the grocery list.");
        }
    }
}
