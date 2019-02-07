package system;

import java.util.Scanner;

public class PalindromeString
{

	
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s1.next();
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
      if(str.equals(str1))
      {
    	  System.out.println("String is Palindrome");
      }
      else
      {
    	  System.out.println("String is not Palindrome");
      }
	}

}
