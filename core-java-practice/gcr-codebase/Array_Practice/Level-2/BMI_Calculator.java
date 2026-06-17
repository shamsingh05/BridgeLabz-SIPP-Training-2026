/*
6.An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint => 
Take input for a number of persons
Create arrays to store the weight, height, BMI, and weight status of the persons
Take input for the weight and height of the persons
Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
Display the height, weight, BMI, and weight status of each person
Use the table to determine the weight status of the person

 */
package Level_2;

import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n]; 
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            weight[i] = sc.nextDouble(); 
            height[i] = sc.nextDouble(); 
            bmi[i] = weight[i] / (height[i] * height[i]); 
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } 
            else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } 
            else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } 
            else {
                status[i] = "Obese";
            }
        } 
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",height[i], weight[i], bmi[i], status[i]);
        }
    }
}
