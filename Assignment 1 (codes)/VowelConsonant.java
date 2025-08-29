/*
16.	Vowel or Consonant Checker
Scenario: Take a character input and print whether it is a vowel or consonant. Print error for invalid input.
Input:
Enter a character: e
Output: Vowel

*/

import java.util.Scanner;

public class VowelConsonant
{
    public static void main(String args[]) 
	{
		char ch;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
         ch = sc.next().charAt(0);

        
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
		{
          
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') 
			{
                System.out.println("Vowel");
            } 
			else 
			{
                System.out.println("Consonant");
            }
        } 
		else 
		{
            System.out.println("Error: Invalid input (not a letter).");
        }
        
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac VowelConsonant.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java VowelConsonant
Enter a character: e
Vowel
*/