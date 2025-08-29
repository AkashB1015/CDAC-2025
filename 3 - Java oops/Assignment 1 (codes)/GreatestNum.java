/*
2.	Highest Salary Among Three Offers
Scenario: You have three job offers. Take the offered salaries as input and print which company is offering the highest salary.
Input:
Enter salary for Company 1: 45000
Enter salary for Company 2: 52000
Enter salary for Company 3: 50000
Output:
Company 2 offers the highest salary.

*/



import java.util.Scanner;

class GreatestNum {
	public static void main(String args[])
	{
	    int num1;
	    int num2;
	
	   Scanner sc = new Scanner(System.in);
	
	   System.out.print("Enter Score for Test 1 = ");
	   num1=sc.nextInt();
	
	   System.out.print("Enter Score for Test 2 = ");
	   num2=sc.nextInt();
	
	if(num1>num2)
	{
		System.out.println("Test 1 has higher score ");
	}
	else
	{
		System.out.println("Test 2 has higher score ");
	}
	
	}
}

/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac GreatestNum.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java GreatestNum
Enter Score for Test 1 = 78
Enter Score for Test 2 = 85
Test 2 has higher score     */