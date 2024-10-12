package testauto;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {

	
	
	WebDriver d;
	
	@BeforeTest
	public void setup() {
		
		   String firefoxBinaryPath = "/Applications/Firefox.app/Contents/MacOS/firefox";

	        // Set the system property for GeckoDriver (if not already set)
			System.setProperty("webdriver.gecko.driver", "/Users/vishal.rane/Desktop/driver/geckodriver");
	        // Configure Firefox options
	        FirefoxOptions options = new FirefoxOptions();
	        options.setBinary(firefoxBinaryPath);

	        // Initialize the FirefoxDriver with options
	        WebDriver driver = new FirefoxDriver(options);
	        
	    driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	
	@Test  (priority = 1 ,description =  "Login Test")
	public void loginpage() throws InterruptedException {
		
		
		d.get("https://gor-pathology.web.app/");
		Thread.sleep(3000);
		
		
		d.findElement(By.xpath("//input[@name ='email']")).sendKeys("test@kennect.io");
		Thread.sleep(3000);
		
		
		d.findElement(By.xpath("//input[@name ='password']")).sendKeys("Qwerty@1234");
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//button[@type ='submit']")).click();
		Thread.sleep(3000);
		
		String expected_url = "https://gor-pathology.web.app/dashboard";
		String actual_url = d.getCurrentUrl();
		
		assertEquals(actual_url, expected_url);
		
	}
	
	@Test(priority = 2 ,description  = "Todo_Test" , enabled = false)
	public void homepage() throws InterruptedException {
		
	
		

		
		d.findElement(By.xpath("//span[@class='MuiButton-label'][contains(.,'Add')]")).click();
		Thread.sleep(3000);
	   
		String todolist="activitytest-vishal";
		
		d.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys(todolist);
		Thread.sleep(3000);

		
		d.findElement(By.xpath("//button[@type = 'submit']")).click();
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(d, 10);
		
		WebElement dashboard = d.findElement(By.xpath("//span[contains(.,'Dashboard')]"));
		
		wait.until(ExpectedConditions.elementToBeClickable(dashboard)).click();
		

		WebElement table = d.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[2]/div[1]/ul"));
				
		List<WebElement> rowsList = table.findElements(By.tagName("li"));
		
		System.out.println("Total number of rows " + rowsList.size());

		
	     Iterator<WebElement> i = rowsList.iterator();
	     
	     while(i.hasNext()) {
	    	    WebElement row = i.next();
	    	    String j = row.getText();
	    	    
	    	    if ( j.contentEquals(todolist) )
	    	     {
	    	    
	    	    	System.out.println("To DO List is added") ;
	    	    	
	    	    break;
	    	  	
	    	      }
	    	  
	    	    }	
	
		      }	
	
	
	@Test(priority = 3 ,description = " Cost Calculator")
	public void cost_calculator() throws InterruptedException {
	//	
		JavascriptExecutor js = (JavascriptExecutor) d;
		
	    js.executeScript("window.scrollBy(0,250)", "");
		
		Thread.sleep(3000);
		
        WebElement m=d.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/button[2]"));
	    m.click();
		
		
		//js.executeScript("arguments[0].click();", m);
        Thread.sleep(3000);
       
	 
        d.findElement(By.xpath("(//div[contains(.,'VITAMIN B12, SERUM')])[6]")).click();
        Thread.sleep(4000);
       
        
        String testname = "VITAMIN B12, SERUM - 900₹";
        String actualtest = d.findElement(By.xpath("//span[@class='MuiChip-label']")).getText();
        
        assertEquals(testname, actualtest);
        
        Thread.sleep(4000);
        
        d.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[2]/div[2]/div/div")).click();
        Thread.sleep(3000);
        
        d.findElement(By.xpath("//li[@data-value='10']")).click();
        Thread.sleep(3000);
        
    
        
        
		
	}
	
	
	@Test(priority = 4 ,description = " additing_patients")
	public void additingpatients() throws InterruptedException {
		
		
		
		
	    d.findElement(By.xpath("(//span[contains(.,'Tests')])[1]")).click();
        Thread.sleep(3000);
        
		d.findElement(By.xpath("//a[@href = '/patients/add']")).click();
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//input[@name='name']")).sendKeys("Testing");
		Thread.sleep(3000);

		d.findElement(By.xpath("//input[@name='email']")).sendKeys("Testing123@gmail.com");
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//input[@name='phone']")).sendKeys("9000000000");
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//span[@class='MuiButton-label jss45']")).click();
		Thread.sleep(3000);
		
		
		
		d.findElement(By.xpath("//input[@name='height']")).sendKeys("170");
		Thread.sleep(3000);

		

		d.findElement(By.xpath("//input[@name='weight']")).sendKeys("80");
		Thread.sleep(3000);

		

		d.findElement(By.xpath("//input[@name='age']")).sendKeys("30");
		
		
		Thread.sleep(3000);

		
		d.findElement(By.xpath("//span[@class='MuiButton-label jss45']")).click();
		Thread.sleep(3000);
		
		
		d.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div")).click();
		Thread.sleep(3000);

		
		
	} 
	
	
	@AfterTest
	public void teardown() {
		
		
		d.close();
		
	}
	
	
	
}
