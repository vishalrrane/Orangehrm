package testauto;

public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//convert integer to string 
		
		
		int i=10;  
		String s=String.valueOf(i);
		
		System.out.println(s);
		
		
		
		
		int j=11;  
		String s1=Integer.toString(j);
		System.out.println(s1);
		
		
		
		// convert string to integer 
		
		String s3="200a";  
		//Converting String into int using Integer.parseInt()  
		int k=Integer.parseInt(s3);  
		//Printing value of i  
		System.out.println(k);  
		
		
		
	}

}
