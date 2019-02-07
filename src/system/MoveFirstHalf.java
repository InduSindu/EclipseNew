package system;

import java.util.Scanner;

public class MoveFirstHalf 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int number=s1.nextInt();
		String str2="";
		String num=Integer.toString(number);
		int mid=(num.length()/2);
		for(int i=mid;i<num.length();i++)
		{
			str2=str2+num.charAt(i);
		}
		num=num.substring(0, num.length()-str2.length());
		//System.out.println(num);
		int second=Integer.parseInt(str2);
		int first=Integer.parseInt(num);
		System.out.print(second);
		System.out.print(first);
	}

}
