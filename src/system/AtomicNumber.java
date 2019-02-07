package system;

import java.util.*;


public class AtomicNumber
{
   public static void main(String[] args)
   {
	  Map<Integer, String> atomicNumber=new HashMap<Integer,String>();
	  Scanner s1=new Scanner(System.in);

	  atomicNumber.put(1, "H");
	  atomicNumber.put(3, "Li");
	  atomicNumber.put(4, "Be");
	  atomicNumber.put(11, "Na");
	  atomicNumber.put(12, "Mg");
	  atomicNumber.put(19, "k");
	  atomicNumber.put(20, "ca");
	  atomicNumber.put(6, "C");
	  atomicNumber.put(7, "N");
	  atomicNumber.put(14, "Si");
	  atomicNumber.put(20, "Ca");
	  atomicNumber.put(10, "Ne");
	  atomicNumber.put(17, "Cl");
	  atomicNumber.put(27, "Fe");
	  Set<Integer> keys = atomicNumber.keySet();
//	  for(Integer value:keys)
//	  {
//		  System.out.println(atomicNumber.get(value));
//	  }
	  System.out.println("Enter the Atomic Number");
	   int key=s1.nextInt();
	  System.out.println(atomicNumber.get(key));
	  
   }
}
