/*
34.	Voting Eligibility (Ternary)
Scenario: Ask user age and print “Eligible” or “Not Eligible” to vote using ternary operator.
Input:
Enter age: 20
Output: Eligible to vote

*/
import java.util.Scanner;

public class VotingEligibility 
{
    public static void main(String args[]) 
	{   int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        age = sc.nextInt();

        
        String result = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";

        System.out.println(result);

        sc.close();
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac VotingEligibility.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java VotingEligibility
Enter age: 20
Eligible to vote
*/