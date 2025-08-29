/*
45.	Sort Three Numbers in Ascending Order
Scenario: Take three numbers and print them in ascending order.

Input:
Enter numbers: 45, 12, 78

Output:
Ascending order: 12, 45, 78

*/

import java.util.Arrays;
import java.util.Scanner;

 class SortThree {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
		
        System.out.print("Enter three numbers: ");
		
        for (int i = 0; i < 3; i++) 
		{
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        System.out.printf("Ascending order: %d, %d, %d\n", nums[0], nums[1], nums[2]);
        
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java SortThree.java
Enter three numbers: 45
12
78
Ascending order: 12, 45, 78
*/