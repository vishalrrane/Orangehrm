package testauto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import net.jsourcerer.webdriver.jserrorcollector.JavaScriptError;

public class gmailtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Desktop\\Selenium 64 bit\\Web Driver\\chromedriver.exe");
    
        // Initialize the FirefoxDriver with options
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		WebDriver d = new ChromeDriver(options);
		
		
	    d.get("https://www.google.co.in/");
	
	    System.out.println("click on gmail button");
	    d.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/a")).click();
	    Thread.sleep(3000);
	   
         System.out.println("enter the gmail ");
		  d.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("vishalrane02@gmail.com");
		    Thread.sleep(3000);
		  
		    System.out.println("click on the next button  ");
	
		    WebElement next = d.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div[1]/div/div/button/span[@jsname='V67aGc']"));
		    
		    JavascriptExecutor js =  (JavascriptExecutor)d;
		    js.executeScript("arguments[0].click();",next);
		    
		    
		  System.out.println("Enter the Password");
		  d.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("ramchandra@6647");
		 
		    Thread.sleep(3000);
		 
		    System.out.println("click on next button ");
		    d.findElement(By.xpath("//span[@jsname='V67aGc'][contains(.,'Next')]")).click();
		    Thread.sleep(3000);

		    
	
	
	
	
	
	}

}
