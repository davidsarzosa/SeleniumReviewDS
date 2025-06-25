package com.neotech.review04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class CalendarHandling extends CommonMethods {

	// Go to this link: https://jqueryui.com/
	// Click on Datepicker from the left menu
	// Show the Calendar
	// Select 09/25/2026 from the Calendar
	// Verify that you have selected 09/25/2026

	public static void main(String[] args) {

		setUp();

		WebElement link = driver.findElement(By.xpath("Datepicker"));

		// firstWay, using Selenium click method
		link.click();

		// 2nd way, using Common Methods click() method
		click(link);

		// Switching to the Frame
		// 1st way using Selenium switchTo().frame() method
		driver.switchTo().frame(0);

		// 2nd way, using CommonMethods switchToFrame() method
		// using the switchToFrame(0);method
		switchToFrame(0);

		// 3rd way, using CommonMethods switchToFrame() method (using the webEelement )
		switchToFrame(driver.findElement(By.tagName("iFrame")));

		WebElement dateTextBox = driver.findElement(By.id("datepicker"));
		dateTextBox.click();

		String ExpectedMonthYear = "September 2026";

		// Iterate until "September 2026"

		while (true) {
			WebElement monthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title"));
			String monthYearText = monthYear.getText();

			if (monthYearText.equals(ExpectedMonthYear)) {
				break;

			}
			driver.findElement(By.xpath("//span[text()='Next']")).click();

		}
		wait(2);

		// now we need to click on the correct date
		String expectedDayString = "25";
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

		// Iterate all the days untill I find 25th and then click on it
		for (WebElement day : days) {
			if (day.getText().equals(expectedDayString)) {
				// I found the correct day
				day.click();
				break;

			}
		}

		wait(2);

		// Let's verity that we selected the correct date --> 09/25/2026

		String expectedDate = "09/25/2026";

		String actualText1 = dateTextBox.getAttribute("value");
		String actualText2 = dateTextBox.getDomProperty("value");

		if (actualText1.equals(expectedDate)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}

		tearDown();

	}
}
