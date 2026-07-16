import java.util.Scanner;

public class ShortestLongestWord {
    
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
    
    // Method to split text into words
    public static String[] splitTextIntoWords(String text) {
        int textLength = findStringLength(text);
        int wordCount = 1;
        
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        
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
    
    // Method to create 2D array with words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findStringLength(words[i]));
        }
        
        return result;
    }
    
    // Method to find shortest and longest word lengths
    public static int[] findShortestLongestIndices(String[][] wordsWithLengths) {
        int shortestIdx = 0, longestIdx = 0;
        int shortestLen = Integer.parseInt(wordsWithLengths[0][1]);
        int longestLen = Integer.parseInt(wordsWithLengths[0][1]);
        
        for (int i = 0; i < wordsWithLengths.length; i++) {
            int len = Integer.parseInt(wordsWithLengths[i][1]);
            
            if (len < shortestLen) {
                shortestLen = len;
                shortestIdx = i;
            }
            
            if (len > longestLen) {
                longestLen = len;
                longestIdx = i;
            }
        }
        
        return new int[]{shortestIdx, longestIdx, shortestLen, longestLen};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter text with words separated by spaces: ");
        String text = scanner.nextLine();
        
        // Split text into words
        String[] words = splitTextIntoWords(text);
        
        // Get 2D array with words and their lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);
        
        // Find shortest and longest
        int[] result = findShortestLongestIndices(wordsWithLengths);
        int shortestIdx = result[0];
        int longestIdx = result[1];
        int shortestLen = result[2];
        int longestLen = result[3];
        
        // Display results
        System.out.println("\n--- Shortest and Longest Words ---");
        System.out.println("Text: " + text);
        System.out.println("\nShortest Word: \"" + wordsWithLengths[shortestIdx][0] + "\" (Length: " + shortestLen + ")");
        System.out.println("Longest Word: \"" + wordsWithLengths[longestIdx][0] + "\" (Length: " + longestLen + ")");
        
        System.out.println("\n--- All Words with Their Lengths ---");
        System.out.println("+-----------+--------+");
        System.out.println("| Word      | Length |");
        System.out.println("+-----------+--------+");
        
        for (String[] row : wordsWithLengths) {
            System.out.printf("| %-9s | %6d |%n", row[0], Integer.parseInt(row[1]));
        }
        
        System.out.println("+-----------+--------+");
        
        scanner.close();
    }
}
