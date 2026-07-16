package Level2;

import java.util.HashMap;
import java.util.Scanner;

public class Frequency_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt();
        int arr[] = new int[size]; 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        } 
        
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        } 
        for (int key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        } 
    }
}
