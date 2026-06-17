import java.util.Scanner;

public class LowercaseConversion {
    
    // Method to convert text to lowercase using charAt() and ASCII values
    public static String convertToLowercaseUsingCharAt(String text) {
        String result = "";
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            // Check if character is uppercase (ASCII 65-90)
            if (c >= 'A' && c <= 'Z') {
                // Convert to lowercase by adding 32 to ASCII value
                result += (char) (c + 32);
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
        
        System.out.println("=== Lowercase Conversion Comparison ===\n");
        
        // Take user input
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        
        // Convert to lowercase using custom method
        String customLowercase = convertToLowercaseUsingCharAt(text);
        
        // Convert to lowercase using built-in method
        String builtInLowercase = text.toLowerCase();
        
        // Compare the two results
        boolean areEqual = compareStringsUsingCharAt(customLowercase, builtInLowercase);
        
        // Display results
        System.out.println("\n--- Lowercase Conversion Results ---");
        System.out.println("Original Text: " + text);
        System.out.println("Using charAt() & ASCII: " + customLowercase);
        System.out.println("Using toLowerCase(): " + builtInLowercase);
        System.out.println("Both results are equal: " + areEqual);
        
        scanner.close();
    }
}
