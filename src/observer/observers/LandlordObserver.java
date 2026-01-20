package observer.observers;

public class LandlordObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Landlord: Smokes nervously and calls insurance. Message: " + message);
    }
}