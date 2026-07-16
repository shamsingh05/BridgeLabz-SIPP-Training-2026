import java.util.Scanner;

public class TrimSpaces {
    
    // Method to find string length without using length() method
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    
    // Method to find trim indices (leading and trailing spaces)
    public static int[] findTrimIndices(String text) {
        int textLength = findStringLength(text);
        int startIdx = 0;
        int endIdx = textLength;
        
        // Find leading spaces
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) != ' ') {
                startIdx = i;
                break;
            }
        }
        
        // Find trailing spaces
        for (int i = textLength - 1; i >= 0; i--) {
            if (text.charAt(i) != ' ') {
                endIdx = i + 1;
                break;
            }
        }
        
        return new int[]{startIdx, endIdx};
    }
    
    // Method to create substring using charAt()
    public static String createSubstringUsingCharAt(String str, int startIndex, int endIndex) {
        String result = "";
        
        for (int i = startIndex; i < endIndex; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    
    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        int len1 = findStringLength(str1);
        int len2 = findStringLength(str2);
        
        if (len1 != len2) {
            return false;
        }
        
        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter text (may have leading/trailing spaces): ");
        String text = scanner.nextLine();
        
        // Trim using custom method
        int[] trimIndices = findTrimIndices(text);
        String customTrimmed = createSubstringUsingCharAt(text, trimIndices[0], trimIndices[1]);
        
        // Trim using built-in method
        String builtInTrimmed = text.trim();
        
        // Compare the results
        boolean areEqual = compareStringsUsingCharAt(customTrimmed, builtInTrimmed);
        
        // Display results
        System.out.println("\n--- Trim Spaces Comparison ---");
        System.out.println("Original Text: \"" + text + "\"");
        System.out.println("Custom trim: \"" + customTrimmed + "\"");
        System.out.println("Built-in trim(): \"" + builtInTrimmed + "\"");
        System.out.println("Both results are equal: " + areEqual);
        
        scanner.close();
    }
}
