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
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?\n");
        String userName = in.nextLine();

        System.out.println("Welcome to VENYA'S WONDERFUL TRIVA SHOW");
        System.out.println("We are so happy to have you playing today " + userName);
        System.out.println("Ready,set,go!");
        System.out.println();

        boolean wantsQuestions = true;
        while (wantsQuestions == true && myGame.getNumQuestionsAsked() < 12){
            // ask a random question
            int getQuestion = myGame.getRandomQuestion();
            //collect trivia questions
            Question qs =  myGame.getTriviaQs()[getQuestion];
            System.out.println(qs);
            // get user input
            System.out.println("INPUT A,B,C,OR D");
            String userAnswer = in.nextLine();
            // compare user input to correct answer
            if(userAnswer.equals(qs.getCorrectAnswer())) {
                System.out.println("That's right! The correct answer is " + qs.getCorrectAnswer());
                myGame.setCorrectAnswerStreak(myGame.getCorrectAnswerStreak() + 1);
                //add points
                myGame.updatePoints(true, getQuestion);
                System.out.println("Total Points: " + myGame.getTotalScore());
                System.out.println("Answer Streak: " + myGame.getCorrectAnswerStreak());
            }else{
                System.out.println("Unfortunately that's incorrect. The correct answer is " + qs.getCorrectAnswer());
                myGame.setCorrectAnswerStreak(0);
                //print stats
                myGame.updatePoints(false, getQuestion);
                System.out.println("Total Points: " + myGame.getTotalScore());
                System.out.println("Answer Streak: " + myGame.getCorrectAnswerStreak());
            }
            //Another question?
            Scanner more = new Scanner(System.in);
            System.out.println("Input Yes Or No: Do you want another question?");
            String moreQuestions = more.nextLine(); 
            if(moreQuestions.equalsIgnoreCase("Yes")){
                wantsQuestions = true;
            }else if(moreQuestions.equalsIgnoreCase("No")){
                wantsQuestions = false;
            }else{
            System.out.println("This is not a valid response to the question? Let's try again.");
            System.out.println("Input Yes Or No: Do you want another question?");
            String checkAgain = in.nextLine();




            }
            

        }
        System.out.println("That's the end of the game! Great job");


    }

}
