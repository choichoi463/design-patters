package strategy.strategySplitted;

import strategy.strategySplitted.uncloagStrategy.ChemicalUncloggingStrategy;
import strategy.strategySplitted.uncloagStrategy.PlungerUncloggingStrategy;
import strategy.strategySplitted.uncloagStrategy.SnakeToolUncloggingStrategy;

public class Usage {

    /**
     * Ah, the Strategy Design Pattern! A favorite of Valera when it comes to flexible problem-solving—it’s like
     * choosing the right method to unclog a pipe, based on how badly it’s plugged.
     * <p>
     * For example: sometimes I use a plunger, sometimes I use a snake, and if all else fails, a big hammer does the
     * job (or maybe... vodka bath, da?). That's the Strategy Pattern—allowing you to dynamically choose the right
     * "strategy" for the job.
     */

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
}
