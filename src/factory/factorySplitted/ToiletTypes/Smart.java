package factory.factorySplitted.ToiletTypes;

import factory.factorySplitted.Toilet;

public class Smart extends Toilet {
    @Override
    public void flush() {
        System.out.println("Smart Toilet: Scans 💩 and calculates flush size. This is future, blyat!");
    }
}
