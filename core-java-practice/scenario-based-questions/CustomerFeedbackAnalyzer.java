import java.io.*;

public class CustomerFeedbackAnalyzer {
    public static void main(String[] args) {

        String inputFile = "core-java-practice/scenario-based-questions/feedback.txt";

        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));

            String line;

            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("good")) {
                    count++;
                }
            }

            br.close();

            System.out.println("Good Feedback Count = " + count);

        } catch (FileNotFoundException e) {
            System.out.println("Error: feedback.txt file not found.");
        } catch (IOException e) {
            System.out.println("Error while reading the file.");
        }
    }
}