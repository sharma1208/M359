package Unit6_Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("courseData.txt");
        Scanner fileIn = new Scanner(myFile);

        //This should read in vlaming
        String teacherName = fileIn.nextLine();
        System.out.println(teacherName);

        String className = fileIn.nextLine();
        System.out.println(className);

        int period = fileIn.nextInt();
        System.out.println(period);
        fileIn.nextLine(); //Dummy read to go to next line

        String grade = fileIn.nextLine();
        System.out.println(grade);
    }
}
