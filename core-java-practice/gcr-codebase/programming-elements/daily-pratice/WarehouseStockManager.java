import java.util.HashSet;
import java.util.Scanner;

public class WarehouseStockManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] stock = new int[size];

        int maxStock = Integer.MIN_VALUE;
        int minStock = Integer.MAX_VALUE;
        int totalStock = 0;

        HashSet<Integer> uniqueStocks = new HashSet<>();
        boolean hasDuplicates = false;

        for (int i = 0; i < size; i++) {
            stock[i] = scanner.nextInt();

            maxStock = Math.max(maxStock, stock[i]);
            minStock = Math.min(minStock, stock[i]);
            totalStock += stock[i];

            if (!uniqueStocks.add(stock[i])) {
                hasDuplicates = true;
            }
        }

        System.out.println("Maximum Stock: " + maxStock);
        System.out.println("Minimum Stock: " + minStock);
        System.out.println("Total Stock: " + totalStock);
        System.out.println("Duplicates Present: " + hasDuplicates);

        int rotations = scanner.nextInt();
        rotateArray(stock, rotations);

        System.out.print("Rotated Stock Array: ");
        for (int value : stock) {
            System.out.print(value + " ");
        }
        System.out.println();

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] shelfGrid = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                shelfGrid[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Transposed Shelf Grid:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(shelfGrid[j][i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void rotateArray(int[] array, int rotations) {
        int length = array.length;
        rotations %= length;

        reverse(array, 0, length - 1);
        reverse(array, 0, rotations - 1);
        reverse(array, rotations, length - 1);
    }

    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}