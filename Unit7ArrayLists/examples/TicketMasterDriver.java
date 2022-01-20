package Unit7ArrayLists.examples;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException{
        File myFile = new File("showData.txt");
        Scanner fileIn = new Scanner(myFile);
        TicketMaster uploadFile = new TicketMaster(fileIn);

      //  System.out.println("Date\t\tPrice\t\tQty\t\t Performer\t\t\t City");
        System.out.println("Date        Price       Qty       Performer           City");
        System.out.println("-----------------------------------------------------------------");
        uploadFile.printList(uploadFile.getShowList());

    }
}
