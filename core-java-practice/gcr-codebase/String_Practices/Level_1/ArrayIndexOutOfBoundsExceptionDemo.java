import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        System.out.println("Trying to access index that doesn't exist...");
        System.out.println("Name at index 10: " + names[10]); // This will throw exception
    }
    
    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            System.out.println("Attempting to access index that doesn't exist...");
            System.out.println("Name at index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("Error: Array index is out of bounds!");
            System.out.println("Array length: " + names.length);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== ArrayIndexOutOfBoundsException Demonstration ===\n");
        
        // Take user input
        System.out.print("Enter number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        String[] names = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        
        // First, demonstrate generating the exception
        System.out.println("\n--- Part 1: Generating ArrayIndexOutOfBoundsException ---");
        try {
            generateArrayIndexOutOfBoundsException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getClass().getName());
            System.out.println("Exception Message: " + e.getMessage() + "\n");
        }
        
        // Now handle the exception
        System.out.println("--- Part 2: Handling ArrayIndexOutOfBoundsException ---");
        handleArrayIndexOutOfBoundsException(names);
        
      
    }
}
