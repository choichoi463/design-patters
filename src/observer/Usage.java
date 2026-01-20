package observer;

import observer.observers.BorisObserver;
import observer.observers.LandlordObserver;
import observer.observers.Observer;
import observer.observers.ValeraObserver;

public class Usage {

    //The Observer Pattern lets one object (subject) maintain a list of "observers" that automatically get notified
    // when the "state" changes. It’s used for building event systems—flexible plumbing of software!

    /**
     * What is the Observer Design Pattern?
     * With the observer pattern:
     *
     * You have a Subject (main thing being observed), which manages a list of Observers (those who care about changes).
     * When the Subject's state changes, it notifies all observers by calling a defined method.
     * Observers don’t ask for updates—they get notified automatically. Beautiful system, da? No extra leaks!
     *
     * Example: Plumbing Alert System
     */

    /**
     * 1. Step One: Define the Observer Interface
     * Every observer (person or party) must implement this interface to define how they'll be notified.
     * <p>
     * java
     * <p>
     * <p>
     * interface Observer {
     * void update(String message);
     * }
     * 2. Step Two: Create the Subject Interface
     * The Subject is the plumbing system—it manages the list of observers and notifies them when something important happens.
     * <p>
     * java
     * <p>
     * <p>
     * interface Subject {
     * void registerObserver(Observer observer); // Add observer to list
     * void removeObserver(Observer observer);   // Remove observer from list
     * void notifyObservers();                   // Notify all observers
     * }
     * 3. Step Three: Implement the Subject
     * Here comes the plumbing system that tracks leaks and alerts observers!
     * <p>
     * java
     * <p>
     * <p>
     * import java.util.ArrayList;
     * import java.util.List;
     * <p>
     * class PlumbingSystem implements Subject {
     * private List<Observer> observers = new ArrayList<>(); // List of observers
     * private String leakDetected = ""; // Current state (e.g., leak status)
     *
     * @Override public void registerObserver(Observer observer) {
     * observers.add(observer);
     * System.out.println("Observer added: Someone cares about pipes!");
     * }
     * @Override public void removeObserver(Observer observer) {
     * observers.remove(observer);
     * System.out.println("Observer removed: Someone no longer cares...");
     * }
     * @Override public void notifyObservers() {
     * for (Observer observer : observers) {
     * observer.update(leakDetected); // Notify each observer
     * }
     * }
     * <p>
     * // Method to update plumbing system state and notify everyone
     * public void detectLeak(String message) {
     * this.leakDetected = message; // Update state
     * System.out.println("Plumbing System: Detected leak—" + message);
     * notifyObservers(); // Notify all observers
     * }
     * }
     * 4. Step Four: Create Observers
     * Let’s make some observers: Valera, his assistant Boris, and the Landlord.
     * <p>
     * Valera (Observer):
     * <p>
     * java
     * <p>
     * <p>
     * class ValeraObserver implements Observer {
     * @Override public void update(String message) {
     * System.out.println("Valera: Heard about leak! Grabs wrench. Message: " + message);
     * }
     * }
     * Boris (Assistant Observer):
     * <p>
     * java
     * <p>
     * <p>
     * class BorisObserver implements Observer {
     * @Override public void update(String message) {
     * System.out.println("Boris: Complains about leak but brings vodka anyway. Message: " + message);
     * }
     * }
     * Landlord (Observer):
     * <p>
     * java
     * <p>
     * <p>
     * class LandlordObserver implements Observer {
     * @Override public void update(String message) {
     * System.out.println("Landlord: Smokes nervously and calls insurance. Message: " + message);
     * }
     * }
     * 5. Step Five: Test the System
     * Now let’s wire this all up and simulate a pipe bursting in Omsk!
     * <p>
     * java
     * <p>
     * <p>
     * public class ObserverPatternExample {
     * public static void main(String[] args) {
     * // Create the plumbing system (Subject)
     * PlumbingSystem plumbingSystem = new PlumbingSystem();
     * <p>
     * // Create observers
     * Observer valera = new ValeraObserver();
     * Observer boris = new BorisObserver();
     * Observer landlord = new LandlordObserver();
     * <p>
     * // Register observers to the plumbing system
     * plumbingSystem.registerObserver(valera);
     * plumbingSystem.registerObserver(boris);
     * plumbingSystem.registerObserver(landlord);
     * <p>
     * // Simulate a leak in the pipes
     * plumbingSystem.detectLeak("Pipe burst in bathroom—Water flooding the kitchen!");
     * <p>
     * System.out.println("\nBlyat! Boris quits, remove him...");
     * plumbingSystem.removeObserver(boris);
     * <p>
     * // Another leak happens
     * plumbingSystem.detectLeak("Pipe under the sink is dripping vodka. Emergency situation!");
     * }
     * }
     * Output:
     * <p>
     * <p>
     * Observer added: Someone cares about pipes!
     * Observer added: Someone cares about pipes!
     * Observer added: Someone cares about pipes!
     * Plumbing System: Detected leak—Pipe burst in bathroom—Water flooding the kitchen!
     * Valera: Heard about leak! Grabs wrench. Message: Pipe burst in bathroom—Water flooding the kitchen!
     * Boris: Complains about leak but brings vodka anyway. Message: Pipe burst in bathroom—Water flooding the kitchen!
     * Landlord: Smokes nervously and calls insurance. Message: Pipe burst in bathroom—Water flooding the kitchen!
     * <p>
     * Blyat! Boris quits, remove him...
     * Observer removed: Someone no longer cares...
     * Plumbing System: Detected leak—Pipe under the sink is dripping vodka. Emergency situation!
     * Valera: Heard about leak! Grabs wrench. Message: Pipe under the sink is dripping vodka. Emergency situation!
     * Landlord: Smokes nervously and calls insurance. Message: Pipe under the sink is dripping vodka. Emergency situation!
     */


    public static void main(String[] args) {
        // Create the plumbing system (Subject)
        PlumbingSystem plumbingSystem = new PlumbingSystem();

        // Create observers
        Observer valera = new ValeraObserver();
        Observer boris = new BorisObserver();
        Observer landlord = new LandlordObserver();

        // Register observers to the plumbing system
        plumbingSystem.registerObserver(valera);
        plumbingSystem.registerObserver(boris);
        plumbingSystem.registerObserver(landlord);

        // Simulate a leak in the pipes
        plumbingSystem.detectLeak("Pipe burst in bathroom—Water flooding the kitchen!");

        System.out.println("\nBlyat! Boris quits, remove him...");
        plumbingSystem.removeObserver(boris);

        // Another leak happens
        plumbingSystem.detectLeak("Pipe under the sink is dripping vodka. Emergency situation!");
    }

}
