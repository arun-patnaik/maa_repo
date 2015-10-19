package screenshotsonerror;

import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.jetty.html.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import java.util.List;

//import javax.lang.model.util.Elements;

//import org.openqa.jetty.html.Element;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturebothimagesandlinks {

	public static void main(String[] args) {
FirefoxDriver driver=new FirefoxDriver();
driver.get("http://yahoo.com");

/*List<WebElement>links=driver.findElements(By.tagName("a"));
System.out.println(Element.si);
Elements.add(driver.findElement(By.tagName("images")));
System.out.println(Element.SIZE);*/

List<WebElement> elements=driver.findElements(By.tagName("a"));
System.out.println(elements.size());
elements.addAll(driver.findElements(By.tagName("img")));
System.out.println(elements.size());


}

}
