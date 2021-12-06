package Unit6_Arrays.examples;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class TriviaGame {
    private int correctAnswerStreak;
    private Question[] TriviaQs;
    private int numQuestions;

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
    public String getRandomQuestion(){
        int randomIndex = (int)(Math.random() * TriviaQs.length) + 0;
    }




}
