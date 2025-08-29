/*
37.	Leap Year Check (Ternary)
Scenario: Take a year as input and check if it is a leap year using ternary operator.

Input:
Enter year: 2024

Output: Leap Year

*/

import java.util.Scanner;

 class LeapYearCheck 
{
    public static void main(String args[]) 
	{
		int year;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        year = sc.nextInt();

       
        String result = ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                        ? "Leap Year"
                        : "Not a Leap Year";

        System.out.println(result);

        
		
    }
}	
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac LeapYearCheck.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java LeapYearCheck
Enter year: 2024
2024 is a leap year.  */
