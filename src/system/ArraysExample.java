package system;

import java.util.Scanner;

public class ArraysExample 
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
        
        //the sum of all even /all odd indexed elements from a given int array
        int evenSum=0,oddSum=0,minEven=array[0],maxOdd=array[0],evenCount=0,oddCount=0;
        int mid=array.length/2,firstHalfSum=0;
        for(int i=0;i<array.length;i++)
        {
        	if(i%2==0)
        	{
        		evenSum=evenSum+array[i];
        		evenCount++;
        		if(array[i]<minEven)
        		{
        			minEven=array[i];
        		}
        	}
        	else
        	{
        		oddSum=oddSum+array[i];	
        		oddCount++;
        		if(array[i]>maxOdd)
        		{
        			maxOdd=array[i];
        		}
        	}
        }
        for(int i=0;i<mid;i++)
        {
        	firstHalfSum=firstHalfSum+array[i];
        }
        System.out.println("sum of all even indexed elements from a given int array="+evenSum);
        System.out.println("sum of all odd indexed elements from a given int array="+oddSum);
        System.out.println("min value from all even indexed elements from a given int array="+minEven);
        System.out.println("max value from all odd indexed elements from a given int array="+maxOdd);
        System.out.println("avg value from all even indexed elements from a given int array="+(evenSum/evenCount));
        System.out.println("avg value from all even indexed elements from a given int array="+(oddSum/oddCount));
        System.out.println("sum of all elements from a first half of given int array="+firstHalfSum);
	}

}
