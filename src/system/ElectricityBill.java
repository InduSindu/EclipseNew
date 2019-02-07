package system;

import java.util.Scanner;

public class ElectricityBill 
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number of units consumed");
		double units = s1.nextDouble();
	    System.out.println("Enter the arrears amount If Any");
	    double arrears = s1.nextDouble(); 
	    
	    double amount,totalAmount,discount=0,fine=0,maxDiscount=200;
	    		if(units<=50)
	    		{
	    			if(arrears>0)
	    			{
	    			fine=arrears*.1;
	    			}
	    		  totalAmount=(1.20*units)+arrears+fine;
	    		  System.out.println("BILL IS="+totalAmount);
	    		}
	    		else if(units>50 && units <=100)
	    		{
	    			if(arrears>0)
	    			{
	    			fine=arrears*.1;
	    			}
	    			totalAmount=(((units-50)*2.40)+(50*1.20))+arrears+fine;
		    		  System.out.println("BILL IS="+totalAmount);	
	    		}
	    		else if(units>100 && units <=150)
	    		{
	    			if(arrears>0)
	    			{
	    			fine=arrears*.1;
	    			}
	    			totalAmount=(50*1.2)+(50*2.40)+(units-100)*3.60+arrears+fine;
		    		  System.out.println("BILL IS="+totalAmount);	
	    		}
	    		else if(units>150 && units<=200)
	    		{
	    			if(arrears>0)
	    			{
	    			fine=arrears*.1;
	    			}
	    			totalAmount=(50*1.2)+(50*2.4)+(50*3.60)+((units-150)*4.80)+arrears+fine;
		    		  System.out.println("BILL IS="+totalAmount);	
	    		}
	    		else if(units>200)
	    		{
	    			
	    			if(arrears>0)
	    			{
	    			fine=arrears*.1;
	    			}
	    			 totalAmount=(50*1.2)+(50*2.4)+(50*3.60)+((units-150)*4.80)+arrears+fine;
	    			discount=.05*totalAmount;
	    			 if(discount<=200)
	    			 {
	    				 totalAmount=totalAmount-discount; 
	    			   System.out.println("BILL iS="+totalAmount);
	    			 }
	    			 else
	    				 System.out.println("BILL iS="+(totalAmount-maxDiscount));
	    			
	    		}
	    		
	}

}
