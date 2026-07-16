package Level_2;

import java.util.Scanner;

public class Student_Grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        // b. Create arrays
        int[][] marks = new int[n][3]; 
        double[] percentage = new double[n];
        char[] grade = new char[n];
        // c. Take input for marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                int m;
                do {
                    if (j == 0) {
                        System.out.print("Physics marks (0-100): ");
                    }
                    else if (j == 1) {
                        System.out.print("Chemistry marks (0-100): ");
                    }
                    else {
                        System.out.print("Maths marks (0-100): ");
                    }
                    m = sc.nextInt();
                } 
                while (m < 0 || m > 100); 
                marks[i][j] = m;
            }
            // d. Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Assign grade
            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        } 
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%c\n",
                    marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        } 
    }
}
