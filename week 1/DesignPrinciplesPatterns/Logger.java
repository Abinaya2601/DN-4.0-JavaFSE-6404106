public class Logger {

    // Static reference to the single instance
    private static Logger instance;

    // Private constructor prevents object creation from outside
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Public method to return the only instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();  // Only created once
        }
        return instance;
    }

    // Method to simulate logging
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
