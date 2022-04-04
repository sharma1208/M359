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
            //check for wrong user inputs
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
                    runMethods(numberExecute, uploadFile, keyboardInputs);
                    if (numberExecute == 6) {
                        System.out.println("You have ended the program");
                        keepGoing = false;
                    }

                }

            } catch (NumberFormatException e) {
              //if can't parse to int or double, its a string, which is incorrect, need a new val to input,
                //so runs loop from beginning
                System.out.println("You entered a string, please enter an integer");
                //keyboardInputs.nextLine();

            }

        }

    }

    /**
     * Runs the corresponding methods needed to have the program execute its task of sorting, searching, and matching based
     * on which value is inserted.
     * @param numberExecute
     * @param uploadFile
     * @param keyboardInputs
     */
    public static void runMethods(int numberExecute, TicketMaster uploadFile, Scanner keyboardInputs){
        if (numberExecute == 5) {
            uploadFile.printList(uploadFile.alphaSortForward());
        }
        if (numberExecute == 2) {
            uploadFile.printList(uploadFile.alphaSortBackward());
        }
        if (numberExecute == 3) {
            uploadFile.printList(uploadFile.priceSortHighToLow());
        }
        if (numberExecute == 4) {
            uploadFile.printList(uploadFile.priceSortLowToHigh());
        }
        if (numberExecute == 1) {
            System.out.println("Which city would you like to search by?");
            String loc = keyboardInputs.nextLine();
            uploadFile.printList(uploadFile.sortByCity(loc));

        }
    }
}

