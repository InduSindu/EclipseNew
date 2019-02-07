package system;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;


public class LongestSubString
{
  public static void main(String[] args)
  {	
	  Scanner s1=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String str=s1.next();
		String str2="";
		TreeSet<String> set=new TreeSet<String>();
		for(int i=0;i<str.length();i++)
		{
		 str2=Character.toString(str.charAt(i));
		 set.add(str2);
		}
		java.util.Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
		
  }
	
	

}
