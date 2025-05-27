package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSearchCSSSelector {
	public static final String url = "https://www.amazon.com/";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// LOCATE THE ELEMENTS // WHEN YOU OPEN THE DOM
		// CSS Selector --- VS ----- Xpath

//		*
//		 * CSS SELECTOR VS XPATH
//		 * 
//		 * by ID: #login ----------- @id='login' 
//		 * by class: .button --------- @class='button'; 
//		 * by tag: input ------------- @input 
//		 * by attribute:input[type'text'] ----//input[@type='text']
//		 * 
//		 * Select direct child div > span //div/span
//		 * 
//		 *

		/*
		 * YOU MAY HAVE SOMETHING LIKE THIS 
		 * 
		 * span< open 
		 * div < open 
		 * div /> close 
		 * span/> span close 
		 * 
		 */
		
		
		
		
		
		WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		searchBox.sendKeys("deck lights");
		Thread.sleep(3000);
		// this is one way to create this BUT there is more
//		WebElement clickSearch = driver.findElement(By.cssSelector("input#nav-search-submit-button"));
//		clickSearch.click();
		WebElement clickSearch = driver.findElement(By.cssSelector("#nav-search-submit-text"));
		clickSearch.click();
		Thread.sleep(3000);

		driver.quit();

	}

}
