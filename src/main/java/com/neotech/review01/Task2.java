package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static final String url = "https://demoqa.com/text-box";

	public static void main(String[] args) throws InterruptedException {

		// Go to https://demoqa.com/text-box
		// Fill the form and submit
		// Use xPath or CSS Selector

		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("David
		// Sarzosa");
		driver.findElement(By.cssSelector("#userName")).sendKeys("David Sarzosa");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("daalejandrosm@gmail.com");
		// driver.findElements(By.cssSelector(".mr-sm-2.form-control")).get(1).sendKeys("daalejandrosm@gmail.com");
		driver.findElement(By.cssSelector("#permanentAddress")).sendKeys("Permanent Adress: Puembo Ecuador");

		// Even is there are two or more element with this locator, we will get the
		// first one in the DOM
		driver.findElements(By.cssSelector("textarea.form-control")).get(2).sendKeys("Current Adress Austin Texas");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);

		driver.quit();
	}

}
