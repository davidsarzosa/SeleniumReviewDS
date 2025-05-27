package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	// just practice, for this exmaple makes no difference if here or local
	public static final String url = "https://www.selenium.dev/";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// driver.get(url); // this will load the page but not have browser history
		driver.navigate().to(url); // will keep history, so you can go back and forward

		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.navigate().to("https://github.com/");
		Thread.sleep(1000);
		driver.navigate().to("https://maven.apache.org");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.quit();

	}

}
