package Unit7ArrayLists.notesFor75;

// import ArrayList class
import Unit7ArrayLists.notesFor75.Item;

import java.util.ArrayList;

public class Store {
    // declare an instance variable of an ArrayList of type Item called myItems
    private ArrayList<Item> myItems;

    public Store() {
        // instantiate the ArrayList myItems
        myItems = new ArrayList<Item>();
    }

    /**
     * This method will first search the ArrayList to see if there
     * is an Item in the ArrayList equal to newItem.
     *
     * If the item is found, then the quantity in stock is updated
     * to add the amount of the newItem to the existing amount in stock.
     *
     * If the item is not found in myItems, then add the Item to
     * the end of the ArrayList
     *
     * @param newItem - the item to add or update stock with
     * @return	true 	if an item was added to the ArrayList
     * 			false 	if no new items were added
     */

    public boolean updateStock(Item newItem) {
        for(int i = 0; i < myItems.size(); i++) {
            if (myItems.get(i).equals(newItem)) {
                myItems.get(i).setQuantity(newItem.getQuantity() + myItems.get(i).getQuantity());
                return false;
            }
        }
        myItems.add(newItem);
        return true;
    }

    /**
     * This method returns a String representation of every Item in the ArrayList
     * The toString of the Item class should be called here as a helper method.
     */

    public String toString(){
        String output = "All Items (name, price, city)\n";
        for(int i = 0; i < myItems.size(); i++){
            output += myItems.get(i).toString() + "\n";
        }
        return output;


    }

}


