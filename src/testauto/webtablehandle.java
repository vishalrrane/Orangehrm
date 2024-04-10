package testauto;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class webtablehandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
	    System.setProperty("webdriver.gecko.driver", "/Users/vishal.rane/Desktop/driver/geckodriver");
	    WebDriver  d = new SafariDriver();
	    
	    d.manage().window().maximize();
	    
	    d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		d.get("https://omayo.blogspot.com/");
		
		
		//*JavascriptExecutor js = (JavascriptExecutor)d;
		
		//js.executeScript("window.scrollBy(0,600)");
		//Thread.sleep(3000);//

		
		//WebElement fr1 = d.findElement(By.xpath("//iframe[@id='iframe1']"));
		
	   // d.switchTo().frame("iframe1");
	    
	    
	    //webtable handle 
        d.navigate().refresh();
        
        
	    JavascriptExecutor js1 = (JavascriptExecutor)d;
		
		js1.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
	    
		
		
List<WebElement>rows = d.findElements(By.xpath("//table[@id='table1']/tbody/tr"));

System.out.println("number of rows : "+rows.size());
	    
	    
	    

    List<WebElement>  col = d.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
    System.out.println("number of coloumns: "+col.size());
    
	    
	    
    for (int i =1 ;i<= rows.size();i++) {
    	
    	
    	
    	
    	
    	for (int j =1 ;j<= col.size();j++) {
    		
    		
    	WebElement	element = d.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]"));
    		
    		System.out.print(element.getText());
    		System.out.print("|");
    		System.out.print("");
    	}
    	
		System.out.println("");

    	
    }
	    
	    
	    
	    
	    
	  
		
	
	}

}
