/*
36.	Smallest of Three Numbers (Nested Ternary)
Scenario: Take three numbers as input and print the smallest using nested ternary operator.
Input:
Enter numbers: 12, 8, 19
Output:
Smallest number: 8

*/

import java.util.Scanner;

public class SmallestOfThree 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

      
        int smallest = (num1 < num2) 
                        ? ((num1 < num3) ? num1 : num3) 
                        : ((num2 < num3) ? num2 : num3);

        System.out.println("Smallest number: " + smallest);

    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac SmallestOfThree.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java SmallestOfThree
Enter first number: 12
Enter second number: 8
Enter third number: 19
Smallest number: 8

*/