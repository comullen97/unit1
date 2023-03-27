import java.util.Scanner;

public class MarsExpedition {
    private String name;
    private int teamSize;
    private String snack;
    private String vehicle;

    public MarsExpedition() {
        Scanner input = new Scanner(System.in);

        System.out.println("Expedition prep program starting...");
        System.out.println("Booting up...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ready");

        System.out.print("Hi, what's your name? ");
        name = input.nextLine();

        System.out.println("Welcome, " + name + "!");
        System.out.print("Are you ready to head out into the new world? Type Y or N: ");
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }

        System.out.print("How many people do you want on your team? ");
        int numPeople = input.nextInt();
        if (numPeople > 2) {
            System.out.println("That's way too many people. We can only send 2 more members.");
            teamSize = 2;
        } else {
            teamSize = numPeople;
        }

        input.nextLine(); // progress past newline

        System.out.print("You are allowed to bring one snack with you. What do you want to bring? ");
        snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing " + snack + " with you.");

        System.out.println("Here is a list of vehicles to choose from:");
        System.out.println("A. Rover");
        System.out.println("B. Clyde the horse");
        System.out.println("C. Mars buggy");
        System.out.print("Which vehicle do you want to use? ");
        String vehicleLetter = input.nextLine();
        switch (vehicleLetter.toUpperCase()) {
            case "A":
                vehicle = "Rover";
                break;
            case "B":
                vehicle = "Clyde the horse";
                break;
            case "C":
                vehicle = "Mars buggy";
                break;
            default:
                System.out.println("Invalid choice, defaulting to Rover.");
                vehicle = "Rover";
                break;
        }

        System.out.println("Thank you, " + name + ". Your team of " + teamSize + " and your " + snack + " snack will be using the " + vehicle + " vehicle.");
        System.out.println("Launching in 10... 9... 8... 7... 6... 5... 4... 3... 2... 1...");
        input.close();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Mars Expedition Prep Program!");
        MarsExpedition expedition = new MarsExpedition();
    }
}
