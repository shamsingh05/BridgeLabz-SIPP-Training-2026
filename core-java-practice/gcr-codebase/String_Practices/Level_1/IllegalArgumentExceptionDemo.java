import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    
    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String text) {
        System.out.println("Trying to create substring with invalid indices...");
        System.out.println("Substring: " + text.substring(10, 5)); // startIndex > endIndex
    }
    
    // Method to handle IllegalArgumentException
    public static void handleIllegalArgumentException(String text) {
        try {
            System.out.println("Attempting to create substring with invalid indices...");
            System.out.println("Substring: " + text.substring(10, 5)); // startIndex > endIndex
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
            System.out.println("Error: Start index cannot be greater than end index!");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getClass().getName() + " - " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== IllegalArgumentException Demonstration ===\n");
        
        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // First, demonstrate generating the exception
        System.out.println("\n--- Part 1: Generating IllegalArgumentException ---");
        try {
            generateIllegalArgumentException(text);
        } catch (RuntimeException e) {
            System.out.println("Exception caught in main: " + e.getClass().getName());
            System.out.println("Exception Message: " + e.getMessage() + "\n");
        }
        
        // Now handle the exception
        System.out.println("--- Part 2: Handling IllegalArgumentException ---");
        handleIllegalArgumentException(text);
        
        scanner.close();
    }
}
