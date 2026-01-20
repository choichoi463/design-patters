package factory.factoryWithInterface.ToiletTypes;

import factory.factoryWithInterface.Toilet;

public class Luxury implements Toilet {
    @Override
    public void flush() {
        System.out.println("Luxury Toilet: Flushing with music and golden water!");
    }
}
