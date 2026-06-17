import java.util.Scanner;

public class UppercaseConversion {
    
    // Method to convert text to uppercase using charAt() and ASCII values
    public static String convertToUppercaseUsingCharAt(String text) {
        String result = "";
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            // Check if character is lowercase (ASCII 97-122)
            if (c >= 'a' && c <= 'z') {
                // Convert to uppercase by subtracting 32 from ASCII value
                result += (char) (c - 32);
            } else {
                result += c;
            }
        }
        return result;
    }
    
    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Uppercase Conversion Comparison ===\n");
        
        // Take user input
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        
        // Convert to uppercase using custom method
        String customUppercase = convertToUppercaseUsingCharAt(text);
        
        // Convert to uppercase using built-in method
        String builtInUppercase = text.toUpperCase();
        
        // Compare the two results
        boolean areEqual = compareStringsUsingCharAt(customUppercase, builtInUppercase);
        
        // Display results
        System.out.println("\n--- Uppercase Conversion Results ---");
        System.out.println("Original Text: " + text);
        System.out.println("Using charAt() & ASCII: " + customUppercase);
        System.out.println("Using toUpperCase(): " + builtInUppercase);
        System.out.println("Both results are equal: " + areEqual);
        
        scanner.close();
    }
}
