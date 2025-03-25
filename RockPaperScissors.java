import java.util.Random;
import java.util.Scanner;

/**
 * This class implements the Rock-Paper-Scissors game.
 * The user selects an option and plays against the computer.
 * The game displays who wins and allows the user to play multiple times.
 *
 * @author Berk
 * @since 2025-03-25
 */

public class RockPaperScissors {

    /**
     * Starts the Rock-Paper-Scissors game.
     * No parameters.
     * No return value.
     * The method continues to prompt the user until they choose to exit.
     */
    public static void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Paper", "Scissors", "Rock"};

        boolean playAgain = true;

        while (playAgain) {
            System.out.print("Enter your choice: 1. paper, 2. scissors, 3. rock: ");
            int userChoice = scanner.nextInt();

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            int computerChoice = random.nextInt(3) + 1;
            System.out.println("Computer chose: " + choices[computerChoice - 1]);

            if (userChoice == computerChoice) {
                System.out.println("It is a tie!");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                    (userChoice == 2 && computerChoice == 1) ||
                    (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.print("Do you want to play again? (Y/N): ");
            String again = scanner.next().trim().toUpperCase();
            playAgain = again.equals("Y");
        }
    }
}
