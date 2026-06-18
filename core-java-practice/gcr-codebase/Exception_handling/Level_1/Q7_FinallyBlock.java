import java.util.*;
public class Q7_FinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a=sc.nextInt(), b=sc.nextInt();
            System.out.println("Result: " + a/b);
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Operation completed");
        }
    }
}