import java.util.Scanner;

public class UniqueCharacters { 
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) { 
        }
        return count;
    } 
    public static char[] findUniqueChars(String str) {
        int len = getLength(str);
        char[] result = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true; 
            for (int j = 0; j < index; j++) {
                if (result[j] == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result[index++] = ch;
            }
        } 
        char[] unique = new char[index];
        for (int i = 0; i < index; i++) {
            unique[i] = result[i];
        }
        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        char[] uniqueChars = findUniqueChars(text); 
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        } 
    }
}
