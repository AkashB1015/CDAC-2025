/*
35.	Pass/Fail Check (Ternary)
Scenario: Take marks as input and print Pass or Fail using ternary operator (Pass if >=35).
Input:
Enter marks: 28
Output: Fail

*/

import java.util.Scanner;

public class PassFail
 {
    public static void main(String args[]) 
	{
	    int marks;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
         marks = sc.nextInt();

        
        String result = (marks >= 35) ? "Pass" : "Fail";

        System.out.println(result);

       
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac PassFail.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java PassFail
Enter marks: 28
Fail
*/