/*
5.	Square or Rectangle Garden
Scenario: You are designing a small garden. Take its length and breadth as input and check whether it is a square garden or a rectangle.
Input:
Enter length: 12
Enter breadth: 12
Output: Square garden

*/
import java.util.Scanner;

class GardenShape{
	
  public static void main(String args[])
   { 
	 
	 int len;
	 int bre;
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("Enter the length: ");
	 len = sc.nextInt();
	 
	 System.out.print("Enter the Breadth: ");
	 bre = sc.nextInt();
	 
	 if(len == bre)
	 {
		 System.out.println("Square garden. ");
	 }
	 else
	 {
		 System.out.println("Rectangle garden. ");
	 }
	 
   }
}
/*

PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac GardenShape.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java GardenShape
Enter the length: 12
Enter the Breadth: 12
Square garden.

*/