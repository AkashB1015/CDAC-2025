public class largest {
    public static void main(String[] args) 
	{
        int num1 = 10, num2 = 25, num3 = 40;

        if (num1 > num2 && num1 > num3) 
		{
            System.out.println("Largest number is: " + num1);
        } 
		else if (num2 > num1 && num2 > num3) 
		{
            
			System.out.println("Largest number is: " + num2);
			
        } else 
		{
            System.out.println("Largest number is: " + num3);
        }
    }
}
