/** 
 *Create a method which accepts an array of integer elements and return the second smallest element in the array.
 * @author TashiDobhal
 *
 */package com.cg.LABBOOK2;

import java.util.Arrays;

public class EXERCISE1 {

	public int getSecondSmallest(int[] newNumbers) {
		if(newNumbers.length==0)
			return 0;
		else if (newNumbers.length==2) {
			return Math.max(newNumbers[0],newNumbers[1]);
		}
		else if(newNumbers.length>=3) {
			Arrays.sort(newNumbers);
			return newNumbers[1];
		}
			
			
		 
		return 1;
		
		

}
}
