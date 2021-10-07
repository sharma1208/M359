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
            if(rndNum > guess){
                System.out.println("You're guess is too low");
                numGuesses++;
            } else if(rndNum < guess){
                System.out.println("you're guess is too high");
                numGuesses++;
            } else{
                numGuesses++;
                System.out.println("You're guess was correct! It took: " + numGuesses + "guesses for you to get it right!");
            }
        }
            }
}
