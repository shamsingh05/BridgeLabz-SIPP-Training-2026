import java.util.Scanner;

public class UniqueCharFrequency {
    
    public static char[] uniqueCharacters(String text) {
        StringBuilder unique = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (unique.indexOf(String.valueOf(c)) == -1) {
                unique.append(c);
            }
        }
        return unique.toString().toCharArray();
    }
    
    public static String[][] frequencyOfUniqueChars(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        
        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];
        
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        String[][] result = frequencyOfUniqueChars(text);
        System.out.println("Unique Character Frequencies:");
        for (String[] pair : result) {
            System.out.println(pair[0] + " -> " + pair[1]);
        }
    }
}
