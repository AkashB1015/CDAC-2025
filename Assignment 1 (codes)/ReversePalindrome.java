/*
44.	Reverse 4-Digit Number and Palindrome Check
Scenario: Take a 4-digit number, reverse it, and check if it is a palindrome.
Input:
Enter 4-digit number: 1221
Output:
Reversed number: 1221 Palindrome: Yes

*/
import java.util.Scanner;

 class ReversePalindrome 
 {
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
		
        int num = sc.nextInt();
        int original = num, reverse = 0;

        while (num > 0) 
		{
            reverse = reverse * 10 + (num % 10);
            num /= 10;
        }

        System.out.println("Reversed number: " + reverse);
        System.out.println("Palindrome: " + (reverse == original ? "Yes" : "No"));
       
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac ReversePalindrome.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java ReversePalindrome
Enter 4-digit number: 1221
Reversed number: 1221
Palindrome: Yes
*/