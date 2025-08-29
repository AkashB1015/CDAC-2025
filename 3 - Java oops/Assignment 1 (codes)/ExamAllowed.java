/*
13.	Exam Eligibility with Medical Cause
Scenario: A student’s attendance is low but may have medical cause. Take classes held, attended, and medical cause (Y/N) as input and decide if the student can sit in exam.

Input:
Classes held: 100
Classes attended: 60 Medical cause (Y/N): Y

Output:
Student is allowed to sit for the exam

*/


import java.util.Scanner;

public class ExamAllowed  {
    public static void main(String args[]) 
	{
		 int held;
		 int attended;
		 char medical;
		 double attendance
		 
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter total classes held: ");
         held = sc.nextInt();

        System.out.print("Enter classes attended: ");
         attended = sc.nextInt();

        System.out.print("Do you have a medical cause? (Y/N): ");
         medical = sc.next().charAt(0);

       
        attendance = (attended * 100.0) / held;

        if (attendance >= 75) 
		{
            System.out.println("Student is allowed to sit for the exam.");
        } 
		else 
		{
            if (medical == 'Y' || medical == 'y') 
			{
                System.out.println("Student is allowed to sit for the exam.");
            } 
			else 
			{
                System.out.println("Student is NOT allowed to sit for the exam.");
            }
        
       
    }
}

/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac  ExamAllowed.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java  ExamAllowed
Enter total classes held: 100
Enter classes attended: 60
Do you have a medical cause? (Y/N): Y
Student is allowed to sit for the exam.

*/
