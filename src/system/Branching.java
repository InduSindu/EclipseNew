package system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Branching 
{

	public static void main(String[] args) throws IOException
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=s1.nextInt();
		if(marks==35)
		{
			System.out.println("PASS");
		}
		else if( marks>35 && marks<60)
		{
			System.out.println("SECOND CLASS");
		}
		else if( marks >=60 && marks<70)
		{
			System.out.println("FIRST CLASS");
		}
		else if(marks>=70)
		{
			System.out.println("DISTINCTION");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}
