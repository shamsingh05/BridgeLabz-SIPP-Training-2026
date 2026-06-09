public class Distance { 
    public static void main(String[] args) { 
        double distanceKm = 100.0; 
        
        double kmToMilesConversion = 0.621371;
        double distanceMiles = distanceKm * kmToMilesConversion;
        
        System.out.println("The distance of " + distanceKm + " kilometers is equal to " + distanceMiles + " miles.");
    } 
}