package system;

import java.util.Scanner;

public class TrafficSignal
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the color");
		String color=s1.next();
		switch(color)
		{
		
		case "RED":System.out.println("STOP");
		break;
		case "GREEN":System.out.println("PROCEED");
		break;
		case "ORANGE":System.out.println("CAUTION");
		break;
		case "YELLOW":System.out.println("CAUTION");
		break;
		default:System.out.println("INVALID CHOICE");
		}           
		
	}

}
