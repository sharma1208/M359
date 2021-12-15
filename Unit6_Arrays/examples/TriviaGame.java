package Unit6_Arrays.examples;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class TriviaGame {
    private int correctAnswerStreak;
    private Question[] TriviaQs;
    private int numQuestions;
    private int numQuestionsAsked = 0;
    private int totalScore = 0;

    public TriviaGame()  {
        correctAnswerStreak = 0;

    }

    public void readQuestions() throws FileNotFoundException{
        File myFile = new File("triviaQuestions.txt");
        Scanner fileIn = new Scanner (myFile);
        // number of question
        numQuestions = fileIn.nextInt();
        fileIn.nextLine();

        TriviaQs = new Question[numQuestions];

        while(fileIn.hasNextLine()){


            for(int i = 0; i < numQuestions; i++) {
                String question = fileIn.nextLine();

                int numPoints = fileIn.nextInt();
                fileIn.nextLine();

                String answer1 = fileIn.nextLine();
                String answer2 = fileIn.nextLine();
                String answer3 = fileIn.nextLine();
                String answer4 = fileIn.nextLine();
                String correctAnswer = fileIn.nextLine();

                Question oneQuestion = new Question(question,answer1,answer2,answer3,answer4,correctAnswer,numPoints);
                TriviaQs[i] = oneQuestion;
            }
        }

    }
    public int getRandomQuestion(){
            int randomIndex = (int)(Math.random() * TriviaQs.length) + 0;
            if(TriviaQs[randomIndex].getQuestionAsked() == false){
                 TriviaQs[randomIndex].setQuestionAsked(true);
                 numQuestionsAsked++;
            }else{
                while (TriviaQs[randomIndex].getQuestionAsked() == true) {
                    randomIndex = (int) (Math.random() * TriviaQs.length) + 0;
                    numQuestionsAsked++;
                }
                TriviaQs[randomIndex].setQuestionAsked(true);
            }
            return randomIndex;
    }

    public void updatePoints(boolean gained, int questionIndex){
        int val = TriviaQs[questionIndex].getPointValue();
        if(gained == true) {
            totalScore += val;
            System.out.println("You gained " + val + " points");
        }else{
            totalScore -= val;
            System.out.println("You lost " + val + " points");
        }
        }

    public int getCorrectAnswerStreak() {
        return correctAnswerStreak;
    }

    public void setCorrectAnswerStreak(int correctAnswerStreak) {
        this.correctAnswerStreak = correctAnswerStreak;
    }

    public Question[] getTriviaQs() {
        return TriviaQs;
    }

    public void setTriviaQs(Question[] triviaQs) {
        TriviaQs = triviaQs;
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getNumQuestionsAsked() {
        return numQuestionsAsked;
    }

    public void setNumQuestionsAsked(int numQuestionsAsked) {
        this.numQuestionsAsked = numQuestionsAsked;
    }
}
