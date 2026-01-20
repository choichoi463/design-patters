package singleton.singletonThreadSafe;

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


    /**
     * Important Advice
     * When I fix toilet in Omsk, I don’t use singleton1.singleton (one wrench) for every plumbing problem. Sometimes you need
     * multiple tools, da? Same for programming—don’t overuse singletons. They should be for something truly global,
     * like a configuration manager or logging system. Too many singletons = code becomes like clogged pipes, pizdeц!
     *
     * Code is like pipe—when work, is beautiful. When break, is disaster. Choose your tools wisely, comrade!
     */
}
