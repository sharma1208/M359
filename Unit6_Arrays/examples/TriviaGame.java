package Unit6_Arrays.examples;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class TriviaGame {
    private int correctAnswerStreak;
    private Question[] TriviaQs;
    private int numQuestions;
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

        Question[] TriviaQs = new Question[numQuestions];

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
                System.out.println(oneQuestion);
                TriviaQs[i] = oneQuestion;
            }
        }

    }
    public int getRandomQuestion(){
            int randomIndex = (int)(Math.random() * TriviaQs.length) + 0;
            if(TriviaQs[randomIndex].getQuestionAsked() == false){
                 TriviaQs[randomIndex].setQuestionAsked(true);
            }else{
                while (TriviaQs[randomIndex].getQuestionAsked() == true) {
                    randomIndex = (int) (Math.random() * TriviaQs.length) + 0;
                }
                TriviaQs[randomIndex].setQuestionAsked(true);
            }
            return randomIndex;
    }

    public int updatePoints(boolean gained, int questionIndex){
        if(gained == true) {
            int val = TriviaQs[questionIndex].getPointValue();
            totalScore += val;
            System.out.println("You gained " + val);
        }



































































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
}
