package observer;

import observer.observers.Observer;

/**
 * 2. Step Two: Create the Subject Interface
 * The Subject is the plumbing system—it manages the list of observers and notifies them when something important happens.
 */
public interface Subject {
    void registerObserver(Observer observer); // Add observer to list
    void removeObserver(Observer observer);   // Remove observer from list
    void notifyObservers();                   // Notify all observers
}