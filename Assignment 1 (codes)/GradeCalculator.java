
/*
11.	Grade Based on Percentage
Scenario: Your friend got exam marks. Take percentage marks as input and print the grade:
a.	90+ → A+
b.	76–89 → A
c.	66–75 → B+
d.	51–65 → B
e.	36–50 → C
f.	Below 35 → Fail
Input:
Enter percentage marks: 82
Output: Grade: A

*/
import java.util.Scanner;

public class GradeCalculator
 {
    public static void main(String[] args) 
	{
	    int percentage;
	   
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter percentage marks: ");
        percentage = sc.nextInt();

       
        if (percentage >= 90) 
		{
            System.out.println("Grade: A+");
        }
		
		else if (percentage >= 76) 
		{
            System.out.println("Grade: A");
        } 
		
		else if (percentage >= 66) 
		{
            System.out.println("Grade: B+");
        } 
		
		else if (percentage >= 51) 
		{
            System.out.println("Grade: B");
        }
		
		else if (percentage >= 36) 
		{
            System.out.println("Grade: C");
        } 
		
		else 
		{
            System.out.println("Grade: Fail");
        }

        
    }
}
/*

PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac GradeCalculator.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java GradeCalculator
Enter percentage marks: 82
Grade: A
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java GradeCalculator
Enter percentage marks: 39
Grade: C

*/