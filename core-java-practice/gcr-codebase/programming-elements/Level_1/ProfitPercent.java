public class ProfitPercent {
    public static void main(String[] args) {
        double costPrice = 150.0; 
        double sellingPrice = 200.0; 
        
        double profit = sellingPrice - costPrice; 
        double profitPercent = (profit / costPrice) * 100; 
        
        System.out.println("Profit Percentage: " + profitPercent + "%");
    }
}
