/*
38.	Vowel or Consonant (Ternary)
Scenario: Take a character and check if it is a vowel or consonant using ternary operator.
Input:
Enter character: i
Output: Vowel

*/
import java.util.Scanner;

public class VowelOrConsonant 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0); 

       
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                        ? "Vowel"
                        : "Consonant";

        System.out.println(result);

       
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac VowelOrConsonant.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java VowelOrConsonant
Enter a character: i
Vowel

*/