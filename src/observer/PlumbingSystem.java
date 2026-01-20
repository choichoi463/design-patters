package observer;

import observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;


/**
 * 3. Step Three: Implement the Subject
 * Here comes the plumbing system that tracks leaks and alerts observers!
 */
class PlumbingSystem implements Subject {
    private List<Observer> observers = new ArrayList<>(); // List of observers
    private String leakDetected = ""; // Current state (e.g., leak status)

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer added: Someone cares about pipes!");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer removed: Someone no longer cares...");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(leakDetected); // Notify each observer
        }
    }

    // Method to update plumbing system state and notify everyone
    public void detectLeak(String message) {
        this.leakDetected = message; // Update state
        System.out.println("Plumbing System: Detected leak—" + message);
        notifyObservers(); // Notify all observers
    }
}
