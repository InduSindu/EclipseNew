package system;

import java.util.Scanner;

public class ReverseFirstHalf 
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
        int mid=array.length/2;
        //REVERSE FIRST HALF
        for(int i=mid;i>=0;i--)
        {
        	System.out.print(array[i]+" ");
        }
        //REVERSE SECOND HALF
        for(int i=array.length-1;i>mid;i--)
        {
        	System.out.print(array[i]+" ");
        }

	}

}
