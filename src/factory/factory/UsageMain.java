package factory.factory;

public class UsageMain {
    public static void main(String[] args) {
        // Ask factory1.factory to give toilets

        FactoryClasses.Toilet standardToilet = FactoryClasses.ToiletFactory.getToilet("standard");
        FactoryClasses.Toilet luxuryToilet = FactoryClasses.ToiletFactory.getToilet("luxury");
        FactoryClasses.Toilet smartToilet = FactoryClasses.ToiletFactory.getToilet("smart");

        // Flush all the toilets!
        standardToilet.flush(); // Standard toilet behavior
        luxuryToilet.flush();   // Luxury toilet behavior
        smartToilet.flush();    // Smart toilet behavior
    }
}
