package factory.factoryWithInterface;

import factory.factoryWithInterface.ToiletTypes.Luxury;
import factory.factoryWithInterface.ToiletTypes.Smart;
import factory.factoryWithInterface.ToiletTypes.Standard;

public class ToiletFactory {
    public Toilet getToilet(String type) {
        if (type.equalsIgnoreCase("standard")) {
            return new Standard();
        } else if (type.equalsIgnoreCase("luxury")) {
            return new Luxury();
        } else if (type.equalsIgnoreCase("smart")) {
            return new Smart();
        }
        throw new IllegalArgumentException("Unknown toilet type, blyat: " + type);
    }
}
