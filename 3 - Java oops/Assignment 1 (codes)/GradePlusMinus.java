/*
48.	Grade with Plus/Minus
Scenario: Take marks and print grade with plus/minus (e.g., 85 → A, 78 → A−).
Input:
Enter marks: 78
Output: Grade: A−

*/

import java.util.Scanner;

public class GradePlusMinus 
{
    public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        String grade;

        if (marks >= 85) grade = "A";
        else if (marks >= 75) grade = "A-";  
        else if (marks >= 65) grade = "B+";
        else if (marks >= 55) grade = "B";
        else if (marks >= 45) grade = "C+";
        else if (marks >= 35) grade = "C";
        else grade = "Fail";

        System.out.println("Grade: " + grade);
        
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac GradePlusMinus.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java GradePlusMinus
Enter marks: 78
Grade: A-
*/
