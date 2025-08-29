/*
28. Traffic Signal Instruction
Scenario: Take traffic signal color as input (Red, Green, Yellow) and print appropriate instruction.
Input:
Enter traffic light color: Green
Output:  Go

*/

import java.util.Scanner;

public class TrafficSignal
{
    public static void main(String args[])
	{   String color;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter traffic light color (Red, Green, Yellow): ");
        color = sc.next();

        switch (color.toLowerCase()) 
		{ 
            case "red":
                System.out.println("Stop!");
                break;
				
            case "green":
                System.out.println("Go!");
                break;
				
            case "yellow":
                System.out.println("Get ready to stop!");
                break;
				
            default:
                System.out.println("Invalid color. Please enter Red, Green, or Yellow.");
        }

       
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac TrafficSignal.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java TrafficSignal
Enter traffic light color (Red, Green, Yellow): Green
Go!
*/