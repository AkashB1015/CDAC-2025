/*
46.	Character Type Checker
Scenario: Take a character as input and print whether it is an alphabet, digit, or special character.
Input:
Enter character: %
Output:
Special Character

*/

import java.util.Scanner;

class CharTypeChecker 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) 
		{
            System.out.println("Alphabet");
        } 
		else if (Character.isDigit(ch)) 
		{
            System.out.println("Digit");
        } 
		else 
		{
            System.out.println("Special Character");
        }
        
    }
}

/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac CharTypeChecker.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java CharTypeChecker
Enter character: %
Special Character
*/
