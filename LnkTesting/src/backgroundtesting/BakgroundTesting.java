package backgroundtesting;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class BakgroundTesting {
	public static void main(String[] args) {
HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
driver.get("http://yahoo.com");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
	}

}
