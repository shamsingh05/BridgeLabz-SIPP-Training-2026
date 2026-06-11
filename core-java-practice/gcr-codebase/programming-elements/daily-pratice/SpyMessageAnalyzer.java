import java.util.HashMap;
import java.util.Scanner;

public class SpyMessageAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String secretMessage = scanner.nextLine();

        String reversedMessage = new StringBuilder(secretMessage).reverse().toString();
        System.out.println("Reversed Message: " + reversedMessage);

        if (secretMessage.equalsIgnoreCase(reversedMessage)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        int vowelCount = 0;
        int consonantCount = 0;

        for (char character : secretMessage.toLowerCase().toCharArray()) {
            if (Character.isLetter(character)) {
                if ("aeiou".indexOf(character) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);

        String firstIntercept = scanner.nextLine();
        String secondIntercept = scanner.nextLine();

        if (areAnagrams(firstIntercept, secondIntercept)) {
            System.out.println("Anagrams: Yes");
        } else {
            System.out.println("Anagrams: No");
        }

        char firstNonRepeatingCharacter = findFirstNonRepeatingCharacter(secretMessage);

        if (firstNonRepeatingCharacter != '\0') {
            System.out.println("First Non-Repeating Character: " + firstNonRepeatingCharacter);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }

        scanner.close();
    }

    private static boolean areAnagrams(String firstString, String secondString) {
        String first = firstString.replaceAll("\\s+", "").toLowerCase();
        String second = secondString.replaceAll("\\s+", "").toLowerCase();

        if (first.length() != second.length()) {
            return false;
        }

        int[] frequency = new int[26];

        for (char character : first.toCharArray()) {
            frequency[character - 'a']++;
        }

        for (char character : second.toCharArray()) {
            frequency[character - 'a']--;
        }

        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    private static char findFirstNonRepeatingCharacter(String text) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char character : text.toCharArray()) {
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        }

        for (char character : text.toCharArray()) {
            if (frequencyMap.get(character) == 1) {
                return character;
            }
        }

        return '\0';
    }
}