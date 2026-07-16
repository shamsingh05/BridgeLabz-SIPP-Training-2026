/*
2. Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. 
Further for positive numbers check if the number is even or odd. 
Finally compare the first and last elements of the array and display if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less

 */
 

package Level_1;
import java.util.Scanner;
public class Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];  
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        } 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is Positive and Even");
                } else {
                    System.out.println(arr[i] + " is Positive and Odd");
                }
            } 
            else if (arr[i] < 0) {
                System.out.println(arr[i] + " is Negative");
            } 
            else {
                System.out.println(arr[i] + " is Zero");
            }
        } 
        if (arr[0] == arr[arr.length - 1]) {
            System.out.println(arr[0] + " equals " + arr[arr.length - 1]);
        } 
        else if (arr[0] > arr[arr.length - 1]) {
            System.out.println(arr[0] + " is greater than " + arr[arr.length - 1]);
        } 
        else {
            System.out.println(arr[0] + " is less than " + arr[arr.length - 1]);
        } 
    }
}
