public class StudentGradeCard {
    
    // Method to generate random 2-digit scores for PCM
    public static int[][] generateRandomScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3];
        
        for (int i = 0; i < numberOfStudents; i++) {
            // Generate random scores for Physics, Chemistry, Math (0-100)
            scores[i][0] = (int) (Math.random() * 101); // Physics
            scores[i][1] = (int) (Math.random() * 101); // Chemistry
            scores[i][2] = (int) (Math.random() * 101); // Maths
        }
        
        return scores;
    }
    
    // Method to calculate total, average, and percentage
    public static String[][] calculateStats(int[][] scores) {
        String[][] stats = new String[scores.length][4];
        
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            stats[i][0] = String.valueOf(total);
            stats[i][1] = String.format("%.2f", average);
            stats[i][2] = String.format("%.2f", percentage);
        }
        
        return stats;
    }
    
    // Method to calculate grades
    public static String[] calculateGrades(String[][] stats) {
        String[] grades = new String[stats.length];
        
        for (int i = 0; i < stats.length; i++) {
            double percentage = Double.parseDouble(stats[i][2]);
            
            if (percentage >= 90) {
                grades[i] = "A+";
            } else if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B+";
            } else if (percentage >= 60) {
                grades[i] = "B";
            } else if (percentage >= 50) {
                grades[i] = "C";
            } else if (percentage >= 40) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        
        return grades;
    }
    
    // Method to display scorecard in tabular format
    public static void displayScorecard(int[][] scores, String[][] stats, String[] grades) {
        System.out.println("\n+-------+----------+-----------+---------+-------+---------+-------+-------+");
        System.out.println("| Stud# | Physics  | Chemistry | Maths   | Total | Average | Perc% | Grade |");
        System.out.println("+-------+----------+-----------+---------+-------+---------+-------+-------+");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("| %5d | %8d | %9d | %7d | %5s | %7s | %5s | %5s |%n",
                (i + 1), scores[i][0], scores[i][1], scores[i][2],
                stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
        
        System.out.println("+-------+----------+-----------+---------+-------+---------+-------+-------+");
    }
    
    public static void main(String[] args) {
        int numberOfStudents = 10;
        
        System.out.println("=== Student Grade Card ===");
        System.out.println("Number of Students: " + numberOfStudents);
        
        // Generate random scores for PCM
        int[][] scores = generateRandomScores(numberOfStudents);
        
        // Calculate total, average, and percentage
        String[][] stats = calculateStats(scores);
        
        // Calculate grades
        String[] grades = calculateGrades(stats);
        
        // Display scorecard
        displayScorecard(scores, stats, grades);
        
        // Display statistics
        System.out.println("\n=== Grade Distribution ===");
        int[] gradeCount = new int[7]; // A+, A, B+, B, C, D, F
        String[] gradeLabels = {"A+", "A", "B+", "B", "C", "D", "F"};
        
        for (String grade : grades) {
            for (int i = 0; i < gradeLabels.length; i++) {
                if (grade.equals(gradeLabels[i])) {
                    gradeCount[i]++;
                    break;
                }
            }
        }
        
        for (int i = 0; i < gradeLabels.length; i++) {
            System.out.println("Grade " + gradeLabels[i] + ": " + gradeCount[i] + " students");
        }
    }
}
