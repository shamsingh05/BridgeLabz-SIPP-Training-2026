import java.util.Scanner;

public class StringLength {
    
    // Method to find string length without using length() method
    public static int findStringLength(String text) {
        int count = 0;
        
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception thrown when index is out of bounds
            return count;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        // Find length using custom method
        int customLength = findStringLength(text);
        
        // Find length using built-in method
        int builtInLength = text.length();
        
        // Display results
        System.out.println("\n--- String Length Comparison ---");
        System.out.println("String: " + text);
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using length(): " + builtInLength);
        System.out.println("Both methods give same result: " + (customLength == builtInLength));
        
        scanner.close();
    }
}
