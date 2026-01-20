package factory.factoryWithInterface.ToiletTypes;

import factory.factoryWithInterface.Toilet;

public class Standard implements Toilet {
    @Override
    public void flush() {
        System.out.println("Standard Toilet: Using 5 liters of water—eco-friendly, blyat!");
    }
}
