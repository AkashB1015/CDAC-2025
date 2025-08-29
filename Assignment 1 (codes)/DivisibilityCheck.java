/*
50.	Divisibility by 2, 3, 5 with Custom Messages
Scenario: Take a number and check divisibility by 2, 3, and 5, printing custom messages for each.

Input:
Enter number: 30

Output: Divisible by 2
Divisible by 3
Divisible by 5

*/

import java.util.Scanner;

class DivisibilityCheck 
{
    public static void main(String args[]) 
	{
	    int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = sc.nextInt();

      
        if (num % 2 == 0) 
		{
            System.out.println("Divisible by 2");
        }
        if (num % 3 == 0) 
		{
            System.out.println("Divisible by 3");
        }
        if (num % 5 == 0) 
		{
            System.out.println("Divisible by 5");
        }

        
    }
}

/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac DivisibilityCheck.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java DivisibilityCheck
Enter number: 30
Divisible by 2
Divisible by 3
Divisible by 5
*/
