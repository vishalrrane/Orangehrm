package testauto;

public class swapstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before swapping the string a:  "+a);
		
		System.out.println("Before swapping the string b:  "+b);
		
		
		a = a+b ;
		System.out.println(a);  //helloworld
		
		b = a.substring(0, a.length()-b.length()); //10-5 = 5  hello
		
		a = a.substring(b.length());
		
		
		System.out.println(" Value of string a and b after swapping is : ");
		
	    System.out.println("After swapping the string a:  "+a);
		
		System.out.println("After swapping the string b:  "+b);
		
		
		
		
	}

}
