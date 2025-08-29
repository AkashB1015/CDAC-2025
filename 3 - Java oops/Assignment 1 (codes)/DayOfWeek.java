/*
18.	Day of the Week
Scenario: Take day number (1–7) and print the day name.

Input:
Enter day number: 4

Output:
Day is Thursday

*/
import java.util.Scanner;

public class DayOfWeek 
{
    public static void main(String args[]) 
	{
	     int day;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
         day = sc.nextInt();

        switch (day) 
		{
            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println("Day is Sunday");
                break;
            default:
                System.out.println("Invalid day number (enter 1-7 only).");
        }

       
    }
}
/*

PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac DayOfWeek.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java DayOfWeek
Enter day number (1-7): 4
Day is Thursday

*/