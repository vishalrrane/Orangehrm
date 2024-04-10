package testauto;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the string");
	    
	    String original = sc.next();
		String rev ="";
		
		
	//	char[] ch = original.toCharArray();
		
		for (int i = original.length()-1 ; i>=0;i--) {
			
			rev = rev + original.charAt(i);
			
		}
		
		if (original.equals(rev)) {
			
			System.out.println(" the string is Palindrome");
			
		}
		else {
			
			System.out.println(" The string is  not Palindrome");
			
		}
		
		
	}

}
