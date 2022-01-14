package Unit7ArrayLists.examples;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TicketMaster {
    private ArrayList<Show> showList = new ArrayList<Show>();

    public TicketMaster(Scanner readIn) {
        readQuestions(readIn);
    }

    public void readQuestions(Scanner readIn){
        String date = readIn.next();
        int price = readIn.nextInt();
        int quantity = readIn.nextInt();
        String temp = readIn.nextLine();
        String artistName = temp.substring(0, temp.indexOf(','));
        
    }
}

