import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        // Expedition Time
        Thread.sleep(500);
        System.out.println("Welcome back from your expedition. Time to catalog everything you found.");

        // Storing all the samples
        ArrayList<String> rockList = new ArrayList<String>();

        System.out.println("Rock data downloaded.");

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println(rockList);

        System.out.println("Wait a second, that last one is not a rock. We need to delete that one from the list.");

        rockList.remove("not rock");

        System.out.println(rockList);

        // Loading Time
        Thread.sleep(1000);
        System.out.println("Fossil data downloaded");

        // Storing fossils
        HashMap<String, String> fossilDirectory = new HashMap<>();

        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        // Fossil information
        Scanner input = new Scanner(System.in);

        System.out.println("Which of the fossils would you like to learn more about (Spelling and Spacing is important)?");

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }

        // Loading Time
        Thread.sleep(700);
        System.out.println("Supplies brought:");

        // Supplies brought
        HashSet<String> supplies = new HashSet<>();

        supplies.add("Teleporter");
        supplies.add("Stun gun");
        supplies.add("Insta-Heal Capsules");

        System.out.println("Supplies Before Expedition:");
        Iterator<String> itr = supplies.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        supplies.remove("Stun gun");

        System.out.println("Supplies After Expedition:");
        itr = supplies.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

