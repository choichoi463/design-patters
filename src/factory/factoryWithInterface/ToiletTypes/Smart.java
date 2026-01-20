package factory.factoryWithInterface.ToiletTypes;

import factory.factoryWithInterface.Toilet;

public class Smart implements Toilet {
    @Override
    public void flush() {
        System.out.println("Smart Toilet: Scans 💩 and calculates flush size. This is future, blyat!");
    }
}
