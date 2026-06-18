import java.io.*;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) {

        String outputFile = "core-java-practice/scenario-based-questions/expenses.txt";

        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter(outputFile, true); // Append mode
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.print("Enter expense category: ");
            String category = sc.nextLine();

            System.out.print("Enter amount: ");
            int amount = sc.nextInt();

            bw.write(category + " - " + amount);
            bw.newLine();

            bw.close();
            sc.close();

            System.out.println("Expense saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing to the file.");
        }
    }
}