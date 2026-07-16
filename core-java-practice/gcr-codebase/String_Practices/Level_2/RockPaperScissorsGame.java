import java.util.Scanner;

public class RockPaperScissorsGame {
    
    // Method to find computer choice using Math.random()
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        
        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }
    
    // Method to find winner between user and computer
    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "Tie";
        }
        
        // Rock beats Scissors
        if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
            (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }
    
    // Method to calculate statistics
    public static String[][] calculateStatistics(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[3][2];
        
        stats[0][0] = "User Wins";
        stats[0][1] = String.valueOf(userWins);
        
        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);
        
        double userPercentage = (totalGames > 0) ? (userWins * 100.0) / totalGames : 0;
        double computerPercentage = (totalGames > 0) ? (computerWins * 100.0) / totalGames : 0;
        
        stats[2][0] = "Win Percentage";
        stats[2][1] = String.format("User: %.2f%% | Computer: %.2f%%", userPercentage, computerPercentage);
        
        return stats;
    }
    
    // Method to display game results
    public static void displayGameResults(String userChoice, String computerChoice, String winner) {
        System.out.printf("User: %-10s | Computer: %-10s | Winner: %s%n", userChoice, computerChoice, winner);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of games to play: ");
        int totalGames = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        int userWins = 0;
        int computerWins = 0;
        int ties = 0;
        
        System.out.println("\n=== Rock-Paper-Scissors Game ===\n");
        
        for (int i = 0; i < totalGames; i++) {
            System.out.print("Game " + (i + 1) + " - Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = scanner.nextLine();
            
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);
            
            displayGameResults(userChoice, computerChoice, winner);
            
            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                ties++;
            }
        }
        
        // Calculate and display statistics
        String[][] statistics = calculateStatistics(userWins, computerWins, totalGames);
        
        System.out.println("\n=== Game Statistics ===");
        System.out.println("+------------------+----------+");
        System.out.println("| Statistic        | Value    |");
        System.out.println("+------------------+----------+");
        
        for (String[] stat : statistics) {
            System.out.printf("| %-16s | %-8s |%n", stat[0], stat[1]);
        }
        
        System.out.printf("| %-16s | %-8d |%n", "Ties", ties);
        System.out.println("+------------------+----------+");
        
        scanner.close();
    }
}
