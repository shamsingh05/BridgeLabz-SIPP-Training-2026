public class HarshadNumber {
    public static void main(String[] args) {
        int number = 21;
        int tempNumber = number;
        int sum = 0;
        
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sum = sum + digit;
            tempNumber = tempNumber / 10;
        }
        
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
            System.out.println("Sum of digits: " + sum);
        } else {
            System.out.println(number + " is not a Harshad Number.");
            System.out.println("Sum of digits: " + sum);
        }
    }
}
