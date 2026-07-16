import java.util.Scanner;

public class VowelsConsonantsDisplay {
    
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
    
    // Method to find vowels and consonants and return 2D array
    public static String[][] findVowelsConsonants(String text) {
        int textLength = 0;
        int letterCount = 0;
        
        // Find text length
        try {
            while (true) {
                text.charAt(textLength);
                textLength++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Length found
        }
        
        // Count letters
        for (int i = 0; i < textLength; i++) {
            String type = checkCharacterType(text.charAt(i));
            if (!type.equals("Not a Letter")) {
                letterCount++;
            }
        }
        
        // Create 2D array for letters only
        String[][] result = new String[letterCount][2];
        int index = 0;
        
        for (int i = 0; i < textLength; i++) {
            char c = text.charAt(i);
            String type = checkCharacterType(c);
            
            if (!type.equals("Not a Letter")) {
                result[index][0] = String.valueOf(c);
                result[index][1] = type;
                index++;
            }
        }
        
        return result;
    }
    
    // Method to display 2D array in tabular format
    public static void displayTableFormat(String[][] data) {
        System.out.println("\n+--------+-----------+");
        System.out.println("| Char   | Type      |");
        System.out.println("+--------+-----------+");
        
        for (String[] row : data) {
            System.out.printf("| %-6s | %-9s |%n", row[0], row[1]);
        }
        
        System.out.println("+--------+-----------+");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        
        // Find vowels and consonants
        String[][] charTypes = findVowelsConsonants(text);
        
        // Display results
        System.out.println("\n--- Character Types ---");
        System.out.println("Text: " + text);
        displayTableFormat(charTypes);
        
        scanner.close();
    }
}
