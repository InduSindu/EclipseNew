package system;

import java.util.Scanner;

public class ElementAtomicNumber
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Atomic Number");
		int num=s1.nextInt();
		switch(num)
		{
		
		case 1: System.out.println("H");
		        break;
		case 3: System.out.println("Li");
        break;
		case 4: System.out.println("Be");
        break;
		case 6: System.out.println("C");
        break;
		case 20: System.out.println("Ca");
        break;
		case 14: System.out.println("Si");
        break;
		case 10: System.out.println("Ne");
        break;
		case 27: System.out.println("Fe");
        break;
        default: System.out.println("Invalid Choice");
		        
		}           
		
	}

}
