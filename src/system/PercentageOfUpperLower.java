package system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PercentageOfUpperLower
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//Scanner s1=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=br.readLine();
		int n=str.length();
		double upper=0,lower=0,digit=0,special=0;
		for(int i=0;i<n;i++)
		{
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				upper++;
			}
			else if(Character.isLowerCase(ch))
			{
				lower++;
			}
			else if(Character.isDigit(ch))
			{
				digit++;
			}
			else
			{
				special++;
			}
		}
		System.out.println("% OF UPPERCASE CHARACTERSIN A STRING IS="+((upper/n)*100));
		System.out.println("% OF LOWERCASE CHARACTERSIN A STRING IS="+((lower/n)*100));
		System.out.println("% OF IN A STRING IS="+((digit/n)*100));
		System.out.println("% OF SPECIAL CHARACTERSIN A STRING IS"+((special/n)*100));
	}

}
