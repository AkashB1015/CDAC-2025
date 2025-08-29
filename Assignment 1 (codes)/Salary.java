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

class Salary {
  public static void main(String args[])
  {
	  int sal1,sal2,sal3;
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Enter salary for Company 1:");
	  sal1=sc.nextInt();
	  
	  System.out.print("Enter salary for Company 2:");
	  sal2=sc.nextInt();
	  
	  System.out.print("Enter salary for Company 3:");
	  sal3=sc.nextInt();
	  
	  if(sal1 >sal2 && sal1 > sal3)
	  {
		  System.out.println("Company 1 offers the highest salary.");
	  }
	  else if(sal2 > sal1 && sal2 > sal3)
	  {
		  System.out.println("Company 2 offers the highest salary.");
	  }
	  else if(sal3 > sal1 && sal3 > sal2)
	  {
		  System.out.println("Company 3 offers the highest salary.");
	  }
	  else
	  {
          System.out.println("Two or more companies offer the same highest salary.");
	  }
  }	  


/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac Salary.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java Salary
Enter salary for Company 1:45000
Enter salary for Company 2:52000
Enter salary for Company 3:50000
Company 2 offers the highest salary.
*/