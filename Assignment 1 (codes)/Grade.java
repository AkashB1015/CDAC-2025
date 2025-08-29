/*
24. Grade Using Switch (Ranges)
Scenario: Take marks (0–100) and print grade using switch-case grouping:
● 0–24 → F
● 25–44 → E
● 45–54 → D
● 55–69 → C
● 70–84 → B
● 85–100 → A
Input:
Enter marks: 78
Output:
Grade: B

*/

import java.util.Scanner;

public class Grade
{
    public static void main(String args[]) 
	{
		 int marks;
		 int range;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter marks: ");
         marks = sc.nextInt();
		
         range = marks / 10; 

        switch (range) {
            case 10: 
            case 9:
            case 8:
                System.out.println("Grade: A");
                break;
				
            case 7:
                System.out.println("Grade: B");
                break;
				
            case 6:
            case 5:
                System.out.println("Grade: C");
                break;
				
            case 4:
                System.out.println("Grade: D");
                break;
				
            case 3:
            case 2:
                System.out.println("Grade: E");
                break;
				
            case 1:
            case 0:
                System.out.println("Grade: F");
                break;
				
            default:
                System.out.println("Invalid marks entered");
        }
       
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac Grade.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java Grade
Enter marks: 78
Grade: B
*/