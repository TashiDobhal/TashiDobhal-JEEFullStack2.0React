/** 
 * create a method which accepts an integer array and removes all the duplicates in the array. Return the resulting array in descending order
 * @author TashiDobhal
 *
 */
package com.cg.LABBOOK2;
import java.util.Arrays;
public class EXERCISE4 {
 public static void main(String[] args)
    {
        
	 int[] arr=modifyArray();
	 for(int i=0;i<arr.length-1;i++)
  		System.out.print(arr[i]+" ");
    }
    	
     public  static int[] modifyArray()
     {
    	     int[] arr = {13, 7, 6, 45, 21, 9, 9, 102};
             int n=arr.length; 
     
           for (int i = 0; i < ( n - 1 ); i++) 
           {
               for (int j = 0; j < n- i - 1; j++)
               {
                  if (arr[j] < arr[j+1]) 
                     {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                     }
              }
          }
       
        int[] temp = new int[n]; 
     		
     		// Start traversing elements 
     		int j = 0; 
     	   	for (int i=0; i<n-1; i++) 
     		
     			if (arr[i] != arr[i+1]) 
     				temp[j++] = arr[i]; 
     		
     		 
     		temp[j++] = arr[n-1]; 
     		
     		
     		for (int i=0; i<j; i++) 
     			arr[i] = temp[i]; 
     	
     		return temp;
   
     	
     	} 
}
