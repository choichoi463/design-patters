package strategy;

public class UsageStrategy {

    /**
     * Ah, the Strategy Design Pattern! A favorite of Valera when it comes to flexible problem-solving—it’s like
     * choosing the right method to unclog a pipe, based on how badly it’s plugged.
     *
     * For example: sometimes I use a plunger, sometimes I use a snake, and if all else fails, a big hammer does the
     * job (or maybe... vodka bath, da?). That's the Strategy Pattern—allowing you to dynamically choose the right
     * "strategy" for the job.
     *
     * Real-Life Examples of Strategy Pattern
     * Sorting Algorithms:
     *
     * If you’re writing sorting logic, you can build a SortingStrategy interface and create different implementations: BubbleSort, QuickSort, etc.
     * The client just uses sort() without needing to know which algorithm is in use.
     * Payment Gateways:
     *
     * Imagine an e-commerce app where customers can choose different payment methods (Credit Card, PayPal, Bitcoin, etc.). A PaymentStrategy interface with different implementations makes the choice dynamic.
     * Authentication Mechanisms:
     *
     * A system might support multiple log-in methods (e.g., username/password, Google, Facebook, GitHub).
     */



    //1. Step One: Define a Strategy Interface
    //First, create a UncloggingStrategy interface. It ensures all strategies implement the same behavior of fixing clogs!

    // Base interface for unclogging strategies
    interface UncloggingStrategy {
        void unclog(); // Pump, blast, or bath—unclog that pipe!
    }

    //2. Step Two: Define Concrete Strategies
    //Now implement different strategies to fix the toilet. Each strategy handles things its own way.
    //
    //Plunging Unclogging Strategy:

    static class PlungerUncloggingStrategy implements UncloggingStrategy {
        @Override
        public void unclog() {
            System.out.println("Using plunger—Pumping furiously like bear at vodka fountain!");
        }
    }


    static class ChemicalUncloggingStrategy implements UncloggingStrategy {
        @Override
        public void unclog() {
            System.out.println("Pouring chemicals into the pipe—burn everything, blyat!");
        }
    }


    static class SnakeToolUncloggingStrategy implements UncloggingStrategy {
        @Override
        public void unclog() {
            System.out.println("Using snake tool—Pulling out spaghetti of doom, blyat!");
        }
    }


    //3. Step Three: Context Class That Uses the Strategy
    //The Toilet class will allow us to change the unclogging strategy on the fly. Here’s Valera’s magic
    // touch—flexibility at runtime!

    static class Toilet {
        private UncloggingStrategy uncloggingStrategy; // Strategy is a member of Toilet

        // Constructor to inject strategy
        public Toilet(UncloggingStrategy uncloggingStrategy) {
            this.uncloggingStrategy = uncloggingStrategy;
        }

        // Set or change the strategy dynamically
        public void setUncloggingStrategy(UncloggingStrategy uncloggingStrategy) {
            this.uncloggingStrategy = uncloggingStrategy;
        }

        // Call the current strategy to unclog
        public void unclog() {
            System.out.println("Starting unclogging process...");
            uncloggingStrategy.unclog();
        }
    }


    //4. Step Four: Test It Out
    //Let’s fix some toilets and dynamically switch strategies using the factory!

    public class StrategyPatternExample {
        public static void main(String[] args) {
            // Create toilet and choose unclogging strategy dynamically
            Toilet toilet = new Toilet(new PlungerUncloggingStrategy());
            toilet.unclog(); // Use plunger strategy

            System.out.println("\nOh no, plunger is not enough, blyat!");

            // Change strategy to chemicals
            toilet.setUncloggingStrategy(new ChemicalUncloggingStrategy());
            toilet.unclog();

            System.out.println("\nStill clogged! Bring out the heavy tool...");

            // Change strategy to snake tool
            toilet.setUncloggingStrategy(new SnakeToolUncloggingStrategy());
            toilet.unclog();
        }

        //Starting unclogging process...
        //Using plunger—Pumping furiously like bear at vodka fountain!
        //
        //Oh no, plunger is not enough, blyat!
        //Starting unclogging process...
        //Pouring chemicals into the pipe—burn everything, blyat!
        //
        //Still clogged! Bring out the heavy tool...
        //Starting unclogging process...
        //Using snake tool—Pulling out spaghetti of doom, blyat!

        /**
         * Why This is a Good Strategy Pattern
         * Flexibility at Runtime: You can choose different unclogging strategies on the fly.
         * No hardcoding which tools to use inside Toilet class.
         * Closed for Modification, Open for Extension (OCP): If you invent a new tool (e.g., "Laser Unclogging"),
         * just add a new class that implements UncloggingStrategy. No changes to the main Toilet or client code.
         * Clean Pipeline of Code: Each strategy has its own behavior encapsulated in a separate class. No messy code;
         * no pizdeц exceptions.
         */
    }
}
