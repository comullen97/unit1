import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class GuessingGame {
    private int secretNumber;
    private int numGuesses;
    private String playerName;

    public GuessingGame(String playerName) {
        Random rand = new Random();
        secretNumber = rand.nextInt(100) + 1;
        numGuesses = 0;
        this.playerName = playerName;
    }

    public void play() {
        System.out.println("Hi, " + playerName + "! I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess my number.");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Your guess? ");
            int guess;
            try {
                guess = scanner.nextInt();
                if (guess < 1 || guess > 100) {
                    System.out.println(guess + " is not a valid number, try again.");
                    continue;
                }
            } catch (InputMismatchException e) {
                String badInput = scanner.next(); 
                System.out.println("That's not an integer, try again.");
                continue;
            }

            numGuesses++;

            if (guess == secretNumber) {
                System.out.println("Well done, " + playerName + "! You found my number in " + numGuesses + " tries!");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low, try again.");
            } else {
                System.out.println("Your guess is too high, try again.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing Game!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String playerName = scanner.nextLine();

        GuessingGame game = new GuessingGame(playerName);
        game.play();

        scanner.close();
    }
}
