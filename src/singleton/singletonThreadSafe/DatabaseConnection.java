package singleton.singletonThreadSafe;

public class DatabaseConnection {

    // Volatile ensures visibility and avoids dirty reads across threads
    private static volatile DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Thread-safe database connection established!");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            // Lock only the first time instance is created
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public void queryDatabase(String sql) {
        System.out.println("Executing SQL: " + sql);
    }
}