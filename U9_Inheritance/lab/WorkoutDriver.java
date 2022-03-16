package U9_Inheritance.lab;

import jdk.internal.util.xml.impl.Input;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkoutDriver {
    public static void main(String[] args) {
        Scanner fileIn = new Scanner(System.in);
        System.out.println("How many weeks would you like to workout?");
    }

    public
    boolean isValid = 
    try {
        int newVal = fileIn.nextInt();
        if(newVal == 0){
            System.out.println("You must input an integer larger than 0");

        isValid = true;
    } catch (InputMismatchException e) {
        System.out.println("You inputted the incorrect type of value. Make sure to input an integer greater than 0. Try again here:");
    }
}

}
