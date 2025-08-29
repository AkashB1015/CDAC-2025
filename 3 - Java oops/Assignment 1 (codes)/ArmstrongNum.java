 /*
 42.Armstrong Numbers Between 100–500
Scenario: Print all Armstrong numbers between 100 and 500. Output: 153
370
371

 */
 
 class ArmstrongNum
{
    public static void main(String[] args) 
	{
        System.out.println("Armstrong numbers between 100 and 500:");
		
        for (int num = 100; num <= 500; num++) 
		{
            int sum = 0, temp = num;
			
            while (temp > 0) 
			{
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            if (sum == num) 
			{
                System.out.println(num);
            }
        }
    }
}

/*
PS D:\0 - CDAC 2025\Assignment 1 (codes)> javac ArmstrongNum.java
PS D:\0 - CDAC 2025\Assignment 1 (codes)> java ArmstrongNum
Armstrong numbers between 100 and 500:
153
370
371
407
*/
