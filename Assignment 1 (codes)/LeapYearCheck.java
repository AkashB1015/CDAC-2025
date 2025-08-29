/*
7.	Exam Pass or Fail
Scenario: A student gives an exam. Take marks (0–100) as input and print whether the student has passed (>=35) or failed.

Input:
Enter marks: 42

Output:
Student has passed.

*/

import java.util.Scanner;

public class LeapYearCheck 
{
    public static void main(String args[]) 
	{
		int year;
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter year: ");
         year = sc.nextInt();

        
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 
		{
            System.out.println(year + " is a leap year.");
        } 
		else 
		{
            System.out.println(year + " is not a leap year.");
        }

       
    }
}

/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac LeapYearCheck.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java LeapYearCheck
Enter year: 2024
2024 is a leap year.

*/