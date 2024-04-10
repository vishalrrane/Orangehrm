package testauto;

public class stringmanupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "Java program to print all duplicate";
		String s1 = "Java program to Print all duplicate";
		
		System.out.println(s.length()); //length of the string 
		
		
		System.out.println(s.charAt(5)); // charecter at index 5 
		
		
        System.out.println(s.indexOf('p')); //index of charecter p 
        
        
        System.out.println(s.indexOf('p', 7));  //index of p after 7 th index
        
        
        System.out.println(s.indexOf("program")); // index value of the program string
        
        //string comparison
        
        System.out.println(s.equals(s1));   //false as 
        
        System.out.println(s.equalsIgnoreCase(s1)); //True
        
        
        //substring 
        System.out.println(s.substring(0, 12));
        
        
        //trim 
        
        String s3 ="   Hello World   ";
        
        System.out.println(s3.trim());    // To remove  before  space & after space of the word
        
        
        
        //Replace 
        
        System.out.println(s3.replace(" ",""));
        
       String date ="1-01-2024";
       System.out.println(date.replace("-", "/"));
       
       
       //split
       
       String test = "Test@automation@selenium@java";
       String[] testval = test.split("@");
       
       for(int i =0 ;i<testval.length;i++)
       {
    	   
    	    System.out.println(testval[i]);
    	   
       }
       
       
       
       String x = "hello";
       String y = "world";
       
       int a = 100;
       int b = 200;
       
       
       
        
        System.out.println(a+b);
        System.out.println(x+y);
        
        System.out.println(x+y+a+b);

        
		
		
		
		
		
		
		
		
	}

}
