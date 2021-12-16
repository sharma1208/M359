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
    private int numRight = 0;
    public TriviaGame() {
        correctAnswerStreak = 0;
    }
    /**
     * Reads in each line from the trivia questions file to form one question,
     puts that question into an array of questions,
     * and then does the same for the rest of the questions to fill TriviaQs
     with its full question count
     * @throws FileNotFoundException
     */
    public void readQuestions() throws FileNotFoundException{
        File myFile = new File("triviaQuestions.txt");
        Scanner fileIn = new Scanner (myFile);
        //number of question
        numQuestions = fileIn.nextInt();
        fileIn.nextLine();
        TriviaQs = new Question[numQuestions];
        //reads in file and adds to question array until all questions are read
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
                Question oneQuestion = new
                        Question(question,answer1,answer2,answer3,answer4,correctAnswer,numPoints);
                TriviaQs[i] = oneQuestion;
            }
        }
    }
    /**
     * returns a random index for the code to present a user with an unused
     * question in the tester, does so by marking
     * when questions are used and using math.random to check random indices
     * @return int
     */
    public int getRandomQuestion(){
        int randomIndex = (int)(Math.random() * TriviaQs.length) + 0;
    //if the question hasn't been asked, set the question at that index to be true now that it will be asked
        if(TriviaQs[randomIndex].getQuestionAsked() == false){
            TriviaQs[randomIndex].setQuestionAsked(true);
        }else{
    //while the question has already been used, find anotherindex, and then set that value to used by saying "false"
            while (TriviaQs[randomIndex].getQuestionAsked() == true) {
                randomIndex = (int) (Math.random() * TriviaQs.length) + 0;
            } TriviaQs[randomIndex].setQuestionAsked(true);
        } return randomIndex;
    }
    /**
     * changes total score to add or subtract updated points and prints
     gain/lost based on boolean and index
     * @param gained to indicate adding or subtracting and what print
     * statements to run
     * @param questionIndex to access the points of the specific question using
     * the index obtained from getrandomQuestion
     */
    public void updatePoints(boolean gained, int questionIndex) {
        int val = TriviaQs[questionIndex].getPointValue();
        if (gained == true) {
            totalScore += val;
            System.out.println("You gained " + val + " points");
        } else {
            totalScore -= val;
            System.out.println("You lost " + val + " points");
        }
    }
    /**
     * has the computer pick a random index from 0-4 to pick a letter A-D, user
     * inputs their own letter, and
     * if user got it right and the computer didn't,the users total score goes
     * up by 3000 points,
     * and if both guess the same no matter if its right or wrong, no one gets
     * points. If the computer wins,
     * nothing happens either, but that means that the user doesn't get points.
     * @param guess user input of their letter choice
     */
    public void computerAndLuck(String guess){
        String correctAnswer = "B";
        System.out.println("Loading...");
        String[] answerPossibilities = {"A", "B", "C", "D"};
        int computerIndex = (int)(Math.random() * 4) + 0;
        if((answerPossibilities[computerIndex].equals(correctAnswer) && guess.equals(correctAnswer)) || (answerPossibilities[computerIndex].equals(correctAnswer) ==
                false && guess.equalsIgnoreCase(correctAnswer) == false)){
            System.out.println("Tie. No extra points.");
        }else if(answerPossibilities[computerIndex].equals(correctAnswer) && guess.equalsIgnoreCase(correctAnswer) == false){
            System.out.println("Computer wins the random letter guess.");
        }else{
            System.out.println("You guessed right! must be fun to get extra points");
                    totalScore += 3000;
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
    public int getNumRight() {
        return numRight;
    }
    public void setNumRight(int numRight) {
        this.numRight = numRight;
    }
}