public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Logging from logger1");

        Logger logger2 = Logger.getInstance();
        logger2.log("Logging from logger2");

        // Check if both logger instances are the same
        if (logger1 == logger2) {
            System.out.println("✅ Same instance used for both logs. Singleton works!");
        } else {
            System.out.println("❌ Different instances. Singleton failed.");
        }
    }
}
