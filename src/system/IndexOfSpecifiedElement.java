package system;

import java.util.Scanner;

public class IndexOfSpecifiedElement
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
        System.out.println("Enter the Element to find out an index");
        int element=s1.nextInt();
        for(int i=0;i<array.length;i++)
        {
        	if(element==array[i])
        	{
        		System.out.println("Index of Element "+array[i]+" is "+i);
        	}
        }
	}

}
