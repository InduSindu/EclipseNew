package system;

import java.util.Scanner;

public class SwapStringsWithOutThirdVariable 
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("ENTER THE FIRST STRING");
		String str1=s1.next();
		System.out.println("ENTER THE SECOND STRING");
		String str2	=s1.next();
		str1=str1+str2;
		//SWAPPING USING SUBSTRING
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println(str1+"  "+str2);
		

	}

}
