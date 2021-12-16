package Unit6_Arrays.examples;

public class Question {
    private String questionText;
    private String answerChoiceA;
    private String answerChoiceB;
    private String answerChoiceC;
    private String answerChoiceD;
    private String correctAnswer;
    private int pointValue;
    private boolean questionAsked;

    public Question(String questionText, String answerChoiceA,
                    String answerChoiceB, String answerChoiceC, String answerChoiceD, String correctAnswer, int pointValue) {
        this.questionText = questionText;
        this.answerChoiceA = answerChoiceA;
        this.answerChoiceB = answerChoiceB;
        this.answerChoiceC = answerChoiceC;
        this.answerChoiceD = answerChoiceD;
        this.correctAnswer = correctAnswer;
        this.pointValue = pointValue;
        this.questionAsked = false;
    }

    /**
     * allows us to print each question to display to the user before they choose an answer choice. They now know what choices
     * they have and can see it displayed in the output, helping with clear format
     * @return
     */
    public String toString(){
        String output = "Question: " + questionText + "\n";
        output += "Point Value: " + pointValue + "\n";
        output += "Answer choices: \n" + answerChoiceA + " \n" + answerChoiceB + " \n" + answerChoiceC + " \n" + answerChoiceD;
        return output;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getAnswerChoiceA() {
        return answerChoiceA;
    }

    public String getAnswerChoiceB() {
        return answerChoiceB;
    }

    public String getAnswerChoiceC() {
        return answerChoiceC;
    }

    public String getAnswerChoiceD() {
        return answerChoiceD;
    }

    public int getPointValue() {
        return pointValue;
}

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean getQuestionAsked(){
        return questionAsked;
    }

    public void setQuestionAsked(boolean val){
        questionAsked = val;
    }

}
