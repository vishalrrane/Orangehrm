package testauto;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println( "number is prime or not ");
		
		int  num = 5;
		
		int count=0;
		
	    for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
               count++;
            }
         }
         // checking number of counts to print result
         if(count == 2) {
        	 
        	 
            System.out.println(num + " is a prime number");
            
         } else
         
         {
            System.out.println(num + " is not a prime number");
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

		//////////   reverse string using the string builder
		

		 
		 StringBuilder sb = new StringBuilder("WelcomeGeeks");
		 
		 StringBuilder str =  sb.reverse();
		 
		 System.out.println(str.toString());
		 
		 
		/////////////////////////////////////////////		
		
			//Reverse the string  without using string builder 	
		
		String s = "vishal rane";
		
		String newstr= "";
		
		
		char ch ;
		
		
		for(int i =0 ; i<s.length();i++) {
			
			
			ch= s.charAt(i);
			newstr= ch+newstr;
			
			
	        	}
		
              System.out.println(newstr);
		}
	


}






	
	
	
	
	
