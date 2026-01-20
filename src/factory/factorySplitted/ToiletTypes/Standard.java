package factory.factorySplitted.ToiletTypes;

import factory.factorySplitted.Toilet;

public class Standard extends Toilet {
    @Override
    public void flush() {
        System.out.println("Standard Toilet: Using 5 liters of water—eco-friendly, blyat!");
    }
}
