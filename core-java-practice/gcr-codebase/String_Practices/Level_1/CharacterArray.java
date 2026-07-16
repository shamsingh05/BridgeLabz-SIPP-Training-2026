import java.util.Scanner;

public class CharacterArray {
    
    // Method to return characters in a string without using toCharArray()
    public static char[] getCharactersUsingCharAt(String text) {
        char[] result = new char[text.length()];
        
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }
    
    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        
        // Get character array using custom method
        char[] customCharArray = getCharactersUsingCharAt(text);
        
        // Get character array using built-in method
        char[] builtInCharArray = text.toCharArray();
        
        // Compare the two arrays
        boolean areEqual = compareCharArrays(customCharArray, builtInCharArray);
        
        // Display results
        System.out.println("\n--- Character Array Comparison Results ---");
        System.out.println("Original Text: " + text);
        
        System.out.print("Array from charAt(): ");
        for (char c : customCharArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        System.out.print("Array from toCharArray(): ");
        for (char c : builtInCharArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        System.out.println("Both arrays are equal: " + areEqual);
         
    }
}
