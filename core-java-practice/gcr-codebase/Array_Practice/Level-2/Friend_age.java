/*
2. Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
Finally display the youngest and tallest of the 3 friends

 */

package Level_2;

import java.util.Scanner;

public class Friend_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3]; 
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for " + friends[i] + ":"); 
            ages[i] = sc.nextInt(); 
            heights[i] = sc.nextDouble();

            if (ages[i] <= 0 || heights[i] <= 0) {
                System.out.println("Invalid input, please re-enter details for " + friends[i]);
                i--;  
            }
        } 
        int minAgeIndex = 0, maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }  
        System.out.println("Youngest Friend: " + friends[minAgeIndex] + " (Age: " + ages[minAgeIndex] + ")");
        System.out.println("Tallest Friend: " + friends[maxHeightIndex] + " (Height: " + heights[maxHeightIndex] + " cm)"); 
    }
}

