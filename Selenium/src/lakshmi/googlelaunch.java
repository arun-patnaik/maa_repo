package lakshmi;

import org.openqa.selenium.chrome.ChromeDriver;

public class googlelaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://bing.com");
		
	}

}
