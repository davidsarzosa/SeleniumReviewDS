package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser {
	public static void main(String[] args) throws InterruptedException {

		// open browser
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.nytimes.com/";
		driver.get(url);

		Thread.sleep(3000);
		String curentUrl = driver.getCurrentUrl();

		if (url.equals(curentUrl)) {
			System.out.println("Test Passed! ");
		} else {
			System.out.println("Failed!!! Different URL Found!! ");
		}

		String title = driver.getTitle();

		System.out.println("---------------------------------");
		System.out.println("Expected URL" + url);
		System.out.println("Currecnt URL " + curentUrl);
		System.out.println("Tittle " + title);
		

		driver.quit();

	}

}
