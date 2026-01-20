package factory.factory;

/**
 * Factory pattern (creational) is like Valera deciding which tool to use for a specific problem. One type of pipe needs
 * wrench, another type needs a snake, and a third might just need brute force (or vodka, depends).
 * <p>
 * With the Factory Design Pattern, you create a class (the factory1.factory) that creates objects for you.
 * This way, you don’t need to know how these objects are created. You just tell the factory1.factory:
 * “Hey, give me the tool for fixing this pipe!” And the factory1.factory chooses the right one for you.
 * Simple, beautiful, and no pizdeц.
 */
public class FactoryClasses {

    /* Here, we create a factory1.factory to produce different types of toilets.
     * Customers don't need to know how these toilets are made—they simply ask for one, and the factory1.factory delivers.
     */

    // 1. Step One: Define a Product Interface (or abstract class)
    // Base class for all toilets
    abstract static class Toilet {
        public abstract void flush(); // All toilets must define how they flush
    }



    //2. Step Two: Create Concrete Classes
    // Now create different types of toilets that extend the base Toilet class. Each toilet flushes differently!

    static class StandardToilet extends Toilet {
        @Override
        public void flush() {
            System.out.println("Standard Toilet: Using 5 liters of water—eco-friendly, blyat!");
        }
    }

    static class LuxuryToilet extends Toilet {
        @Override
        public void flush() {
            System.out.println("Luxury Toilet: Flushing with music and golden water!");
        }
    }

    static class SmartToilet extends Toilet {
        @Override
        public void flush() {
            System.out.println("Smart Toilet: Scans 💩 and calculates flush size. This is future, blyat!");
        }
    }



    //3. Step Three: Create the Factory
    //The factory1.factory decides which toilet to create based on input. This separates the creation logic from the client code (main function).

    class ToiletFactory {
        public static Toilet getToilet(String type) {
            if (type.equalsIgnoreCase("standard")) {
                return new StandardToilet();
            } else if (type.equalsIgnoreCase("luxury")) {
                return new LuxuryToilet();
            } else if (type.equalsIgnoreCase("smart")) {
                return new SmartToilet();
            }
            throw new IllegalArgumentException("Unknown toilet type, blyat: " + type);
        }
    }

    //If you want a StandardToilet, the factory1.factory gives you one.
    //If you want a LuxuryToilet or SmartToilet, same thing.

}
