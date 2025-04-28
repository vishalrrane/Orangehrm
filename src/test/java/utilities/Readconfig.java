package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {

	Properties pro;
	
          public Readconfig()   {

		     File f = new File("C://Users//ADMIN//eclipse-workspace//oranghrm//configuration//config.properties");
				try {
					 pro= new Properties();
					FileInputStream fis = new FileInputStream(f);
					pro.load(fis);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				}
			     
		     
	    }   
		   
	
	        public String geturl() {
		    	
	    	  String url = pro.getProperty("Base_URL");
		    	return url;
		    	
		    	
		    } 
		     
	      

	        public String chromepath() {
		    	
	    	  String path = pro.getProperty("chrome_path");
		    	return path;
		    } 
		     
	      

	        public String getusername() {
		    	
	    	  String uname = pro.getProperty("username");
		    	return uname;
		    } 
		     

	        public String getpassword() {
		    	
	    	  String password = pro.getProperty("passward");
		    	return password;
		    } 
	      
	      
		     
		}
		