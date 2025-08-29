/*
33.	Even or Odd (Ternary)
Scenario: Take a number and check if it is even or odd using ternary operator.
Input:
Enter a number: 17
Output: Number is Odd

*/
import java.util.Scanner;

public class EvenOdd
{
    public static void main(String args[]) 
	{   
	    int num;
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        
        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println("Number is " + result);

        
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac EvenOdd.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java EvenOdd
Enter a number: 17
Number is Odd
*/