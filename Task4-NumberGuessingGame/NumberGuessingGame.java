import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;  
        int guess, attempts = 0;

        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == number) {
                System.out.println(" Correct! The number was " + number + ". You guessed it in " + attempts + " attempts.");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

        } while (guess != number);

        sc.close();
    }
}







