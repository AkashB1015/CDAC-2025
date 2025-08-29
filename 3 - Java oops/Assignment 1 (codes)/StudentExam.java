/*
7.	Exam Pass or Fail
Scenario: A student gives an exam. Take marks (0–100) as input and print whether the student has passed (>=35) or failed.
Input:
Enter marks: 42
Output:
Student has passed.

*/

import java.util.Scanner;

class StudentExam 
{
	public static void main(String args[])
	{
		int marks;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks (0-100) :");
		marks = sc.nextInt();
		
		if(marks >= 35)
		{
			System.out.println("Student has passed. ");
			
		}
		else
		{
			System.out.println("Studen has Failed. ");
		}
		
	}	
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac StudentExam.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java StudentExam
Enter marks (0-100) :42
Student has passed.

*/
