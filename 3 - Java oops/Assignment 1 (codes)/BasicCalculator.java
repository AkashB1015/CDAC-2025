/*
20.	Basic Calculator Using If-Else
Scenario: Create a calculator that takes two numbers and an operator (+, -, *, /) and prints result using nested if-else.
Input:
Enter first number: 10 Enter second number: 5 Enter operator: *
Output: Result: 50

*/

import java.util.Scanner;

public class BasicCalculator
 {
    public static void main(String[] args) 
	{   
	     double num1;
		 double num2;
		 char op;
		  
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        op = sc.next().charAt(0);

       
        if (op == '+') 
		{
            System.out.println("Result: " + (num1 + num2));
        } 
		else if (op == '-') 
		{
            System.out.println("Result: " + (num1 - num2));
        } 
		else if (op == '*') 
		{
            System.out.println("Result: " + (num1 * num2));
        } 
		else if (op == '/') 
		{
            if (num2 != 0) 
			{
                System.out.println("Result: " + (num1 / num2));
            } 
			else 
			{
                System.out.println("Error: Division by zero!");
            }
        } 
		else 
		{
            System.out.println("Error: Invalid operator!");
        }

        
    }
}

/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac  BasicCalculator.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java BasicCalculator
Enter first number: 10
Enter second number: 5
Enter operator (+, -, *, /): *
Result: 50.0

*/
