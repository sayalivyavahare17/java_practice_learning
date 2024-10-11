/*Part 1: Commission Calculator
Using IntelliJ, write a Java app that takes numerical input from a user.
The app should calculate commission based on this chart used by the retail store.
Sales Range      Commission
above 10000$     30%
5001 - 9999$     20%
1001 - 4999$     10%
below 1000$      N/A
*/

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sales amount for which we have to calculate commission:");
        int sales_amount = sc.nextInt();
        int commission_per = 0;
        float com;

        if (sales_amount <= 1000) 
        {
            System.out.println("Sorry, better luck next time! Your sales amount does not qualify for a commission.");
        } 
        else if (sales_amount <= 4999)  
        {
            commission_per = 10;
            com = Calc_comm(commission_per, sales_amount);
            System.out.println("************************************");
            System.out.println("Your commission is calculated at 10%");
            System.out.println("Commission amount is: " + com);
            System.out.println("************************************");
        } 
        else if (sales_amount <= 9999)  
        {
            commission_per = 20;
            com = Calc_comm(commission_per, sales_amount);
            System.out.println("************************************");
            System.out.println("Your commission is calculated at 20%");
            System.out.println("Commission amount is: " + com);
            System.out.println("************************************");
        } 
        else  // Covers sales_amount > 10000
        {
            commission_per = 30;
            com = Calc_comm(commission_per, sales_amount);
            System.out.println("************************************");
            System.out.println("Your commission is calculated at 30%");
            System.out.println("Commission amount is: " + com);
            System.out.println("************************************");
        }

        sc.close();  
    }

    // Method to calculate the commission based on percentage and sales amount
    public static float Calc_comm(int commission_per, int sales_amount) 
    {
        return (sales_amount * commission_per) / 100.0f;
    }
}

