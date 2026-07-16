import java.util.Scanner;

public class VowelsConsonantsCount {
    
    // Method to check if character is vowel or consonant
    public static String checkCharacterType(char c) {
        // Convert to lowercase using ASCII values
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
        }
        
        // Check if vowel
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        }
        // Check if consonant
        else if (c >= 'a' && c <= 'z') {
            return "Consonant";
        }
        // Not a letter
        else {
            return "Not a Letter";
        }
    }
    
    // Method to find and count vowels and consonants
    public static int[] countVowelsConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;
        int textLength = 0;
        
        // Find text length
        try {
            while (true) {
                text.charAt(textLength);
                textLength++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Length found
        }
        
        // Count vowels and consonants
        for (int i = 0; i < textLength; i++) {
            char c = text.charAt(i);
            String type = checkCharacterType(c);
            
            if (type.equals("Vowel")) {
                vowelCount++;
            } else if (type.equals("Consonant")) {
                consonantCount++;
            }
        }
        
        return new int[]{vowelCount, consonantCount};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        
        // Count vowels and consonants
        int[] counts = countVowelsConsonants(text);
        
        // Display results
        System.out.println("\n--- Vowels and Consonants Count ---");
        System.out.println("Text: " + text);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
        System.out.println("Total Letters: " + (counts[0] + counts[1]));
        
        scanner.close();
    }
}
