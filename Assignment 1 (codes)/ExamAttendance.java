/*
10.	Exam Attendance Eligibility
Scenario: A student can sit in exams only if attendance >=75%. Take total classes held and attended as input, print allowance.
Input:
Enter total classes held: 100 Enter classes attended: 78
Output:
Student is allowed to sit for the exam.

*/

import java.util.Scanner;

public class ExamAttendance 
{
    public static void main(String[] args) 
	{
	    int total;
		int num;
		double percentage;
		
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter total classes held: ");
        total = sc.nextInt();

        System.out.print("Enter classes attended: ");
        num = sc.nextInt();

        
        percentage = (num * 100.0) / total;
        
        if (percentage >= 75)
		{
            System.out.println("Student is allowed to sit for the exam.");
			
        } 
		else 
		{
            System.out.println("Student is not allowed to sit for the exam.");
        }

        
    }
}

/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac ExamAttendance.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java ExamAttendance
Enter total classes held: 100
Enter classes attended: 78
Student is allowed to sit for the exam.
*/
