package lakshmi;

import org.apache.xerces.impl.xs.SchemaSymbols;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class videolink {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("myprof");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://bing.com");
		String expurl=driver.findElement(By.linkText("VIDEOS")).getAttribute("href");
		driver.findElement(By.linkText("NEWS")).click();
		String act=driver.getCurrentUrl();
		if(expurl.contains(act))
		{
		System.out.println("videos link working");
		}
		else
		{
			System.out.println("video link not working");
			
		}
			
			
		
		

	}

}
