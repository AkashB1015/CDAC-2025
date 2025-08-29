/*
12.	Oldest and Youngest Among Three Friends
Scenario: You and two friends want to know who is oldest and youngest. Take ages as input and print the oldest and youngest.
Input:
Enter age of Friend 1: 22
Enter age of Friend 2: 25
Enter age of Friend 3: 20
Output:
Oldest: Friend 2
Youngest: Friend 3

*/

import java.util.Scanner;

public class OldestYoungest 
{
    public static void main(String args[]) 
	{
		 int f1,f2,f3;
		 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Friend 1: ");
         f1 = sc.nextInt();

        System.out.print("Enter age of Friend 2: ");
         f2 = sc.nextInt();

        System.out.print("Enter age of Friend 3: ");
         f3 = sc.nextInt();
       
        int oldest = f1;
        int youngest = f1;

        String oldestFriend = "Friend 1";
        String youngestFriend = "Friend 1";

        
        if (f2 > oldest)
		{
            oldest = f2;
            oldestFriend = "Friend 2";
        }
		
        if (f3 > oldest)
		{
            oldest = f3;
            oldestFriend = "Friend 3";
        }

       
        if (f2 < youngest) 
		{
            youngest = f2;
            youngestFriend = "Friend 2";
        }
        if (f3 < youngest) 
		{
            youngest = f3;
            youngestFriend = "Friend 3";
        }
       
        System.out.println("Oldest: " + oldestFriend);
		
        System.out.println("Youngest: " + youngestFriend);

        
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac OldestYoungest.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java OldestYoungest
Enter age of Friend 1: 22
Enter age of Friend 2: 25
Enter age of Friend 3: 20
Oldest: Friend 2
Youngest: Friend 3

*/