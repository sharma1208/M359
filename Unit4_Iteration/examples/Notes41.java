package Unit4_Iteration.examples;
import java.util.Scanner;

public class Notes41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isDone = false;
        int totalScore = 0;
        int totalNums = 0;


        while(isDone == false){
            //asl user if they have a number they want to enter
            System.out.println("Do you have a score to enter? (Y or N?): ");
            String reply = input.nextLine();
            if(reply.equalsIgnoreCase("y")){
                System.out.println("Input your score");
                int score = input.nextInt();

                totalScore += score;
                totalNums++;
                input.nextLine();

            }else{
                isDone = true;
            }
        }

        double avg = (double) (totalScore/totalNums);
        System.out.println(avg);

    }

}
