package U9_Inheritance.lab;

import jdk.internal.util.xml.impl.Input;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkoutDriver {
    public static void main(String[] args) {
        System.out.println("***************************************************");
        System.out.println("**** Welcome to your customized workout plan *****");
        System.out.println("***************************************************");
        Scanner fileIn = new Scanner(System.in);System.out.println("How many weeks would you like to schedule?");
        System.out.println();
        int numWeeks = assignIntWeeks(fileIn);
        System.out.println("Great! Here's your plan for 4 weeks");
        System.out.println();
        WorkoutPlan personal = new WorkoutPlan(numWeeks);
        System.out.println();
        System.out.println("Now it's time to start working out!");
        personal.setCurrWeek(0);
        for(int i = 0; i < numWeeks; i++) {
            System.out.println("Type 'Start' to begin your workouts for the week");
            String start = fileIn.nextLine();
            boolean isStart = false;
            while (isStart == false) {
                if (start.equalsIgnoreCase("start")) {
                    personal.workoutNextWeek();
                    isStart = true;
                } else {
                    System.out.println("Sorry, please enter Start to begin this week's workouts. You can do it!!");
                    start = fileIn.nextLine();
                }
            }
            System.out.println();
            personal.printProgress();
        }
        System.out.println("CONGRATS! YOU HAVE COMPLETED YOUR WORKOUT PLAN! Amazing work and keep up the good work");
        System.out.println("Hope to see you again! BYE!!");

        }


         public static int assignIntWeeks(Scanner fileIn) {
            boolean keepGoing = true;
            int newVal = 0;
            while (keepGoing) {
                try {
                    newVal = fileIn.nextInt();
                    fileIn.nextLine();

                    if (newVal <= 0) {
                        System.out.println("You must input an integer value greater than 0 for the number of weeks ");
                        while (newVal <= 0) {
                            newVal = fileIn.nextInt();
                            fileIn.nextLine();
                        }

                    }
                    keepGoing = false;
                } catch (InputMismatchException e) {
                    System.out.println("Please try again, enter a valid integer");
                    fileIn.nextLine();
                }

            }
             return newVal;
            }






}
