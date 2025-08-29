/*
21. Day of the Week (Ternary)
Scenario: Take an int (1–7) and print the corresponding day of the week using ternary operators.
Input:
Enter day number: 3
Output:
Day is Wednesday

*/

import java.util.Scanner;

class DayOfWeek 
{
    public static void main(String[] args) 
	{   
	    int day;
		String result;
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        day = sc.nextInt();

               result = (day == 1) ? "Day is Monday" :
                        (day == 2) ? "Day is Tuesday" :
                        (day == 3) ? "Day is Wednesday" :
                        (day == 4) ? "Day is Thursday" :
                        (day == 5) ? "Day is Friday" :
                        (day == 6) ? "Day is Saturday" :
                        (day == 7) ? "Day is Sunday" :
                        "Invalid day number";

        System.out.println(result);

        
    }
}

/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac DayOfWeek.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java DayOfWeek
Enter day number (1-7): 3
Day is Wednesday
*/
