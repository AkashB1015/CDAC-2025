/*
25. Message Based on Number (1–5)
Scenario: Take a number (1–5) and print a message according to the case. Useful for simple menu
selection.
Input:
Enter a number: 3
Output:
You selected option 3.

*/

import java.util.Scanner;

public class MessageNum
{
    public static void main(String args[]) 
	{
	    int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-5): ");
        num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("You selected option 1.");
                break;
				
            case 2:
                System.out.println("You selected option 2.");
                break;
				
            case 3:
                System.out.println("You selected option 3.");
                break;
				
            case 4:
                System.out.println("You selected option 4.");
                break;
				
            case 5:
                System.out.println("You selected option 5.");
                break;
				
            default:
                System.out.println("Invalid option. Please enter a number between 1 and 5.");
        }
        
    }
}

/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac MessageNum.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java MessageNum
Enter a number (1-5): 3
You selected option 3.
*/

