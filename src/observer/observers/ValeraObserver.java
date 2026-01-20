package observer.observers;

public class ValeraObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Valera: Heard about leak! Grabs wrench. Message: " + message);
    }
}
