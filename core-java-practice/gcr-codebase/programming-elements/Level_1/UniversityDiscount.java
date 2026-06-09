public class UniversityDiscount {
    public static void main(String[] args) {
        double originalPrice = 125000.0; 
        double discountPercent = 10.0;
        
        double discountAmount = (discountPercent / 100) * originalPrice; 
        double discountedPrice = originalPrice - discountAmount;
        
        System.out.println("Original Price: $" + originalPrice);
        System.out.println("Discount Percentage: " + discountPercent + "%");
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Discounted Price: $" + discountedPrice);
    }
}
