package testauto;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println( " enter the number whose factorial to be find ");
		int num = sc.nextInt();
		int fact =1 ;
		
		for (int i = 1 ; i<= num; i++)
		{
		
          fact = fact * i;		
		
	     }
		
       System.out.println("Factorial of the number "+num+ " is " +fact );
		
		
}
}