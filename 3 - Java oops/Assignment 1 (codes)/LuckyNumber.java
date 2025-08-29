/*
15.	Lucky Number Check
Scenario: A 4-digit number ABCD is lucky if A+B = C+D. Check if a number is lucky.

Input:
Enter 4-digit number: 3521

Output:
Not a lucky number

*/

import java.util.Scanner;

public class LuckyNumber 
{
    public static void main(String args[]) 
	{
	    int num;
		int d1,d2,d3,d4;
		
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter 4-digit number: ");
         num = sc.nextInt();

         d1 = num / 1000;        
         d2 = (num / 100) % 10;  
         d3 = (num / 10) % 10;   
         d4 = num % 10;          

        
        if ((d1 + d2) == (d3 + d4)) 
		{
            System.out.println("Lucky number");
        } 
		
		else 
		{
            System.out.println("Not a lucky number");
        }   
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac LuckyNumber.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java LuckyNumber
Enter 4-digit number: 3521
Not a lucky number

*/