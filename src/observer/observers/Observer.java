package observer.observers;

/**
 * 1. Step One: Define the Observer Interface
 * Every observer (person or party) must implement this interface to define how they'll be notified.
 */
public interface Observer {
    void update(String message);
}
