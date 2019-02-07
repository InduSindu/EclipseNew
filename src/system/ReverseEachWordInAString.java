package system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseEachWordInAString 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str=br.readLine();
		String str2="";
		String[] array=str.split(" ");
		for(int i=0;i<array.length;i++)
		{
			String word=array[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				char ch=word.charAt(j);
				str2=str2+ch;
				
			}
			
		}
    System.out.println(str2);
	}

}
