package system;

import java.util.Scanner;

public class ReadOddIndexedElementsOfArray 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE");
        int size=s1.nextInt();
        int[] array=new int[size];
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for(int i=0;i<array.length;i++)
        {
        	array[i]=s1.nextInt();
        }
        for(int i=array.length-1;i>=0;i--)
        {
        	if(i%2==1)
        	{
        		System.out.print(array[i]+" ");
        	}
        }
        
	}

}
