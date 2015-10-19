package lakshmi;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class ielaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");
		

	}

}
