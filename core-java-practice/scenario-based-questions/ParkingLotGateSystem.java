import java.util.Scanner;

class ParkingLotGateSystem {
    
    private int totalCapacity;
    private int currentOccupancy;
    private static final int PARKING_FEE_PER_HOUR = 50; 
    
    public ParkingLotGateSystem(int capacity) {
        this.totalCapacity = capacity;
        this.currentOccupancy = 0;
    }
    
    public int getAvailableSpaces() {
        return totalCapacity - currentOccupancy;
    }

    public boolean isParkingFull() {
        return currentOccupancy >= totalCapacity;
    }
    
    public boolean parkVehicle() {
        if (isParkingFull()) {
            System.out.println("\n❌ PARKING LOT FULL!");
            System.out.println("No spaces available. Please try again later.");
            return false;
        }
        
        currentOccupancy++;
        System.out.println("\n✓ VEHICLE PARKED SUCCESSFULLY");
        System.out.println("Parking Space #: " + currentOccupancy);
        System.out.println("Entry Time: " + getCurrentTime());
        return true;
    }
    
    public boolean exitVehicle(int hoursParked) {
        if (currentOccupancy <= 0) {
            System.out.println("\n PARKING LOT EMPTY!");
            System.out.println("No vehicles to exit.");
            return false;
        }
        
        if (hoursParked <= 0) {
            System.out.println(" Invalid parking duration!");
            return false;
        }
        
        currentOccupancy--;
        int totalFee = hoursParked * PARKING_FEE_PER_HOUR;
        
        System.out.println("\n✓ VEHICLE EXITED SUCCESSFULLY");
        System.out.println("Parking Duration: " + hoursParked + " hour(s)");
        System.out.println("Rate: Rs. " + PARKING_FEE_PER_HOUR + " per hour");
        System.out.println("Total Fee: Rs. " + totalFee);
        System.out.println("Exit Time: " + getCurrentTime());
        return true;
    }
    
    public void showOccupancy() {
        System.out.println("\n╔═════════════════════════════════════╗");
        System.out.println("║   PARKING LOT STATUS                ║");
        System.out.println("╠═════════════════════════════════════╣");
        System.out.printf("║ Total Capacity    : %20d ║\n", totalCapacity);
        System.out.printf("║ Currently Parked  : %20d ║\n", currentOccupancy);
        System.out.printf("║ Available Spaces  : %20d ║\n", getAvailableSpaces());
        
        double occupancyPercentage = (double) currentOccupancy / totalCapacity * 100;
        System.out.printf("║ Occupancy Rate    : %18.1f%% ║\n", occupancyPercentage);
        
        System.out.println("╠═════════════════════════════════════╣");
        System.out.println("║ Status: " + (isParkingFull() ? "FULL ❌" : "AVAILABLE ✓") + "                  ║");
        System.out.println("╚═════════════════════════════════════╝\n");
    }

    public void displayMenu() {
        System.out.println("\n╔════════════════════════════════════╗");
        System.out.println("║   PARKING LOT GATE SYSTEM MENU      ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ 1. Park Vehicle                    ║");
        System.out.println("║ 2. Exit Vehicle                    ║");
        System.out.println("║ 3. Show Occupancy Status           ║");
        System.out.println("║ 4. Exit System                     ║");
        System.out.println("╚════════════════════════════════════╝");
    }
 
    public String getCurrentTime() {
        long currentTimeMillis = System.currentTimeMillis();
        return new java.text.SimpleDateFormat("HH:mm:ss").format(new java.util.Date(currentTimeMillis));
    }
    
    public boolean isValidChoice(int choice) {
        return choice >= 1 && choice <= 4;
    }
    
    public void displayRates() {
        System.out.println("\n╔════════════════════════════════════╗");
        System.out.println("║   PARKING RATES                    ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ Rate: Rs. " + PARKING_FEE_PER_HOUR + " per hour             ║");
        System.out.println("║                                    ║");
        System.out.println("║ Example:                           ║");
        System.out.println("║ 1 hour  : Rs. " + PARKING_FEE_PER_HOUR + "                    ║");
        System.out.println("║ 2 hours : Rs. " + (2 * PARKING_FEE_PER_HOUR) + "                   ║");
        System.out.println("║ 3 hours : Rs. " + (3 * PARKING_FEE_PER_HOUR) + "                   ║");
        System.out.println("╚════════════════════════════════════╝\n");
    }
    
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("\n╔════════════════════════════════════╗");
            System.out.println("║   SMART PARKING LOT GATE SYSTEM    ║");
            System.out.println("║          WELCOME                   ║");
            System.out.println("╚════════════════════════════════════╝");
            
            System.out.print("\nEnter parking lot capacity: ");
            int capacity = scanner.nextInt();
            
            if (capacity <= 0) {
                System.out.println("❌ Capacity must be greater than 0!");
                scanner.close();
                return;
            }
            
            ParkingLotGateSystem parkingLot = new ParkingLotGateSystem(capacity);
            parkingLot.displayRates();
            
            boolean continueOperation = true;
            
            while (continueOperation) {
                parkingLot.displayMenu();
                System.out.print("Enter your choice (1-4): ");
                
                int choice = 0;
                try {
                    choice = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("❌ Invalid input! Please enter a number between 1 and 4.");
                    scanner.nextLine(); 
                    continue;
                }
                
                switch (choice) {
                    case 1:
                        if (parkingLot.parkVehicle()) {
                            parkingLot.showOccupancy();
                        }
                        break;
                    
                    case 2:
                        System.out.print("Enter parking duration (hours): ");
                        try {
                            int hours = scanner.nextInt();
                            if (parkingLot.exitVehicle(hours)) {
                                parkingLot.showOccupancy();
                            }
                        } catch (Exception e) {
                            System.out.println(" Invalid input! Please enter a valid number.");
                            scanner.nextLine(); 
                        }
                        break;
                    
                    case 3:
                        parkingLot.showOccupancy();
                        break;
                    
                    case 4:
                        continueOperation = false;
                        System.out.println("\n✓ THANK YOU FOR USING OUR PARKING SYSTEM!");
                        System.out.println("Final Occupancy: " + parkingLot.currentOccupancy + "/" + parkingLot.totalCapacity);
                        break;
                    
                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                }
                
                if (parkingLot.isParkingFull() && choice == 1) {
                    System.out.println("\n⚠ PARKING LOT IS NOW FULL!");
                    continueOperation = false;
                }
            }
            
            System.out.println("\n════════════════════════════════════\n");
            scanner.close();
        } catch (Exception e) {
            System.out.println(" Error: " + e.getMessage());
        }
    }
}
