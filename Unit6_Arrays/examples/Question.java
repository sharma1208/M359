package Unit6_Arrays.examples;

public class Question {
    private String questionText;
    private String answerChoiceA;
    private String answerChoiceB;
    private String answerChoiceC;
    private String answerChoiceD;
    private int pointValue;

    public Question(String questionText, String answerChoiceA, String answerChoiceB, String answerChoiceC, String answerChoiceD, int pointValue) {
        this.questionText = questionText;
        this.answerChoiceA = answerChoiceA;
        this.answerChoiceB = answerChoiceB;
        this.answerChoiceC = answerChoiceC;
        this.answerChoiceD = answerChoiceD;
        this.pointValue = pointValue;
    }

    public String toString(){
        String output = "Question: " + questionText + "\n";
        output += "Point Value: " + pointValue;
        output += "Answer choices: " + answerChoiceA + "\n " + answerChoiceB + " \n" + answerChoiceC + " \n" + answerChoiceD;
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
}
