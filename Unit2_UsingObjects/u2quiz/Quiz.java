package Unit2_UsingObjects.u2quiz;

public class Quiz
{

    // *** WRITE CODE HERE ***
    // Part A
    // Create instance variables for the quiz name, number of MC's,
    // and extra credit status
    private String quizName;
    private int mcNum;
    private boolean hasExtraCredit;


    // *** WRITE CODE HERE ***
    // Part B
    // Create a default Quiz constructor that sets the name
    // to "M359 Pop Quiz", has 3 MC's, and offers no extra credit
    public Quiz(){
        quizName = "M359 Pop Quiz";
        mcNum = 3;
        hasExtraCredit = false;
    }


    // *** WRITE CODE HERE ***
    // Part C
    // Create a full Quiz constructor that accepts each instance
    // variable as a parameter
    public Quiz(String aQuizName, int numQuestions, boolean extraC){
        quizName = aQuizName;
        mcNum= numQuestions;
        hasExtraCredit = extraC;
    }


    /*
     / *** WRITE CODE HERE ***
     / Part D
     / Create a printInfo method that prints a nicely formatted
     / summary to the console with the following information:
     /      QUIZ NAME
     /          Number MC's:    #
     /          Has EC:         true/false
     */

    public void printInfo(){
        System.out.println(quizName.toUpperCase());
        System.out.println("\t Number MC's:\t" + mcNum);
        System.out.println("\t Has EC:\t" + hasExtraCredit);
    }


    // *** WRITE CODE HERE ***
    // Part E
    // Create an addMC method that accepts the number of MC questions
    // you are adding to this quiz as an input parameter, and updates
    // an appropriate instance variable.  This method does not return
    // anything

    public void addMC(int numQuestions){
        mcNum += numQuestions;
    }



    // *** WRITE CODE HERE ***
    // Part F
    // Create a calcExtraCredit method that returns a random integer
    // between the range of [2,6]

    public int calcExtraCredit(){
        int randomInt = (int)(Math.random() * 5) + 2;
        return randomInt;
    }

    // *** WRITE CODE HERE ***
    // Part G
    // Create a calcTotal method that accepts the point value for
    // each MC on the quiz and returns the total point value of quiz
    public int calcTotal(int pointVal){
        int mcTotals = pointVal * mcNum;
        return mcTotals;
    }


    // *** WRITE CODE HERE ***
    // Part H
    // Create all getter and setter methods
    public String getQuizName(){
        return quizName;
    }
    public void setQuizName(String quizName1){
        quizName = quizName1;
    }

    public int getMcNum(){
        return mcNum;
    }
    public void setMcNum(int mcNum1){
        mcNum = mcNum1;
    }

    public boolean getHasExtraCredit(){
        return hasExtraCredit;
    }

    public void setHasExtraCredit(boolean extra){
        hasExtraCredit = extra;
    }

    // *** EXTRA CREDIT ***
    // Create a method named returnLastName that accepts a single parameter
    // (in the form of "FirstName LastName") and returns only the last name
    // Ex:  returnLastName("Mark Langer") would return "Langer"



}
