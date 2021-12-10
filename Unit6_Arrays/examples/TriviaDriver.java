package Unit6_Arrays.examples;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class TriviaDriver{
    public static void main(String[] args) throws FileNotFoundException{
        TriviaGame myGame = new TriviaGame();
        // read in all questions
        myGame.readQuestions();
        //grab users name, and print
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?\n");
        String userName = name.nextLine();

        System.out.println("Welcome to VENYA'S WONDERFUL TRIVA SHOW");
        System.out.println("We are so happy to have you playing today " + userName);
        System.out.println("Ready,set,go!");

        boolean wantsQuestions = true;
        while (wantsQuestions == true){

            // ask a random question
            int getQuestion = myGame.getRandomQuestion();
            //collect trivia questions
            Question qs =  myGame.getTriviaQs()[getQuestion];
            System.out.println(qs);
            // get user input
            Scanner answer = new Scanner(System.in);
            System.out.println("INPUT A,B,C,OR D");
            String userAnswer = answer.nextLine();
            // compare user input to correct answer
            if(userAnswer.equals(qs.getCorrectAnswer())) {
                System.out.println("That's right! The correct answer is " + qs.getCorrectAnswer());
                myGame.setCorrectAnswerStreak(myGame.getCorrectAnswerStreak() + 1);


            }else{

            }
            // announce whether they got it right/wrong, assign points


        }

    }

}
