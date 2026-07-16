public class NullPointerExceptionDemo {
    
    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        System.out.println("Calling length() on null string...");
        System.out.println("Length: " + text.length()); // This will throw NullPointerException
    }
    
    // Method to handle NullPointerException
    public static void handleNullPointerException() {
        String text = null;
        
        try {
            System.out.println("Attempting to call length() on null string...");
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
            System.out.println("Error: Cannot call methods on a null object!");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== NullPointerException Demonstration ===\n");
        
        // First, demonstrate generating the exception
        System.out.println("--- Part 1: Generating NullPointerException ---");
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getClass().getName());
            System.out.println("Exception Message: " + e.getMessage() + "\n");
        }
        
        // Now handle the exception
        System.out.println("--- Part 2: Handling NullPointerException ---");
        handleNullPointerException();
    }
}
