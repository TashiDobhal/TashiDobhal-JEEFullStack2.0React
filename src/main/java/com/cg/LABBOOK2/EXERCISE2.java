/** 
 *Create a method that can accept an array of String objects and sort in alphabetical order. The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case. Return the resulting array
 * @author TashiDobhal
 *
 */package com.cg.LABBOOK2;
import java.util.Arrays;

public class EXERCISE2 {

	public  String sortString(String inputString) 
	{ 
		// convert input string to char array 
		char tempArray[] = inputString.toCharArray(); 
		
		// sort tempArray 
		Arrays.sort(tempArray); 
		int len=tempArray.length;
		if(len/2==0)
		{
			for(int i=0;i<len/2;i++)
			{
				char ch=Character.toUpperCase(tempArray[i]);
                     tempArray[i]=ch;
		
				
			}
		}
		else
		{
			for(int i=0;i<len/2+1;i++)
			{
				char ch=Character.toUpperCase(tempArray[i]);
				tempArray[i]=ch;
			
			}
			
		}
		
		
		// return new sorted string 
		return new String(tempArray); 
	} 

	
}
