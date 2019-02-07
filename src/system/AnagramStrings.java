package system;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=s1.next();
		char[] ch1=str1.toCharArray();
		System.out.println("Enter the string");
		String str2=s1.next();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.toString(ch1).equals(Arrays.toString(ch2)))
				{
					System.out.println("ANAGRAMS");
				}
		else
		{
			System.out.println("NOT ANAGRAMS");
		}
	}
}
