/*
23. Basic Calculator Using Switch-Case
Scenario: Create a calculator that uses switch-case for operators (+, -, *, /) and prints result.
Input:
Enter first number: 15
Enter second number: 3
Enter operator: /
Output:
Result: 5

*/

import java.util.Scanner;

class Calculator 
{
    public static void main(String args[]) 
	{  
	int num1,num2,num3;
	char ch;
	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        ch = sc.next().charAt(0);

        switch(ch) 
		{
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
				
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
				
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
				
            case '/':
                if(num2 != 0)
                    System.out.println("Result: " + (num1 / num2));
                else
                    System.out.println("Cannot divide by zero");
                break;
				
            default:
                System.out.println("Invalid operator");
        }
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac Calculator.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java Calculator
Enter first number: 15
Enter second number: 3
Enter operator (+, -, *, /): /
Result: 5
*/