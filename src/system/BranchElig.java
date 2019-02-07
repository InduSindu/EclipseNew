package system;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BranchElig 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Gender");
		String gender=s1.next();
		System.out.println("Enter the age");
		int age=s1.nextInt();
		if(gender.equals("male"))
		{
			if(age>=21)
			{
				System.out.println("ELIGIBLE FOR MARRIAGE");
			}
			else
			{
				System.out.println(" NOT ELIGIBLE FOR MARRIAGE");
			}	
		}	
		
		else
		{
			if(age>=18)
			{
				System.out.println("ELIGIBLE FOR MARRIAGE");
			}
			else
			{
				System.out.println(" NOT ELIGIBLE FOR MARRIAGE");	
			}	
		}
	}

}
