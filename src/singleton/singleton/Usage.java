package singleton.singleton;

public class Usage {

    public static void main(String[] args) {
        // Get instance of DatabaseConnection (always same object)
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        connection1.queryDatabase("SELECT * FROM toilets;");

        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        connection2.queryDatabase("UPDATE pipes SET status='fixed' WHERE id=123;");

        // Check if both instances are same
        System.out.println(connection1 == connection2 ? "Same instance, blyat!" : "Different instance, pizdeц!");
    }

}
