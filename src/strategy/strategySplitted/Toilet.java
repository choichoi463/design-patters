package strategy.strategySplitted;

import strategy.strategySplitted.uncloagStrategy.UncloggingStrategy;

public class Toilet {
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
