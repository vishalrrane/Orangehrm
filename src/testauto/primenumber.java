package testauto;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int count = 0;
	      // creating an instance of Scanner class
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number to check prime number");
	      // to take input from user
	      int num = sc.nextInt();
	      // to check prime number
	      if(num == 2) {
	         System.out.println(num + " is a prime number");
	      } else {
	         // checking number of factors
	         for(int i = 1; i <= num; i++) {
	            if(num % i == 0) {
	               count++;
	            }
	         }
	         // checking number of counts to print result
	         if(count == 2) {
	            System.out.println(num + " is a prime number");
	         } else {
	            System.out.println(num + " is not a prime number");
	         }
	      }
	   }
	
	}


