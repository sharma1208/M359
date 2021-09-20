package Unit3_Boolean.examples;

public class CompoundBooleanExamples {
    public static void main(String[] args) {
        String day = "Monday";
        int numAssignments = 2;

        //1. Alice loves video games! She plays video games it's Saturday
        //or if she doesn't have any homework
        //Print out either "Yay, video games" or "I guess I'll have to wait;("
        // to say or: ||
        // for and: &&
        if(day.equals("Saturday") || numAssignments == 0){
            System.out.println("Yay,video games!");

        } else{
            System.out.println("I guess I'll have to wait :(");
        }


        //2. Bob only goes to coding club if its monday and if the number of assignments is less than or equal to.
        //print either  "Yay coding club!" or "Today is a sad day :("
        if(day.equals("Monday") && numAssignments <= 2){
            System.out.println("Yay coding club!");
        } else{
            System.out.println("Today is a sad day :(");
        }

        //Carol always exercise on the weekends. On the weekdays she exercises with 80% probability if she has no homework,
        //but only 30% probability if she has any homework. Print out "exercise" or "no exercise"
        if(day.equals("Saturday") || day.equals("Sunday")){
            System.out.println("Exercise");
        } else {
            int rndNumber = (int)(Math.random() * 10) + 1;
            if( (rndNumber <= 8 && numAssignments == 0)|| (rndNumber <= 3 && numAssignments >= 1) ){
                System.out.println("Exercise");
            }else{
                System.out.println("No Exercise");
            }
        }
         

    }
}
