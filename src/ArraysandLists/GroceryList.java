package ArraysandLists;                                                            //********notes**********
import java.util.ArrayList;                                                           //ArrayList is a class and hence it can have its own constructor.

/**
 * Created by manbir on 4/3/2017.
 */
public class GroceryList {

    private ArrayList<String> grocerylist = new ArrayList<String>();           //diff between array and array list is that arrays can hold only values but
    //  arraylists can hold objects.

    public void addGroceryList(String item) {
        grocerylist.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + grocerylist.size() + " items in your grocery list");
        for (int i = 0; i < grocerylist.size(); i++) {
            System.out.println((i + 1) + ". " + grocerylist.get(i));  //.get(i) : how to access an element;

        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        grocerylist.set(position, newItem);
        System.out.println("Grocery Item " + (position + 1) + " has been modified");

    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }


    }

    private void removeGroceryItem(int position) {
        grocerylist.remove(position);

    }

    private int findItem(String searchItem) {
//        boolean exists = grocerylist.contains(searchItem); {  // . contains is to check if the array list has the item;
//        int position = grocerylist.indexOf(searchItem);  //returns the position of the item being searched
//            if (position >=0) {
//                return grocerylist.get(position);
//            }
//
//            return null;


        return grocerylist.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;


    }
}






