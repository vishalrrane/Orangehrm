package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.oranghrm.Base_class;

public class Screenshots extends Base_class {


	 String screenshotpath ;
	public Screenshots() {

	}

	public void capturescreenshots(String path, String methodname) throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File f = screenshot.getScreenshotAs(OutputType.FILE);
		 String screenshotpath = path + "_" + methodname+".png";
		FileUtils.copyFile(f, new File(screenshotpath));

	}

}
