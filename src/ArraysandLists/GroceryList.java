package ArraysandLists;                                                            //********notes**********
import java.util.ArrayList;                                                           //ArrayList is a class and hence it can have its own constructor.

/**
 * Created by manbir on 4/3/2017.
 */
public class GroceryList {
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);

    }
}
