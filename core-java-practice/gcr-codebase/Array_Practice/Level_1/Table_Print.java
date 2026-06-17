/*
3. Create a program to print a multiplication table of a number.
Hint => 
Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 1
Run a loop from 1 to 10 and store the results in the multiplication table array
Finally, display the result from the array in the format number * i = ___

 */
package Level_1;

import java.util.Scanner;

public class Table_Print {
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
