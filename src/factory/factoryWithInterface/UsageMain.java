package factory.factoryWithInterface;

public class UsageMain {
    public static void main(String[] args) {
        // Ask factory1.factory to give toilets
        ToiletFactory factory = new ToiletFactory();

        Toilet standardToilet = factory.getToilet("standard");
        Toilet luxuryToilet = factory.getToilet("luxury");
        Toilet smartToilet = factory.getToilet("smart");

        // Flush all the toilets!
        standardToilet.flush(); // Standard toilet behavior
        luxuryToilet.flush();   // Luxury toilet behavior
        smartToilet.flush();    // Smart toilet behavior
    }
}
