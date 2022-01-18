package Unit7ArrayLists.examples;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TicketMaster {
    private ArrayList<Show> showList = new ArrayList<Show>();

    public TicketMaster(Scanner readIn) throws FileNotFoundException {
        readQuestions(readIn);
    }

    public void readQuestions(Scanner readIn) throws FileNotFoundException{
        while(readIn.hasNextLine()) {
            String date = readIn.next();
            double price = readIn.nextDouble();
            int quantity = readIn.nextInt();
            String temp = readIn.nextLine();
            String artistName = temp.substring(0, temp.indexOf(','));
            String location = temp.substring(temp.indexOf(',') + 1);

            Show newShow = new Show(date,price,quantity,artistName,location);
            showList.add(newShow);
        }

        System.out.println(showList);
    }
}

