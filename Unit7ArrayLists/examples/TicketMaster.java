package Unit7ArrayLists.examples;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TicketMaster {
    private ArrayList<Show> showList = new ArrayList<Show>();

    /**
     * Calls the readQuestions function immedeately when a function is made to read in the file to fill in
     * arrayList instance variable
     * @param readIn
     * @throws FileNotFoundException
     */
    public TicketMaster(Scanner readIn) throws FileNotFoundException {
        readQuestions(readIn);
    }

    /**
     * Reads in the statements from the file using the Scanner method, transforms them into show objects,
     * and puts each show object in our instance variable List.
     * @param readIn
     * @throws FileNotFoundException
     */
    public void readQuestions(Scanner readIn) throws FileNotFoundException{
        while(readIn.hasNextLine()) {
            String date = readIn.next();
            double price = readIn.nextDouble();
            int quantity = readIn.nextInt();
            String temp = readIn.nextLine();
            String artistName = temp.substring(0, temp.indexOf(','));
            String location = temp.substring(temp.indexOf(',') + 2);

            Show newShow = new Show(date,price,quantity,artistName,location);
            showList.add(newShow);
        }

    }

    /**
     * Prints the heading for each show display and the names of each show in proper format using the toString
     * method of the class show.
     * @param a
     */
    public void printList(ArrayList<Show> a){
        System.out.println("Date        Price       Qty       Performer           City");
        System.out.println("-----------------------------------------------------------------");
        for(Show show: a){
            System.out.println(show);
            System.out.println();
        }
    }

    public ArrayList<Show> getShowList() {
        return showList;
    }

    public void setShowList(ArrayList<Show> showList) {
        this.showList = showList;
    }

    /**
     * Let the user input a city, and return all shows in that city in the proper format.
     * @param key
     * @return reordered list of city matches
     */
    public ArrayList<Show> sortByCity(String key) {
        ArrayList<Show> reordered = new ArrayList<>();
        for (int i = 0; i < showList.size(); i++) {
            if (showList.get(i).getLocation().equalsIgnoreCase(key)) {
                reordered.add(showList.get(i));
            }
        }
        return reordered;
    }

    /**
     * Use selection sort and compareTo method to alphabetically (increasing from A-Z) sort artist's last names
     * and return their shows in the correct alpha order.
     * @return
     */
    public ArrayList<Show> alphaSortForward() {
        for (int i = 0; i < showList.size() - 1; i++) {
            //look for the smallest remaining number and get its index
            int minIndex = i;
            for (int j = i + 1; j < showList.size(); j++) {
                String firstCompare = showList.get(j).getArtistName();
                String secondCompare = showList.get(minIndex).getArtistName();
                if (firstCompare.compareTo(secondCompare) < 0) {
                    minIndex = j;
                }
            }
            //swap values at index i and minIndex
            Show temp = showList.get(i);
            showList.set(i, showList.get(minIndex));
            showList.set(minIndex, temp);
        }
        return showList;

    }

    /**
     * Use selection sort to sort artist names from Z-A and return their shows in that order. This time
     * the selection sort will find the greatest value, and swap until sorted.
     * @return
     */
    public ArrayList<Show> alphaSortBackward() {
        for (int i = 0; i < showList.size() - 1; i++) {
            //look for the smallest remaining number and get its index
            int minIndex = i;
            for (int j = i + 1; j < showList.size(); j++) {
                String firstCompare = showList.get(j).getArtistName();
                String secondCompare = showList.get(minIndex).getArtistName();
                if (firstCompare.compareTo(secondCompare) > 0) {
                    minIndex = j;
                }
            }
            //swap values at index i and minIndex
            Show temp = showList.get(i);
            showList.set(i, showList.get(minIndex));
            showList.set(minIndex, temp);
        }
        return showList;

    }

    /**
     * Use insertion sort to sort the prices of different shows from high to low, and return the list
     * in this show order. This time, the insertion sort will check if the of one value is greater than the
     * other and push the highest values to the front.
     * @return
     */
    public ArrayList<Show> priceSortHighToLow(){
        for(int i = 1; i < showList.size(); i++){
            Show valueToInsert = showList.get(i);
            int position = i;
            while(position > 0 && showList.get(position-1).getPrice() < valueToInsert.getPrice()){
                showList.set(position,showList.get(position-1)); //we shift the value next to the value to insert to the right
                position--;
            }
            showList.set(position,valueToInsert);
        }
        return showList;
    }

    /**
     * This uses insertion sort to sort the prices of shows from lowest to highest and print out each
     * show accordingly by returning the list to be  used in the driver. check is valueToIbsert is lower in order to push the
     * lower values to the front.
     * @return
     */
    public ArrayList<Show> priceSortLowToHigh(){
        for(int i = 1; i < showList.size(); i++){
            Show valueToInsert = showList.get(i);
            int position = i;
            while(position > 0 && showList.get(position-1).getPrice() > valueToInsert.getPrice()){
                showList.set(position,showList.get(position-1)); //we shift the value next to the value to insert to the right
                position--;
            }
            showList.set(position,valueToInsert);
        }
        return showList;
    }

}