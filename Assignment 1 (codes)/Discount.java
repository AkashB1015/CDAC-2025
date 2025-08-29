/*
8.	Shop Discount Calculation
Scenario: A shop offers 10% discount if the purchase amount exceeds 1000. Take total purchase amount as input and calculate final cost.
Input:
Enter total purchase amount: 1200
Output:
Final cost after discount: 1080

*/

import java.util.Scanner;
class Discount {
	
	public static void main(String args[])
	{
		double amount;
		 double finalcost;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter total purchase amount: ");
		amount = sc.nextInt();
		
		if(amount> 1000)
		{
			finalcost =amount - (amount * 0.10);
		}
		else
		{
			finalcost=amount;
			
		}
		
		System.out.println("Final cost after discount : " +finalcost);
		
	}
		
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac Discount.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java Discount
Enter total purchase amount: 1200
Final cost after discount : 1080.0
*/