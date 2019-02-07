package system;

import java.util.Scanner;

public class SwapImmediateDigit
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int number=s1.nextInt();
		String num=Integer.toString(number);
		char[] ch=num.toCharArray();
		int j=1;
		char swap;
		for(int i=0;i<ch.length;i+=2,j=i+1)
		{
			 swap=ch[i];
			 ch[i]=ch[j];
			 ch[j]=swap;
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		
	}

}
