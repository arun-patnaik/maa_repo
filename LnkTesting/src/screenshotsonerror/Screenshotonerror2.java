package screenshotsonerror;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshotonerror2 {

	public static void main(String[] args)throws IOException {
FirefoxDriver driver=new FirefoxDriver();
driver.get("http://google.com");
try
{
driver.findElement(By.linkText("Qedge")).click();	
}
catch (Exception e)
{
File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcfile, new File("C:\\Users\\Qedge\\Desktop\\Bharath\\google.png"));
}
driver.close();
	}

}
