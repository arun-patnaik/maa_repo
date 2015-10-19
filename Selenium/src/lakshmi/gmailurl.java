package lakshmi;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmailurl {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		String exp="Gmail";
		driver.findElement(By.linkText("Gmail")).click();
		String act=driver.getTitle();
		if(exp.equals(act))
		{
			System.out.println("gmail link working properly");
			
		}
		else
		{
			System.out.println("gmail link not working");
		}
driver.close();
	}

}
