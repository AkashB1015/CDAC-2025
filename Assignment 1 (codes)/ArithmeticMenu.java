/*
30. Menu-Based Simple Arithmetic Operations
Scenario: Implement a menu-based program that asks user to select operation (Addition, Subtraction,
Multiplication, Division) and prints result.
Input:
Select operation (1-Addition, 2-Subtraction): 1
Enter first number: 20
Enter second number: 30
Output:
Result: 50

*/

import java.util.Scanner;
 class ArithmeticMenu 
{
    int choice;
	 double num1,num2;
	 
    public static void main(String args[]) 
	{
       int choice;
	   double num1,num2;
	
        Scanner sc = new Scanner(System.in);

        System.out.println("Select operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
		
        System.out.print("Enter your choice (1-4): ");
        choice = sc.nextInt();

        System.out.print("Enter first number: ");
         num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
         num2 = sc.nextDouble();

        switch (choice) 
		{
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
				
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
				
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
				
            case 4:
                if (num2 != 0) 
				{
                    System.out.println("Result: " + (num1 / num2));
                } else 
				{
                    System.out.println("Division by zero is not allowed.");
                }
                break;
				
            default:
                System.out.println("Invalid choice. Please select 1-4.");
        }

        
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac ArithmeticMenu.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java ArithmeticMenu
Select operation:
1 - Addition
2 - Subtraction
3 - Multiplication
4 - Division
Enter your choice (1-4): 1
Enter first number: 20
Enter second number: 30
Result: 50
*/