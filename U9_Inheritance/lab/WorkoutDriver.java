package U9_Inheritance.lab;

import jdk.internal.util.xml.impl.Input;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkoutDriver {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to this workout simulator!");
        Scanner fileIn = new Scanner(System.in);
        System.out.println("How many weeks would you like to workout?");
        int numWeeks = assignIntWeeks(fileIn);


        }

        public static int assignIntWeeks(Scanner fileIn){
           boolean isValid = false;
           int newVal = 0;
           while(isValid == false) {
               try {
                   newVal = fileIn.nextInt();
                   fileIn.nextLine();
                   isValid = true;
                   if(newVal <= 0){
                       System.out.println("You must input an integer value greater than 0 for the number of weeks ");
                       while(newVal <= 0){
                           newVal = fileIn.nextInt();
                           fileIn.nextLine();
                       }
                   }

               } catch (InputMismatchException e) {
                   System.out.println("Sorry this doesn't work because you didn't input an integer. Try again.");
               }
           }
           return newVal;
        }




}
