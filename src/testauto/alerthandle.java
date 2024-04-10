package testauto;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class alerthandle {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
		
		WebDriver  d = new SafariDriver();
	    	 

	    d.manage().window().maximize();
	    
	    d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    
	    
		
		d.get("https://omayo.blogspot.com/");
		
		
		WebElement alt = d.findElement(By.xpath("//input[@id='alert1']"));
		alt.click();
		
		Thread.sleep(3000);
		
		
		Alert a = d.switchTo().alert();
		
		a.accept();
		
		d.navigate().refresh();
		
		
		//javascript executor
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,300)");
		
		
		Thread.sleep(3000);
		
		
	  //screenshot 
		
		TakesScreenshot src = ((TakesScreenshot)d);
		
		java.io.File f = src.getScreenshotAs(OutputType.FILE);
		
		
		String filepath = "/Users/vishal.rane/eclipse-workspace/testauto/homepage.png";
		
	    FileUtils.copyFile(f, new java.io.File(filepath));
	  
		
		
		
		//
	    
	    
	}

}
