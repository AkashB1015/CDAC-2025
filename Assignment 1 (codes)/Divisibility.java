/*
17.	Divisibility Check
Scenario: Check if a number is divisible by 2, 3, and 5 using nested if-else.

Input:
Enter number: 30

Output: Divisible by 2
Divisible by 3
Divisible by 5

*/

import java.util.Scanner;

public class Divisibility
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        
        if (num % 2 == 0) 
		{
            System.out.println("Divisible by 2");
			
            if (num % 3 == 0)
			{
                System.out.println("Divisible by 3");
				
                if (num % 5 == 0) 
				{
                    System.out.println("Divisible by 5");
                }
            }
        } 
		
		else if (num % 3 == 0) 
		{
            System.out.println("Divisible by 3");
			
            if (num % 5 == 0) 
			{
                System.out.println("Divisible by 5");
            }
        } 
		else if (num % 5 == 0) 
		{
            System.out.println("Divisible by 5");
        } 
		else 
		{
            System.out.println("Not divisible by 2, 3, or 5");
        }
       
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac Divisibility.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java Divisibility
Enter number: 30
Divisible by 2
Divisible by 3
Divisible by 5
*/