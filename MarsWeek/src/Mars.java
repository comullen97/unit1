public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Bailey";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;
        meals = meals - (shipPopulation * 0.75);
        meals = meals - (shipPopulation * 0.75);
        System.out.println("Meals left after landing " + meals);
        meals *= 0.5;
        shipPopulation += 5;
        String landingLocation = "The Ocean";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz landing on The Plain");
        } else {
            System.out.println("Error!!! Flight plan already set. Landing on The Plain");
        }
    }
    private static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute  = 0; minute <= minutesLeft; i++){
            if ((minute % 3) == 0) && ((minute % 2) == 0){
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}
