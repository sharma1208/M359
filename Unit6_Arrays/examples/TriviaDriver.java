package Unit6_Arrays.examples;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class TriviaDriver{
    public static void main(String[] args) throws FileNotFoundException{
        TriviaGame myGame = new TriviaGame();
        myGame.readQuestions();
        //grab users name
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?\n");
        String userName = name.nextLine();

        System.out.println("Welcome to VENYA'S WONDERFUL TRIVA SHOW");
        System.out.println("We are so happy to have you playing today " + userName);
        System.out.println("Ready,set,go!");

        while (true){

            // ask a random question

            // get user input

            // compare user input to correct answer

            // announce whether they got it right/wrong, assign points


        }

    }

}
