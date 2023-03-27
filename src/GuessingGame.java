import java.util.Scanner;

public class GuessingGame {
    private int secretNumber;
    private int numGuesses;
    private String playerName;

    public GuessingGame(String playerName) {
        secretNumber = (int) (Math.random() * 100) + 1;
        numGuesses = 0;
        this.playerName = playerName;
    }

    public void play() {
        System.out.println("Hi, " + playerName + "! I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess my number.");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Your guess? ");
            int guess = scanner.nextInt();
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
