package testauto;

import java.lang.reflect.Array;
import java.util.Arrays;

public class smallnlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int [] a = {1,10,-10,23,14,57};
		
           int small = a[0];
           int largest=a[0];
           
           for (int i =1 ; i < a.length;i++) {
        	   
        	   if (a[i]>largest) {
        		   
        		   largest = a[i];
   
        	   }else  if (a[i]<small) {
        	   
        	       small = a[i];

               }
	       }
           
           
           
           System.out.println("Given string is " +Arrays.toString(a));
           System.out.println("largest number is :"+largest);
           System.out.println("smallest number is :"+small);


}}
