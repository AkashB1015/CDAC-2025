/*
4.	Even or Odd Locker Number
Scenario: Your school assigns lockers with numbers. Take locker number as input and print whether it is even or odd.
Input:
Enter locker number: 17
Output:
Odd locker number

*/


import java.util.Scanner;

class BankTransaction {
	public static void main(String args[])
	{
		int amu;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter transaction amount: ");
		amu =sc.nextInt();
		
		if(amu >0)
		{
			System.out.println("Deposit transaction.");
		}
		else if(amu < 0)
		{
			System.out.println("Withdrawal transaction.");
		}
		else
		{
			System.out.println("No transaction .");
		}
	}

}

/*

PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac BankTransaction.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java BankTransaction
Enter transaction amount: -2500
Withdrawal transaction.

*/