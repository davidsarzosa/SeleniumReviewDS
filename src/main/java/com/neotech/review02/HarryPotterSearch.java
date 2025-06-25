package com.neotech.review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.BaseClass;

public class HarryPotterSearch extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// Go to https://amazon.com
		// select Books from the search drop-down
		// Type Harry potter
		// And click on Search
		// Check "Kindle Unlimited Eligible" checkbox on the left
		setUp();
		// WebElement searchBar =
		Thread.sleep(2000);

		WebElement selectDdElement = driver.findElement(By.id("searchDropdownBox"));
		Select selectdd = new Select(selectDdElement);

		// Print all the options of the dropDown
		// we need to put them into a list
		List<WebElement> optionsList = selectdd.getOptions();
		for (WebElement options : optionsList) {
			System.out.println(options.getText());
		}

		// 3 different ways to select one drop-Down option
		// selectdd.selectByVisibleText("Books");
		// selectdd.selectByIndex(4);
		// selectdd.deselectByValue("search-alias=stripbooks");

		// Thread.sleep(000);
		WebElement searchTxt = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchTxt.sendKeys("Messi");
		Thread.sleep(2000);
		searchTxt.clear();
		Thread.sleep(2000);
		searchTxt.sendKeys("Harry Potter");
		// driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement submitButton = driver.findElement(By.id("nav-search-submit-button"));
		submitButton.submit();

//		List<WebElement> elementList = driver.findElements(By.xpath("//li[@class='a-spacing-micro']"));
//		System.out.println("There are -> " + elementList.size() + " <- elements with that xPath");
//
//		// This exception is nightmare -> StaleElementReferenceException
//		// Happens when you click, and don't break the loop
//		for (WebElement el : elementList) {
//			String elementText = el.getText();
//
//			if (elementText.equals("Kindle Unlimited Eligible")) {
//				el.click();
//				break;
//			}
//		}

		Thread.sleep(3000);
		tearDown();

	}

}
