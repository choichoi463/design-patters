package observer.observers;

public class BorisObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Boris: Complains about leak but brings vodka anyway. Message: " + message);
    }
}
