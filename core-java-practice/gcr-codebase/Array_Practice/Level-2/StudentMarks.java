package Level2;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int[][] marks = new int[n][3]; 
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ": ");
            marks[i][0] = sc.nextInt(); 
            marks[i][1] = sc.nextInt(); 
            marks[i][2] = sc.nextInt();
        } 
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = total / 3.0; 
            String grade;
            if (percentage >= 85) grade = "A";
            else if (percentage >= 70) grade = "B";
            else if (percentage >= 50) grade = "C";
            else grade = "D"; 
            System.out.println("\nStudent " + (i + 1) + " Result:");
            System.out.println("Total Marks = " + total);
            System.out.println("Percentage = " + percentage);
            System.out.println("Grade = " + grade);
        } 
    }
}
