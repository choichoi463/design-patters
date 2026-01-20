package singleton.singleton;

public class DatabaseConnection {

    // The ONLY instance of this class (created when class loads)
    private static final DatabaseConnection instance = new DatabaseConnection();

    // Private constructor to prevent instantiation from outside
    private DatabaseConnection() {
        System.out.println("Connecting to database... Vodka-powered connection established!");
    }

    // Public method to access the single instance
    public static DatabaseConnection getInstance() {
        return instance;
    }

    public void queryDatabase(String sql) {
        System.out.println("Executing SQL: " + sql);
    }
}