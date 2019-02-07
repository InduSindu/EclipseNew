package system;

import java.util.Scanner;

public class NewPermutation
{
	public static void permuteString(String s)
	{
	 // char[] ch=s.toCharArray(); 
	  for(int i=0;i<s.length();i++)
	  {
		  char ch1=s.charAt(i);
		  String str2=s.substring(i+1);
		  for(int j=0;j<str2.length();j++)
		  {
			 int  k=j;
			  char swap=str2.charAt(k);
			  char ch2=str2.charAt(k+1);
			  char temp=swap;
			  swap=ch2;
			  ch2=temp;
			  System.out.println(Character.toString(ch1)+Character.toString(swap)+Character.toString(ch2));
		  }
		  
	  }
	    
	}
	
	public static void main(String[] args)
	{
		 Scanner s1=new Scanner(System.in);
			System.out.println("ENTER THE STRING");
			String str=s1.nextLine();
			permuteString(str);
	}
}
