import java.util.Scanner;

/**
 * Created by eliyahudorsky on 1/28/16. BS"D
 */

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static Bank AmericaBank = new Bank();
    public static Branch AmericaBranch = new Branch();

    public static void main(String[] args) {

        boolean quit = false;
        int choice;

        while(!quit) {
            mainMenu();
            choice = scanner.nextInt();
            String newChoice = scanner.nextLine();
            switch(choice) {
                case 0:
                    branchMenu();
                    break;

                case 1:
                    addBranch();
                    break;

                case 2:
                    removeBranch();
                    break;

                case 3:
                    quit = true;
                    break;
            }
        }
    }

    public static void mainMenu() {
        System.out.println("\nWelcome to Waterbury Bank!  Please select an option." +
        "\t 0 - Find a branch" + "\t 1 - Add a branch" + "\t 2 - Remove a branch" + "\t 3 - Quit");
    }

    public static void branchMenu() {
        System.out.println("Please select a branch.");
        for(int i=0; i <= AmericaBank.branchList.size(); i++) {
            System.out.println(i+1 + ". " + AmericaBank.branchList.get(i));
        }
        System.out.println("Please choose a number.");
        int numberChoice = scanner.nextInt();
        System.out.println("Branch options: ");
        System.out.println("\t 0 - Add a Customer with transaction");
        System.out.println("\t 1 - Remove a Customer");
        System.out.println("\t 2 - Customer Transaction only");
        System.out.println("\t 3 - Search for a Customer");
        System.out.println("\t 4 - Quit");
        int optionsChoice = scanner.nextInt();
        switch(optionsChoice) {
            case 0:
                String name = AmericaBank.searchByBranchPosition((numberChoice-1));
                AmericaBranch.setCustomerNames(name);


        }
    }

    public static void addBranch() {
        System.out.println("Add a name: ");
        String newChoice = scanner.nextLine();
        AmericaBank.branchIndex.add(newChoice);
    }

    public static void removeBranch() {
        System.out.println("Choose a name to remove: ");
        String removeChoice = scanner.nextLine();
        AmericaBank.branchIndex.remove(removeChoice);

    }

    public void branchDisplay() {
        int choice;
        System.out.println("Please select a branch.");
        choice = scanner.nextInt();

    }


}
