/*
14.	Reverse a 4-Digit Number
Scenario: Take a 4-digit number and print its reverse.

Input:
Enter 4-digit number: 1234

Output:
Reversed number: 4321

*/

import java.util.Scanner;

public class ReverseNumber 
{
    public static void main(String args[]) 
	{
	    int num;
		int digit;
		int rev = 0;
		 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-digit number: ");
        num = sc.nextInt();
       
        while (num > 0)
		{
            digit = num % 10; 
			
            rev = rev * 10 + digit; 
			
            num = num / 10;        
        }

        System.out.println("Reversed number: " + rev);

    }
}

/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac ReverseNumber.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java ReverseNumber
Enter 4-digit number: 1234
Reversed number: 4321

*/