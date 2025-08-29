/*
22. Month Name from Number
Scenario: Take month number (1–12) and print the month name using ternary operators or if-else.
Input:
Enter month number: 8
Output:
Month is August

*/

import java.util.Scanner;

class MonthName
{
    public static void main(String[] args) 
	{
		int month;
		String result;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        month = sc.nextInt();

        
        if (month == 1) result = "Month is January";
        else if (month == 2) result = "Month is February";
        else if (month == 3) result = "Month is March";
        else if (month == 4) result = "Month is April";
        else if (month == 5) result = "Month is May";
        else if (month == 6) result = "Month is June";
        else if (month == 7) result = "Month is July";
        else if (month == 8) result = "Month is August";
        else if (month == 9) result = "Month is September";
        else if (month == 10) result = "Month is October";
        else if (month == 11) result = "Month is November";
        else if (month == 12) result = "Month is December";
        else result = "Invalid month number";

        System.out.println(result);
	   
    }
}

/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)>  javac  MonthName.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java  MonthName
Enter month number (1-12): 8
Month is August
*/
