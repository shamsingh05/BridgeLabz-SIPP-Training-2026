import java.util.Scanner;

public class BMI { 
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // convert cm to m
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi <= 18.4) status = "Underweight";
        else if (bmi <= 24.9) status = "Normal";
        else if (bmi <= 39.9) status = "Overweight";
        else status = "Obese";

        return new String[]{String.format("%.2f", bmi), status};
    } 
    public static String[][] computeResults(double[][] data) {
        String[][] result = new String[data.length][4]; 

        for (int i = 0; i < data.length; i++) {
            result[i][0] = String.valueOf(data[i][0]);  
            result[i][1] = String.valueOf(data[i][1]); 
            String[] bmiData = calculateBMI(data[i][0], data[i][1]);
            result[i][2] = bmiData[0];  
            result[i][3] = bmiData[1]; 
        }
        return result;
    } 
    public static void display(String[][] table) { 
        for (String[] row : table) {
            for (String col : row) {
                System.out.print(col + "\t\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; // weight, height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) of student " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) of student " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        String[][] results = computeResults(data);
        display(results); 
    }
}
