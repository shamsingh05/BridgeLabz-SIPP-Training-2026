/*
1. Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Define a double array to save salary and years of service for each of the 10 employees
Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary
Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. Note in this case you will have to decrement the index counter
Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop
Print the total bonus payout as well as the total old and new salary of all the employees

 */

package Level_2;

import java.util.Scanner;

public class Company_Zara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMPLOYEES = 10; 
        double[] salary = new double[EMPLOYEES];
        double[] years = new double[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES]; 
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0; 
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1)); 
            double s = sc.nextDouble(); 
            double y = sc.nextDouble(); 
            if (s <= 0 || y < 0) {
                System.out.println(" Invalid input! Please re-enter details for this employee.");
                i--;  
                continue;
            }

            salary[i] = s;
            years[i] = y;
        } 
        for (int i = 0; i < EMPLOYEES; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; 
            }
            newSalary[i] = salary[i] + bonus[i]; 
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        } 
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Employee " + (i + 1) +  ": Old Salary = " + salary[i] +", Bonus = " + bonus[i] +", New Salary = " + newSalary[i]);
        }
        System.out.println("\n--- Company Totals ---");
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary); 
    }
}
