package com.neotech.review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class CheckBoxDemo extends BaseClass {

	// Go to https://demoqa.com/automation-practice-form
	// Check Female
	// Select all the Hobbies
	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
		Thread.sleep(2000);

		// ///////////////////////////////////////////
		// findElement vs findElements
		// findElement returns the first WebElement with that xPath
		// findElements return all the WebElements with that xPath
		// ////////////////////////////////////////////

		// It will return the first WebElement with that xPath
//		WebElement element = driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label"));
//		System.out.println(element.getText());

		// ////////////////////////////////////////////
		// 1 If Xpathh is wrong
		// Find Element --> will throw an Exception
		// Find Elements --> will return an Empty List of WebElements size = 0;

		// 2 If there are multiple WebElements with that xpath
		// finElement --> will return the first WebElement
		// find Elements --> will return all the WebElements inside a List (size = 3)

		// 3. If there only one WebElement with that Xpath
		// findWebElement --> will return the WebElement
		// findsElements --> will return all the WebElements inside a List (size=1)
		// ////////////////////////////////////////////

		// Locate all the checkBoxes

		List<WebElement> checkBoxList = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label"));

		// Click all the checkBoxes one-by-one
		for (WebElement checkBox : checkBoxList) {
			checkBox.click();
			Thread.sleep(1000);

		}

		Thread.sleep(1000);
		tearDown();

	}

}
