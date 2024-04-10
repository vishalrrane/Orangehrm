package testauto;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "vishal";
		char ch;
		String newstr="";
		
		
		
		System.out.println("size of the string is "+str.length());
		
		System.out.println("size of the string is "+str.charAt(0));
		
		
		for(int i =0; i< str.length();i++) {
			
			
			ch= str.charAt(i);
			newstr= ch+newstr;
			
		}

		 System.out.println("Reversed word: "+ newstr);
		
		
	}

}
