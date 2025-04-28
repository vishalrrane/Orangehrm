package pageobjects;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.oranghrm.Base_class;

public class login_page {

	WebDriver driver;

	@FindBy(name = "user-name")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "login-button")
	WebElement button;


	
	   public login_page(WebDriver driver) { // TODO Auto-generated constructor stub
	 
      this.driver = driver;
	  PageFactory.initElements(driver, this); 
	  
	   
	   }
	 


	public void enteruserneme(String uname) {

		username.sendKeys(uname);
	}

	public void enterpssword(String pass) {

		password.sendKeys(pass);
	}

	public void clickonbtn() {

		button.click();
	}


	
	
	

}
