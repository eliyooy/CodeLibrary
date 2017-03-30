import java.util.ArrayList;

/**
 * Created by eliyahudorsky on 1/26/16. BS"D
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item); // <---- add to the array list
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " changed to " + newItem);
    }

    public void removeGroceryItem(int position) {
        String removedItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
        boolean exists = groceryList.contains(searchItem); // <---- Method 1
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int i=0; i<groceryList.size(); i++) {
            System.out.println((i+1) + ": " + groceryList.get(i));
        }
    }

}
