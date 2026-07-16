import java.util.Scanner;

public class SubstringComparison {
    
    // Method to create substring using charAt() method
    public static String createSubstringUsingCharAt(String str, int startIndex, int endIndex) {
        String result = "";
        
        if (startIndex < 0 || endIndex > str.length() || startIndex > endIndex) {
            return "Invalid indices";
        }
        
        for (int i = startIndex; i < endIndex; i++) {
            result += str.charAt(i);
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
        
        // Take user input
        System.out.print("Enter the text: ");
        String text = scanner.next();
        
        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();
        
        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();
        
        // Create substring using custom method (charAt)
        String customSubstring = createSubstringUsingCharAt(text, startIndex, endIndex);
        
        // Create substring using built-in method
        String builtInSubstring = text.substring(startIndex, endIndex);
        
        // Compare the two substrings
        boolean areEqual = compareStringsUsingCharAt(customSubstring, builtInSubstring);
        
        // Display results
        System.out.println("\n--- Substring Comparison Results ---");
        System.out.println("Original Text: " + text);
        System.out.println("Start Index: " + startIndex);
        System.out.println("End Index: " + endIndex);
        System.out.println("Substring using charAt(): " + customSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Both substrings are equal: " + areEqual);
        
        scanner.close();
    }
}
