package system;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationOfString
{

	public static void permutations(String s)
	{
		
		List list = new ArrayList<>();
		list.add(String.valueOf(s.charAt(0)));
		for (int i = 1; i < s.length(); i++)
		{
			for (int j = list.size() - 1; j >= 0 ; j--)
			{
				String str = (String) list.remove(j);
				for (int k = 0; k <= str.length(); k++)
				{
					list.add(str.substring(0, k) + s.charAt(i) + str.substring(k));
				}
			}
		}

		System.out.println(list);
	}
	public static void main(String[] args) 
	{
		 Scanner s1=new Scanner(System.in);
			System.out.println("ENTER THE STRING");
			String str=s1.next();
			permutations(str);
			
		
	}
}
