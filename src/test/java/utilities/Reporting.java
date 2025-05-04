package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.devtools.v133.page.Page.CaptureScreenshotFormat;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
//import org.yaml.snakeyaml.internal.Logger;

import com.oranghrm.Base_class;

import io.qameta.allure.Allure;

public class Reporting extends Screenshots implements ITestListener {
		
   Base_class b = new Base_class();
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("The is passed " +result.SUCCESS);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

		
		try {
			capturescreenshots("C://Users//ADMIN//eclipse-workspace//oranghrm//screenshots//", result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.logger.info(result.getName()+"this method is failed");
       File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Attach screenshot to Allure report
        try {
			Allure.addAttachment("Screenshot", new FileInputStream(screenshot));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("The is failed " +result.SKIP);
	
	}

	
	
	
}
