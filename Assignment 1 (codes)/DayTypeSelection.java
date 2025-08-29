/*
29.	Day Type Selection
Scenario: Take user input for day type (1–Workday, 2–Weekend) and print working status.
Input:
Enter day type (1–Workday, 2–Weekend): 2
Output:
It’s weekend. No work today.

*/

import java.util.Scanner;

public class DayTypeSelection 
{
    public static void main(String args[]) 
	{   
      	int dayType;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day type (1–Workday, 2–Weekend): ");
        dayType = sc.nextInt();

        switch (dayType) 
		{
            case 1:
                System.out.println("It’s a workday. Time to work!");
                break;
				
            case 2:
                System.out.println("It’s weekend. No work today.");
                break;
				
            default:
                System.out.println("Invalid input. Please enter 1 for Workday or 2 for Weekend.");
        }

        sc.close();
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac DayTypeSelection.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java DayTypeSelection
Enter day type (1?Workday, 2?Weekend): 2
It?s weekend. No work today.
*/