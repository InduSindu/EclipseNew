package system;

import java.util.Scanner;

public class AdditionOfDigits
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=s1.nextInt();
		int rem,quot,sum=0;
        while (number > 0 || sum > 9)  
        { 
            if (number == 0)
            { 
                number = sum; 
                sum = 0; 
            } 
            sum += number % 10; 
            number /= 10; 
        } 
        System.out.println(sum);
	}
}
