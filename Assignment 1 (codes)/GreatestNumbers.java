/*
31. Greatest of Two Numbers (Ternary)
Scenario: You want to quickly compare two numbers. Take two numbers as input and print the greatest
using a ternary operator.
Input:
Enter first number: 45
Enter second number: 30
Output:
Greatest number: 45

*/

import java.util.Scanner;

public class GreatestNumbers 
{
    public static void main(String args[]) 
	{
		int num1,num2;
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
         num1 = sc.nextInt();
        System.out.print("Enter second number: ");
         num2 = sc.nextInt();

        
        int greatest = (num1 > num2) ? num1 : num2;

        System.out.println("Greatest number: " + greatest);

        
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac GreatestNumbers.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java GreatestNumbers
Enter first number: 45
Enter second number: 30
Greatest number: 45
*/