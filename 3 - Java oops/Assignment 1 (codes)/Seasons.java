/*
26. Season Based on Month
Scenario: Print season based on month number:
● Dec–Feb → Winter
● Mar–May → Summer
● Jun–Aug → Monsoon
● Sep–Nov → Autumn
Input:
Enter month number: 12
Output:
Season is Winter

*/

import java.util.Scanner;

public class Seasons 
{
    public static void main(String args[]) 
	{   int month;
	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
         month = sc.nextInt();

        switch (month) 
		{
            case 12:
            case 1:
            case 2:
                System.out.println("Season is Winter");
                break;
				
            case 3:
            case 4:
            case 5:
                System.out.println("Season is Summer");
                break;
				
            case 6:
            case 7:
            case 8:
                System.out.println("Season is Monsoon");
                break;
				
            case 9:
            case 10:
            case 11:
                System.out.println("Season is Autumn");
                break;
				
            default:
                System.out.println("Invalid month number. Please enter 1-12.");
        }

        sc.close();
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac Seasons.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java Seasons
Enter month number (1-12): 12
Season is Winter
*/