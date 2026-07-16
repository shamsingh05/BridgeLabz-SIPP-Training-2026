/*
7.Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
Hint => 
Take input for a number of persons
Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
double[][] personData = new double[number][3];
String[] weightStatus = new String[number];
Take input for weight and height of the persons and for negative values, ask the user to enter positive values
Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
Display the height, weight, BMI and status of each person

 */

package Level_2;

import java.util.Scanner;

public class BMI_MultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int number = sc.nextInt(); 
        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number]; 
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1)); 
            double height;
            do {
                System.out.print("Enter height (in meters, positive): ");
                height = sc.nextDouble();
            } 
            while (height <= 0); 
            double weight;
            do { 
                weight = sc.nextDouble();
            } 
            while (weight <= 0);

            personData[i][0] = height;
            personData[i][1] = weight; 
            double bmi = weight / (height * height);
            personData[i][2] = bmi; 
            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 24.9)
                weightStatus[i] = "Normal";
            else if (bmi < 29.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        } 
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        } 
    }
}
