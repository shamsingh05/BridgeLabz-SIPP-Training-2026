public class Q4_MultipleCatchBlocks {
    public static void main(String[] args) {
        Integer[] arr = {10,20,30};
        int index = 5;
        try {
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch(NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}