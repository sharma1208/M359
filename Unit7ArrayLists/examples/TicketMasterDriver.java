package Unit7ArrayLists.examples;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;
public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("showData.txt");
        Scanner fileIn = new Scanner(myFile);
        TicketMaster uploadFile = new TicketMaster(fileIn);


        uploadFile.printList(uploadFile.getShowList());

        Scanner keyboardInputs = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("Pick one of the options below by inputting the number that correspond to the action");
            System.out.println("1. Search by city");
            System.out.println("2. Sort Z-A");
            System.out.println("3. Sort price high-low");
            System.out.println("4. Sort price low-high");
            System.out.println("5. Sort A-Z");
            System.out.println("6. Quit");
            try {
                String input = keyboardInputs.nextLine();
                //int numberExecute = 0;

                if (input.indexOf(".") != -1) {

                    double doubleExecute = Double.parseDouble(input);
                    System.out.println("You have entered a decimal, please enter an integer");
                } else {
                    int numberExecute = Integer.parseInt(input);
                    if (numberExecute > 6 || numberExecute < 1) {

                        System.out.println("Integer out of range, enter new integer");
                        //keyboardInputs.nextLine();
                    }
                    if (numberExecute == 5) {
                        uploadFile.printList(alphaSortForward(uploadFile.getShowList()));
                    }
                    if(numberExecute == 2){
                        uploadFile.printList(alphaSortBackward(uploadFile.getShowList()));
                    }
                    if(numberExecute == 3){
                        uploadFile.printList(priceSortHighToLow(uploadFile.getShowList()));
                    }
                    if(numberExecute == 4){
                        uploadFile.printList(priceSortLowToHigh(uploadFile.getShowList()));
                    }
                    if (numberExecute == 1) {
                        System.out.println("Which city would you like to search by?");
                        String loc = keyboardInputs.nextLine();
                        uploadFile.printList(sortByCity(uploadFile.getShowList(), loc));

                    }
                    if (numberExecute == 6) {
                        System.out.println("You have ended the program");
                        keepGoing = false;
                    }
                }


            } catch (NumberFormatException e) {

                System.out.println("You entered a string, please enter an integer");
                //keyboardInputs.nextLine();

            }

        }

    }

    public static ArrayList<Show> sortByCity(ArrayList<Show> info, String key) {
        ArrayList<Show> reordered = new ArrayList<>();
        for (int i = 0; i < info.size(); i++) {
            if (info.get(i).getLocation().equals(key)) {
                reordered.add(info.get(i));
            }
        }
        return reordered;
    }

    public static ArrayList<Show> alphaSortForward(ArrayList<Show> info) {
        for (int i = 0; i < info.size() - 1; i++) {
            //look for the smallest remaining number and get its index
            int minIndex = i;
            for (int j = i + 1; j < info.size(); j++) {
                String firstCompare = info.get(j).getArtistName();
                String secondCompare = info.get(minIndex).getArtistName();
                if (firstCompare.compareTo(secondCompare) < 0) {
                    minIndex = j;
                }
            }
            //swap values at index i and minIndex
            Show temp = info.get(i);
            info.set(i, info.get(minIndex));
            info.set(minIndex, temp);
        }
        return info;

    }

    public static ArrayList<Show> alphaSortBackward(ArrayList<Show> info) {
        for (int i = 0; i < info.size() - 1; i++) {
            //look for the smallest remaining number and get its index
            int minIndex = i;
            for (int j = i + 1; j < info.size(); j++) {
                String firstCompare = info.get(j).getArtistName();
                String secondCompare = info.get(minIndex).getArtistName();
                if (firstCompare.compareTo(secondCompare) > 0) {
                    minIndex = j;
                }
            }
            //swap values at index i and minIndex
            Show temp = info.get(i);
            info.set(i, info.get(minIndex));
            info.set(minIndex, temp);
        }
        return info;

    }

    public static ArrayList<Show> priceSortHighToLow(ArrayList<Show> list){
        for(int i = 1; i < list.size(); i++){
            Show valueToInsert = list.get(i);
            int position = i;
            while(position > 0 && list.get(position-1).getPrice() < valueToInsert.getPrice()){
                list.set(position,list.get(position-1)); //we shift the value next to the value to insert to the right
                position--;
            }
            list.set(position,valueToInsert);
        }
        return list;
        }

    public static ArrayList<Show> priceSortLowToHigh(ArrayList<Show> list){
        for(int i = 1; i < list.size(); i++){
            Show valueToInsert = list.get(i);
            int position = i;
            while(position > 0 && list.get(position-1).getPrice() > valueToInsert.getPrice()){
                list.set(position,list.get(position-1)); //we shift the value next to the value to insert to the right
                position--;
            }
            list.set(position,valueToInsert);
        }
        return list;
    }
    }





