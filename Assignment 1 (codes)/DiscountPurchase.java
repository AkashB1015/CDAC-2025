
/*
40.	  Discount on Purchase (Ternary)
Scenario: A shop gives 10% discount if purchase amount > 1000. Take purchase amount and print total cost using ternary.
Input:
Enter purchase amount: 1200
Output:
Total cost after discount: 1080

*/
import java.util.Scanner;

class DiscountPurchase 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

       
        double totalCost = (amount > 1000) ? (amount - (amount * 0.10)) : amount;

        
        System.out.println("Total cost after discount: " + (int)totalCost);

      
    }
}

/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac DiscountPurchase.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java DiscountPurchase
Enter purchase amount: 1200
Total cost after discount: 1080
*/