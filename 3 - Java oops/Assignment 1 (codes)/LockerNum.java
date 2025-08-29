/*
4.	Even or Odd Locker Number
Scenario: Your school assigns lockers with numbers. Take locker number as input and print whether it is even or odd.
Input:
Enter locker number: 17
Output:
Odd locker number

*/

import java.util.Scanner;

class LockerNum {
	
	public static void main(String args[])
	{
		int num1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Locker number: ");
		num1 = sc.nextInt();
		
		if(num1 % 2 ==0)
		{
		  System.out.println(" Even locker number. ");
		}
		else
		{
			System.out.println(" Odd locker number. ");
		}
	}
}
/*

PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac LockerNum.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java LockerNum
Enter the Locker number: 17
 Odd locker number.
 
*/
