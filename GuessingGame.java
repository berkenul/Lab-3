import java.util.Random;
import java.util.Scanner;

/**
 * This class contains the number guessing game logic.
 * The user tries to guess a randomly generated number between 1 and 100.
 * The user has 5 chances per round and receives feedback after each guess.
 *
 * @author Berk
 * @since 2025-03-25
 */

public class GuessingGame {

    // Constants
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final int MAX_TRIES = 5;

    /**
     * Starts the Number Guessing Game.
     * No parameters.
     * No return value.
     * Runs the guessing game loop until the user chooses not to play again.
     */
    public static void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int number = random.nextInt(MAX - MIN + 1) + MIN;
            int tries = MAX_TRIES;
            boolean guessed = false;

            System.out.println("I'm thinking of a number between " + MIN + " and " + MAX + ".");
            System.out.print("Guess what it is. You have " + MAX_TRIES + " tries: ");

            while (tries > 0) {
                int guess = scanner.nextInt();

                if (guess == number) {
                    System.out.println("You got it!");
                    guessed = true;
                    break;
                } else if (guess < number) {
                    tries--;
                    System.out.print("Nope! Too low. ");
                } else {
                    tries--;
                    System.out.print("Nope! Too high. ");
                }

                if (tries > 0) {
                    System.out.print("Try again (" + tries + " " + (tries == 1 ? "try" : "tries") + " left): ");
                }
            }

            if (!guessed) {
                System.out.println("Nope! You lost. The number was " + number);
            }

            System.out.print("Do you want to play again? (Y/N): ");
            String answer = scanner.next().trim().toUpperCase();
            playAgain = answer.equals("Y");
        }
    }
}
