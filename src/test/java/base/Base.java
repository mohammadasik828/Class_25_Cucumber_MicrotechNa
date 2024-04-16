package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
	public static WebDriver driver;

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void click(By byObject) {
		driver.findElement(byObject).click();
	}
	public static void clear(By byObject) {
		driver.findElement(byObject).clear();
	}

	public static void sendKeys(By byObject, String value) {
		driver.findElement(byObject).sendKeys(value);
	}
	public static String getValue(By byObject , String value) {
		String actualValue = driver.findElement(byObject).getAttribute(value);
		return actualValue;
	}

	public static String getText(By byObject) {
		String text = driver.findElement(byObject).getText();
		return text;
	}
}
