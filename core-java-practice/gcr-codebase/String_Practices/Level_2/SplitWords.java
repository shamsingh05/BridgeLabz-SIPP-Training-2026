import java.util.Scanner;

public class SplitWords {
    
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
    
    // Method to split text into words using charAt()
    public static String[] splitTextIntoWords(String text) {
        int textLength = findStringLength(text);
        int wordCount = 1;
        
        // Count number of words (spaces + 1)
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        
        // Store indices of spaces
        int[] spaceIndices = new int[wordCount + 1];
        spaceIndices[0] = -1;
        int index = 1;
        
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndices[index] = i;
                index++;
            }
        }
        spaceIndices[index] = textLength;
        
        // Extract words using space indices
        String[] words = new String[wordCount];
        
        for (int i = 0; i < wordCount; i++) {
            int startIdx = spaceIndices[i] + 1;
            int endIdx = spaceIndices[i + 1];
            String word = "";
            
            for (int j = startIdx; j < endIdx; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }
        
        return words;
    }
    
    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        int len1 = 0, len2 = 0;
        
        try {
            while (true) arr1[len1++] = "";
        } catch (ArrayIndexOutOfBoundsException e) {
            len1--;
        }
        
        try {
            while (true) arr2[len2++] = "";
        } catch (ArrayIndexOutOfBoundsException e) {
            len2--;
        }
        
        if (len1 != len2) return false;
        
        for (int i = 0; i < len1; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter text with words separated by spaces: ");
        String text = scanner.nextLine();
        
        // Split using custom method
        String[] customWords = splitTextIntoWords(text);
        
        // Split using built-in method
        String[] builtInWords = text.split(" ");
        
        // Compare arrays
        boolean areEqual = compareStringArrays(customWords, builtInWords);
        
        // Display results
        System.out.println("\n--- Split Words Comparison ---");
        System.out.println("Text: " + text);
        
        System.out.print("Custom split result: ");
        for (String word : customWords) {
            System.out.print(word + " ");
        }
        System.out.println();
        
        System.out.print("Built-in split() result: ");
        for (String word : builtInWords) {
            System.out.print(word + " ");
        }
        System.out.println();
        
        System.out.println("Both results are equal: " + areEqual);
        
        scanner.close();
    }
}
