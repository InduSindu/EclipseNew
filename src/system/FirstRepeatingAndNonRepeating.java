package system;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatingAndNonRepeating 
{

	static void firstRepeating(String inputString)
    {
        
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        
        char[] strArray = inputString.toCharArray();
       
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else 
            {
                charCountMap.put(c, 1);
            }
        }
        
        //checking for first non-repeated character
        
        for (char c : strArray)
        {
            if (charCountMap.get(c) == 1)
            {
                System.out.println("First Non-Repeated Character In '"+inputString+"' is '"+c+"'");
                
                break;
            }
        }
        
        //checking for first repeated character
        
        for (char c : strArray)
        {
            if (charCountMap.get(c) > 1)
            {
                System.out.println("First Repeated Character In '"+inputString+"' is '"+c+"'");
                
                break;
            }
        }
    }
	public static void main(String[] args)
	{
		 Scanner s1=new Scanner(System.in);
			System.out.println("ENTER THE STRING");
			String str=s1.next();
	       firstRepeating(str);
			
	}
  
}





