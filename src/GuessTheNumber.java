import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random number = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = number.nextInt(20) + 1;
        int guesses = 0;

        System.out.println("Guess a number between 1 and 20: ");

        while (true) {
            int playerGuess = scanner.nextInt();
            guesses++;
            if (playerGuess < 1 || playerGuess > 20) {
                System.out.println("Invalid number. Enter a number between 1 and 20.");
            } else if (secretNumber < playerGuess) {
                System.out.println("Too high! Guess again:");
            } else if (secretNumber > playerGuess) {
                System.out.println("Too low! Guess again:");
            } else if (secretNumber == playerGuess) {
                System.out.println("Correct number!");
                System.out.println("You guessed the secret number in " + guesses + " guesses!");
                break;
            }
        }
        scanner.close();
    }
}