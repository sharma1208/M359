package Unit6_Arrays.examples;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        //trivia game object
        TriviaGame myGame = new TriviaGame();
        // read in all questions
        myGame.readQuestions();
        //grab users name, and print
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?\n");
        String userName = in.nextLine();
        // introduction and instructions
        System.out.println("Welcome to VENYA'S WONDERFUL TRIVA SHOW");
        System.out.println("We are so happy to have you playing today " + userName);
        System.out.println("Instructions: A question will pop up on the screen and you must choose A,B,C, or D as a response. \n" +
                "Each question has a point value, and you will gain and lose points as you answer the questions.");
        System.out.println("Ready,set,go!");
        System.out.println(); //formatting purposes

        //while the user wants more questions and the number of questions is less than the total, keep running the gameplay
        boolean wantsQuestions = true;
        while (wantsQuestions == true && myGame.getNumQuestionsAsked() < myGame.getNumQuestions()) {
            // get a random index
            int getQuestion = myGame.getRandomQuestion();
            //access the question at said index in the array storing question, and increase questions
            Question qs = myGame.getTriviaQs()[getQuestion];
            myGame.setNumQuestionsAsked(myGame.getNumQuestionsAsked() + 1);
            System.out.println(qs);
            // get user's answer
            System.out.println("INPUT A,B,C,OR D");
            String userAnswer = in.nextLine();
            // compare user input to correct answer
            if (userAnswer.equalsIgnoreCase(qs.getCorrectAnswer())) {
                System.out.println("That's right! The correct answer is " + qs.getCorrectAnswer());
                //add to streak and num questions right overall
                myGame.setCorrectAnswerStreak(myGame.getCorrectAnswerStreak() + 1);
                myGame.setNumRight(myGame.getNumRight() + 1);
                //add to total score and print how many points gained/lost
                myGame.updatePoints(true, getQuestion);
                //print stats
                System.out.println("CURRENT STATS:");
                System.out.println("Total Points: " + myGame.getTotalScore());
                System.out.println("Answer Streak: " + myGame.getCorrectAnswerStreak());
                System.out.println(); //formatting
            } else {
                System.out.println("Unfortunately that's incorrect. The correct answer is " + qs.getCorrectAnswer());
                myGame.setCorrectAnswerStreak(0);
                //print stats
                myGame.updatePoints(false, getQuestion); //updates total Score too
                System.out.println("CURRENT STATS:");
                System.out.println("Total Points: " + myGame.getTotalScore());
                System.out.println("Answer Streak: " + myGame.getCorrectAnswerStreak());
                System.out.println(); //formatting
            }

            //if the amount of questions asked is less than the total, ask the user if they want another question. If they input
            //an invalid response, keep running until it indicates a correct response of yes or no so the loop will break.
            if (myGame.getNumQuestionsAsked() < myGame.getNumQuestions()) {
                while (true) {
                    System.out.println("Input Yes Or No: Do you want another question?");
                    String moreQuestions = in.nextLine();

                    if (moreQuestions.equalsIgnoreCase("Yes")) {
                        wantsQuestions = true;
                        break;
                    } else if (moreQuestions.equalsIgnoreCase("No")) {
                        wantsQuestions = false;
                        break;
                    } else {
                        System.out.println("This is not a valid response to the question. Let's try again.");
                    }
                }
            }
        }


        double getPercentage = ((double) myGame.getNumRight() / myGame.getNumQuestionsAsked()) * 100;
        //extra function that creates a toss up for extra points at the end of the challenge.
        if(getPercentage > 80.0 && myGame.getNumQuestionsAsked() > 10){
            System.out.println(" The game is over! BUT WAIT! You did so well that \n you get an opportunity to" +
                    "play against the computer in this final round for \n 3000 points! But this time you must submit an" +
                    "answer without seeing the question! Game of luck:) \n Both you and the computer will pick a \n" + " letter A-D" +
                    "and if only you guess the right letter, you get points, otherwise, you lose. ");
            System.out.println();
            System.out.println("Now input A, B, C, or D");
            String luckyGuess = in.nextLine();
            myGame.computerAndLuck(luckyGuess);

        }else{
            System.out.println("That's the end of the game. Sadly, you weren't cool enough to play the game of luck against the computer and win more " +
                    "points. Sucks for you");

        }
        //print out end of game info
        System.out.println(); //formatting
        System.out.println("END OF GAME STATS: ");
        System.out.println("Total Points Scored: " + myGame.getTotalScore());
        System.out.println("You got " + myGame.getNumRight() + " questions correct! Out of " + myGame.getNumQuestionsAsked());
        System.out.println("Percentage Correct: " + getPercentage + " %");

    }
}
