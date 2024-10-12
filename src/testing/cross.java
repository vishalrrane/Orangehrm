package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cross {

	
	WebDriver d;

    @BeforeTest
    @Parameters({"browser"})
	public  void  beforetest(String browser) {
		

    	if (browser.contentEquals("chrome")) {
    	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VISHAL\\Desktop\\Selenium 64 bit\\Web Driver\\chromedriver.exe");
		 d = new ChromeDriver();
	
    	}else if (browser.contentEquals("firefox")){
    		
    		
    		System.setProperty("webdriver.gecko.driver","C:\\Users\\VISHAL\\Desktop\\Selenium 64 bit\\Web Driver\\geckodriver.exe");
   		 d = new FirefoxDriver();
   	
    		
    		
    	}
		
	}
    
    
    @Test
    public void  logintest() throws InterruptedException {
    	
    	
    	d.manage().window().maximize();
    	d.get("https://star.samco.in/"); 
    	
    	d.findElement(By.xpath("//input[@id ='uname']")).sendKeys("Rv32706");	
    	Thread.sleep(3000);
    
    	
    	d.findElement(By.xpath("//input[@id ='passwd']")).sendKeys("VISH@6647");
    	Thread.sleep(3000);

    	
    	d.findElement(By.xpath("//button[@id ='login_btn']")).click();
    	Thread.sleep(3000);

    String currenturl = d.getCurrentUrl();
    String expectedurl = "https://star.samco.in/dashboard";
    
    Assert.assertEquals(currenturl, expectedurl);
    	
    }
    
    
    
    @AfterTest
    public void teardown() {
    	
    	
    	d.close();
    	
    	
    	
    }
	
	
	
	
	
}
