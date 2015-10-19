package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LinkTsting8 {

	public static void main(String[] args) {
ProfilesIni pr=new ProfilesIni();
FirefoxProfile fp=pr.getProfile("Bharath");
FirefoxDriver driver=new FirefoxDriver(fp);
driver.get("http://newtours.demoaut.com");
List<WebElement> links=driver.findElements(By.tagName("a"));
for (int i = 0; i <links.size(); i++)
{
if (links.get(i).isDisplayed())
{
String linkName=links.get(i).getText();
String expurl=links.get(i).getAttribute("href");
links.get(i).click();
String acturl=driver.getCurrentUrl();
if (acturl.contains(expurl))
{
System.out.println(linkName+"is working correctly");	
}
else
{
	System.out.println(linkName+"is not working  correctly");
}
driver.navigate().back();
links=driver.findElements(By.tagName("a"));
}
	}
	}
}
