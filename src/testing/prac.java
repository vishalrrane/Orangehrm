package testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class prac {

	WebDriver d;

    @BeforeTest(groups = {"sanity"})
	public  void  beforetest() {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\VISHAL\\Desktop\\Selenium 64 bit\\Web Driver\\chromedriver.exe");
		 d = new ChromeDriver();
		d.manage().window().maximize();
    	d.get("https://star.samco.in/"); 

		
	}
    
    
    @Test(priority =1 ,groups ={"sanity"})
    @Parameters({"username","password"})
    public void  logintest(String user ,String pass) throws InterruptedException {
    	
    	
    	d.findElement(By.xpath("//input[@id ='uname']")).sendKeys(user);	
    	Thread.sleep(3000);
    
    	
    	d.findElement(By.xpath("//input[@id ='passwd']")).sendKeys(pass);
    	Thread.sleep(3000);

    	
    	d.findElement(By.xpath("//button[@id ='login_btn']")).click();
    	Thread.sleep(3000);

    String currenturl = d.getCurrentUrl();
    String expectedurl = "https://star.samco.in/dashboard";
    
    Assert.assertEquals(currenturl, expectedurl);
    	
    }
    
    
    
    
    
    
    
   @Test(priority = 2)
   public void  tittletest() {
	   
	   
	   String exptitle = "Samco Back Office";
	   String acttitle = d.getTitle();
	   
	   Assert.assertEquals(acttitle,exptitle);
	   
	   
   }
   
   
   @Test(priority =3)
   
   public void screenshottest() throws IOException, InterruptedException {
	   
	   
	   
	   TakesScreenshot st =  (TakesScreenshot)d;
	   
	   File src = st.getScreenshotAs(OutputType.FILE);
	   
	   File dest = new File ("C:\\Users\\VISHAL\\Desktop\\hii.png");
	   
	   FileUtils.copyFile(src ,dest);
	   Thread.sleep(5000);
	   
 
   }
	   @Test(priority =4)

	  public void scrollingtest() throws InterruptedException {
		  
		  
		  JavascriptExecutor js = (JavascriptExecutor)d;
		  js.executeScript("window.scrollBy(0 ,300)");
		  Thread.sleep(3000);
		  
		  System.out.println("scroll By 300 pixel");
		  
		  d.navigate().refresh();
		  
	  }
	   
	   
	   @Test(priority =5 ,groups= {"sanity"})
	   public void logouttest() throws InterruptedException {
		   
		   
		   WebElement profile = d.findElement(By.xpath("//a[@id ='profile_image']")); 
		   
		   Actions a = new Actions(d);
		   a.moveToElement(profile).build().perform();
		   
		   Thread.sleep(5000);
		   
		   
		   WebElement logout = d.findElement(By.xpath("//a[@onclick ='logout()']"));
		   
		   WebDriverWait wb = new WebDriverWait(d, 10);
		   
		   wb.until(ExpectedConditions.elementToBeClickable(logout)).click();
		   
		
		   
	   }

    
    @AfterTest(groups = {"sanity"})
    public void teardown() {
    	
    	
    	d.close();
    	
    	
    	
    }
		
		
		
	}


