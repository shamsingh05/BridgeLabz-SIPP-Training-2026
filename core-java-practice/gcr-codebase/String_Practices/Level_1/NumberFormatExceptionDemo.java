import java.util.Scanner;

public class NumberFormatExceptionDemo {
    
    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String text) {
        System.out.println("Attempting to parse: " + text);
        int number = Integer.parseInt(text); // This will throw NumberFormatException
        System.out.println("Number: " + number);
    }
    
    // Method to handle NumberFormatException
    public static void handleNumberFormatException(String text) {
        try {
            System.out.println("Attempting to parse: " + text);
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
            System.out.println("Error: Input string does not contain a valid integer!");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== NumberFormatException Demonstration ===\n");
        
        // Take user input
        System.out.print("Enter a value: ");
        String text = scanner.nextLine();
        
        // First, demonstrate generating the exception
        System.out.println("\n--- Part 1: Generating NumberFormatException ---");
        try {
            generateNumberFormatException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getClass().getName());
            System.out.println("Exception Message: " + e.getMessage() + "\n");
        }
        
        // Now handle the exception
        System.out.println("--- Part 2: Handling NumberFormatException ---");
        handleNumberFormatException(text);
        
        scanner.close();
    }
}
