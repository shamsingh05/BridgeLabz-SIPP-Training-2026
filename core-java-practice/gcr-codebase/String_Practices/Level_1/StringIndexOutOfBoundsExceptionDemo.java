import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {
    
    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String text) {
        System.out.println("Trying to access character at invalid index...");
        System.out.println("Character at index 10: " + text.charAt(10)); // This will throw exception
    }
    
    // Method to handle StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            System.out.println("Attempting to access character at invalid index...");
            System.out.println("Character at index 10: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("Error: Index is out of bounds!");
            System.out.println("String length: " + text.length());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== StringIndexOutOfBoundsException Demonstration ===\n");
        
        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // First, demonstrate generating the exception
        System.out.println("\n--- Part 1: Generating StringIndexOutOfBoundsException ---");
        try {
            generateStringIndexOutOfBoundsException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getClass().getName());
            System.out.println("Exception Message: " + e.getMessage() + "\n");
        }
        
        // Now handle the exception
        System.out.println("--- Part 2: Handling StringIndexOutOfBoundsException ---");
        handleStringIndexOutOfBoundsException(text);
        
        scanner.close();
    }
}
