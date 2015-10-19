package Links;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LinksTesting2 {
	


	public static void main(String[] args) {
		//WebDriver driver;
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("MyProfile");
		FirefoxDriver driver = new FirefoxDriver(fp);
		//driver = new FirefoxDriver();
		
		driver.get("http://www.bing.com");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String expurl = driver.findElement(By.linkText("VIDEOS")).getAttribute("href");
		driver.findElement(By.linkText("VIDEOS")).click();
		//driver.findElement(By.linkText("Maps")).click();
		
		String acturl = driver.getCurrentUrl();
		
		if (acturl.contains(expurl)){
			
			System.out.println("Video Link working correctly");
		}
		else {
			System.out.println("Video Link not working correctly");
		}
		
		driver.close();
	}
	

}
