package factory.factorySplitted.ToiletTypes;

import factory.factorySplitted.Toilet;

public class Luxury extends Toilet {
    @Override
    public void flush() {
        System.out.println("Luxury Toilet: Flushing with music and golden water!");
    }
}
