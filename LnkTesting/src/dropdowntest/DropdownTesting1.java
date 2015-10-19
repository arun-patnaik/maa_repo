package dropdowntest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DropdownTesting1 {

	public static void main(String[] args) {
ProfilesIni pr=new ProfilesIni();
FirefoxProfile fp=pr.getProfile("Bharath");
FirefoxDriver driver=new FirefoxDriver(fp);
driver.get("http://amazon.in");
driver.findElement(By.id("searchDropdownBox")).sendKeys("books");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
driver.findElement(By.className("nav-input"));
	}

}
