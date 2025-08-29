/*
32.Positive, Negative, or Zero (Ternary)
Scenario: Take a number and determine if it is positive, negative, or zero using ternary operator.
Input:
Enter a number: -12
Output:
Number is Negative

*/

import java.util.Scanner;

public class NumberTernary 
{
    public static void main(String args[]) 
	{
	    int num;
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

       
        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        System.out.println("Number is " + result);

        
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac NumberTernary.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java NumberTernary
Enter a number: -12
Number is Negative
*/