package testauto;

import java.util.Scanner;

public class fibbonacci {

	static int d =10;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			System.out.println(""+d);
		
		
		 int n, a = 0, b = 0, c = 1;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter value of n:");
	        n = s.nextInt();
	        System.out.print("Fibonacci Series:");
	        for(int i = 1; i <= n; i++)
	        {
	            a = b;
	            b = c;
	            c = a + b;
	            System.out.print(a+" ");
	            
	            
	            
	        }
	}

}
