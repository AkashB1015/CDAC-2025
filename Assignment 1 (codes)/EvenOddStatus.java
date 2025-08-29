/*

47.	Even/Odd Status of Two Numbers
Scenario: Take two numbers and print if both are even, both odd, or mixed.
Input:
Enter first number: 12 Enter second number: 17
Output:
Numbers are mixed (one even, one odd)

*/

import java.util.Scanner;

public class EvenOddStatus 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        if (n1 % 2 == 0 && n2 % 2 == 0) 
		{
            System.out.println("Both numbers are even");
        } 
		else if (n1 % 2 != 0 && n2 % 2 != 0) 
		{
            System.out.println("Both numbers are odd");
        } 
		else 
		{
            System.out.println("Numbers are mixed (one even, one odd)");
        }
        
    }
}

/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac EvenOddStatus.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java EvenOddStatus
Enter first number: 12
Enter second number: 17
Numbers are mixed (one even, one odd)
*/