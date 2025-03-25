import java.util.Scanner;

/**
 * This class runs the main game menu.
 * Lets the user choose between the Guessing Game and Rock-Paper-Scissors.
 * Repeats until the user decides to exit.
 *
 * @author Berk
 * @since 2025-03-25
 */

public class Main {

    /**
     * Entry point of the program.
     * Displays a menu and handles user selection of games.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Game Menu ---");
            System.out.println("1. Play Guessing Game");
            System.out.println("2. Play Rock-Paper-Scissors");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    GuessingGame.play();
                    break;
                case 2:
                    RockPaperScissors.play();
                    break;
                case 3:
                    System.out.println("Thanks for playing. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        } while (choice != 3);
    }
}
