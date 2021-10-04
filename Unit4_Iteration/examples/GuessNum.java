package Unit4_Iteration.examples;
import java.util.Scanner;
public class GuessNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rndNum = (int)(Math.random() * 10) + 1;
        boolean guessedNum = false;
        int numGuesses = 0;

        while(guessedNum == false){
            System.out.println("Guess a number 1-10");
            int guess = input.nextInt();
            if(rndNum
            }
        }
    }
}
