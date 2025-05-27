package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSearch {

	public static final String url = "https://www.amazon.com/";

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//Thread.sleep(2000);

		// We do have 8 WebLocators
		/*
		 * -ID - Name - ClassName - LinkText - PartialLinkedText - TagName - CSS
		 * Selector - Xpath
		 * 
		 */
		// Getting the Xpath

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Ecuadorian Coffee");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		// WebElement searchButton =
		// driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		//Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("G-shock Men Watch");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Pink Floyd Frame");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		Thread.sleep(15000);
		driver.quit();

		
		
		// RELATIVE XPATH FORMULA : 
			//tag[@attribute='attribute value']
				// with methods: 
					// contains(@attribute, 'something')
		
		
		
		
	}

}
