package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCls {

	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void fill(WebElement e, String text) {
		e.sendKeys(text);
	}

	public static void btnClick(WebElement e) {
		e.click();

	}

	public static void closeBrowser() {
		driver.quit();

	}

}
