/*
9.	Employee Bonus Eligibility
Scenario: A company gives a 5% bonus to employees with more than 5 years of service. Take salary and years of service as input and print bonus amount.

Input:
Enter salary: 50000 Enter years of service: 6

Output:
Bonus amount: 2500
*/

import java.util.Scanner;

public class EmployeeBonus 
{
    public static void main(String[] args) 
	{
		double sal;
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
         sal = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = 0;

        
        if (years > 5) 
		{
            bonus = sal * 0.05;  
        }

   
        System.out.println("Bonus amount: " + bonus);

      
    }
}

/* 
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac EmployeeBonus.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java EmployeeBonus
Enter salary: 50000
Enter years of service: 6
Bonus amount: 2500.0
*/
