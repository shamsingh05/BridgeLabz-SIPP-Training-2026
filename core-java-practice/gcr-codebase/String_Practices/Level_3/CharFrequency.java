import java.util.Scanner;

public class CharFrequency {
    public static String[][] frequencyOfChars(String text) {
        int[] freq = new int[256]; 
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        String[][] result = new String[text.length()][2];
        int index = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] != 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                freq[c] = 0;  
                index++;
            }
        } 
        String[][] trimmed = new String[index][2];
        for (int i = 0; i < index; i++) {
            trimmed[i] = result[i];
        }
        return trimmed;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String text = sc.nextLine();
        String[][] result = frequencyOfChars(text);
        System.out.println("Character Frequencies:");
        for (String[] pair : result) {
            System.out.println(pair[0] + " -> " + pair[1]);
        }
    }
}
