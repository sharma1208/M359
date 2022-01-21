package Unit7ArrayLists.examples;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException{
        File myFile = new File("showData.txt");
        Scanner fileIn = new Scanner(myFile);
        TicketMaster uploadFile = new TicketMaster(fileIn);


        System.out.println("Date        Price       Qty       Performer           City");
        System.out.println("-----------------------------------------------------------------");
        uploadFile.printList(uploadFile.getShowList());

        Scanner keyboardInputs = new Scanner(System.in);
        boolean notQuit = true;
        while(notQuit) {
            System.out.println("Pick one of the options below by inputting the number that correspond to the action");
            System.out.println("1. Sort A-Z");
            System.out.println("2. Sort Z-A");
            System.out.println("3. Sort price high-low");
            System.out.println("4. Sort price low-high");
            System.out.println("5. Search by city");
            System.out.println("6. Quit");
            try{
                int numberExecute = keyboardInputs.nextInt();

            }
            keyboardInputs.nextLine();

        }



    }
}
