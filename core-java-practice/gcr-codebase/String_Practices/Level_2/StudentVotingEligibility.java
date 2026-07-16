public class StudentVotingEligibility {
    
    // Method to generate random ages for students
    public static int[] generateStudentAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];
        
        for (int i = 0; i < numberOfStudents; i++) {
            // Generate random 2-digit age (10-99)
            ages[i] = 10 + (int) (Math.random() * 90);
        }
        
        return ages;
    }
    
    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][3];
        
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(i + 1);
            result[i][1] = String.valueOf(ages[i]);
            
            // Validate age
            if (ages[i] < 0) {
                result[i][2] = "Cannot Vote (Invalid Age)";
            } else if (ages[i] >= 18) {
                result[i][2] = "Can Vote";
            } else {
                result[i][2] = "Cannot Vote";
            }
        }
        
        return result;
    }
    
    // Method to display results in tabular format
    public static void displayResults(String[][] data) {
        System.out.println("\n+----------+-----+-------------------------+");
        System.out.println("| Student# | Age | Voting Eligibility      |");
        System.out.println("+----------+-----+-------------------------+");
        
        for (String[] row : data) {
            System.out.printf("| %-8s | %3s | %-23s |%n", row[0], row[1], row[2]);
        }
        
        System.out.println("+----------+-----+-------------------------+");
    }
    
    public static void main(String[] args) {
        int numberOfStudents = 10;
        
        System.out.println("=== Student Voting Eligibility Check ===");
        System.out.println("Number of Students: " + numberOfStudents);
        
        // Generate random ages
        int[] ages = generateStudentAges(numberOfStudents);
        
        // Check eligibility
        String[][] eligibilityData = checkVotingEligibility(ages);
        
        // Display results
        displayResults(eligibilityData);
        
        // Count eligible and non-eligible
        int eligible = 0, nonEligible = 0;
        
        for (String[] row : eligibilityData) {
            if (row[2].equals("Can Vote")) {
                eligible++;
            } else {
                nonEligible++;
            }
        }
        
        System.out.println("\nSummary:");
        System.out.println("Students who can vote: " + eligible);
        System.out.println("Students who cannot vote: " + nonEligible);
    }
}
