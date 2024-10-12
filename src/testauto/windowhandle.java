package testauto;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class windowhandle {

	
	public static void main(String[] args) throws InterruptedException {

		
	    System.setProperty("webdriver.gecko.driver", "/Users/vishal.rane/Desktop/driver/geckodriver");
	    WebDriver  d = new SafariDriver();
	    
	    d.manage().window().maximize();
	    
	    d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		d.get("https://omayo.blogspot.com/");
		
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);

		
		
		d.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(3000);
		
		String parent= d.getWindowHandle();
		
		System.out.println(parent);
		
		
		Set<String> windows = d.getWindowHandles();
		
		Iterator<String> itr = windows.iterator();
		
		
		while(itr.hasNext()) {
			
			
			String window = itr.next();
			
			d.switchTo().window(window);
			
		if(d.getTitle().equals("New Window")) {
				
				
				d.close();
				
				
			}
			
			
		}
		
		Thread.sleep(3000);
		
		d.switchTo().window(parent);
		
		
		d.findElement(By.xpath("//div[@class='widget-content']/textarea[@id='ta1']")).sendKeys("hello world");
		
		
		
		
		
		
	}

}
