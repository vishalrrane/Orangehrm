package testauto;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.deps.com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat;

public class brokenlinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.gecko.driver","/Users/vishal.rane/Desktop/driver/geckodriver");
	
		WebDriver d = new  FirefoxDriver();
		
		d.manage().window().maximize();
	

		
		
		d.get("https://star.samco.in/");
		
		d.findElement(By.xpath("//input[@id = 'uname']")).sendKeys("RV32706");
		
		d.findElement(By.xpath("//input[@id = 'passwd']")).sendKeys("VISH@6647");
		
		d.findElement(By.xpath("//button[@id='login_btn']")).click();
		
		
		d.navigate().refresh();
		
		
		Thread.sleep(10000);
		
		
//		 WebDriverWait wait =  new WebDriverWait(d, 10);
//		 
//		wait.until(ExpectedConditions.urlToBe("https://star.samco.in/dashboard"));
//		
		
		if (d.getCurrentUrl()=="https://star.samco.in/dashboard"){
		
		try {
			
       String dashboard = d.getCurrentUrl();
       
       List<WebElement> links = d.findElements(By.tagName("a"));
		
     System.out.println("total number of links are " +links.size());
		
     
     for(int i = 0; i < links.size(); i++) 
     { 
       // Checking Each & Every Links 
    	 
    	 
       WebElement element = links.get(i);
       
       String url = element.getAttribute("href");
       
       URL link = new URL(url); 
       HttpURLConnection httpConn =   (HttpURLConnection) link.openConnection(); 
       httpConn.connect(); 
       
       // Getting The Response Code 
       int code = httpConn.getResponseCode(); 
           
       // If The Number Is Greater Than 400,  
       // Then It Is Broken Link 
       if(code >= 400) 
       { 
         System.out.println("Broken Link: " +  
                             url); 
       } 
       else
       { 
         System.out.println("Valid Link: " +  
                             url); 
       }     
     } 
       
		} finally {
			
			System.out.println("Finally Block Always Executed");
			
		}
	}

}
}

