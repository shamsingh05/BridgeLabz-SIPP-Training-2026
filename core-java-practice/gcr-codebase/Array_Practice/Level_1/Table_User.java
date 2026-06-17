/*
5.Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint => 
Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___    */

 

package Level_1;
import java.util.Scanner;
public class Table_User {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        Table(n,1);
    }
    public static void Table(int n,int start){
        if(start==11){
            return;
        }
        System.out.println(n+"*"+start+"="+n*start);
        Table(n,start+1);
    } 
}

