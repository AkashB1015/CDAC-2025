/*
41.	Check Armstrong Number (3-Digit)
Scenario: Take a 3-digit number and check if it is an Armstrong number (sum of cubes of digits = number).

Input:
Enter number: 153

Output:
153 is an Armstrong number

*/

import java.util.Scanner;

class ArmstrongNumber 
{
    public static void main(String[] args) 
	{
		int num;
		int sum = 0;
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number: ");
        num = sc.nextInt();

        int original = num;
      
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit; 
            num /= 10;
        }

       
        if (sum == original) 
		{
            System.out.println(original + " is an Armstrong number");
        } 
		else 
		{
            System.out.println(original + " is not an Armstrong number");
        }

    }
}
/*PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac ArmstrongNumber.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java ArmstrongNumber
Enter number: 153
153 is an Armstrong number
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac ArmstrongNumber.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java ArmstrongNumber
Enter number: 153
153 is an Armstrong number
*/