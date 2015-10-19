package screenshotsonerror;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot1 {

	public static void main(String[] args)throws IOException {
FirefoxDriver driver=new FirefoxDriver();
driver.get("http://msn.com");
File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcfile, new File("C:\\Users\\Qedge\\Desktop\\Bharath\\msn.png"));
	}

}
