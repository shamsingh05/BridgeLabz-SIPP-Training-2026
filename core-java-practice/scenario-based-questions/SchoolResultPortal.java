import java.io.*;
import java.util.*;

public class SchoolResultPortal {
    public static void main(String[] args) {
        String inputFile = "core-java-practice/scenario-based-questions/students.txt";
        String outputFile = "core-java-practice/scenario-based-questions/report.txt";

        try {
            File input = new File(inputFile);
            Scanner sc = new Scanner(input);

            FileWriter fw = new FileWriter(outputFile, true);  
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("\n========== REPORT CARD ==========\n");
            bw.write(String.format("%-15s %-10s\n", "Student", "Marks"));
            bw.write("-------------------------------\n");

            int total = 0;
            int count = 0;

            while (sc.hasNext()) {
                String name = sc.next();
                int marks = sc.nextInt();

                bw.write(String.format("%-15s %-10d\n", name, marks));

                total += marks;
                count++;
            }

            if (count > 0) {
                double average = (double) total / count;
                bw.write("-------------------------------\n");
                bw.write(String.format("Average Marks: %.2f\n", average));
            } else {
                bw.write("No student records found.\n");
            }

            bw.write("================================\n");

            sc.close();
            bw.close();

            System.out.println("Report generated successfully in " + outputFile);

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file '" + inputFile + "' not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
        }
    }
}