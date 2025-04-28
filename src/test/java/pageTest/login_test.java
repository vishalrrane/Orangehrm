package pageTest;

import java.util.concurrent.TimeUnit;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oranghrm.Base_class;

import pageobjects.login_page;
import utilities.Readconfig;


//@Listeners(utilities.Reporting.class)
public class login_test extends Base_class {

	@BeforeMethod
	public void setup() {

		Initialization();
		driver.get(base_url);
		logger.info("URL is Open");

	}

	@Test(priority = 1)
	public void login_TC1() throws InterruptedException {

		login_page lp = new login_page(driver);

		lp.enteruserneme(uname);
		logger.info("Enter Username");

		Thread.sleep(3);
		lp.enterpssword(password);

		logger.info("Enter Passward");
		Thread.sleep(3);

		lp.clickonbtn();
		logger.info("Click on the login Button");
		Thread.sleep(3);

		String Expectedtitle = "Swag Labsss";
		String Actual_title = driver.getTitle();
		
		Assert.assertEquals(Actual_title, Expectedtitle);
		
		/*
		 * if (Expectedtitle == Actual_title) { Assert.assertTrue(true);
		 * logger.info("Title test is passed");
		 * 
		 * } else { logger.info("Title test is failed");
		 * 
		 * }
		 */
		

	}

	@AfterMethod
	public void teardown() {

		closing();

	}

}
