/*
43.	Sum of Digits of a Number
Scenario: Take a number as input and print the sum of its digits.
Input:
Enter number: 482
Output:
Sum of digits: 14

*/

import java.util.Scanner;

public class SumOfDigits
 {
    public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
		
        int num = sc.nextInt();
        int sum = 0, temp = Math.abs(num);

        while (temp > 0)
		{
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac SumOfDigits.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java SumOfDigits
Enter number: 482
Sum of digits: 14
*/