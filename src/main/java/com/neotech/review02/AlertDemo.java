package com.neotech.review02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import utils.BaseClass;

public class AlertDemo extends BaseClass {
	// https://neotech.vercel.app/alerts

	public static void main(String[] args) throws InterruptedException {
		setUp();
		Thread.sleep(2000);
		driver.findElement(By.id("btnAlert")).click();

		// When alert is open, you cannot intercat with the main page
		// driver.findElement(By.id("btnConfirm")).click();

		// We need to take case of the alert (JavaScript Pop-up)
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);

		System.out.println("The text of the alert is -> " + alert.getText());
		alert.accept();
		Thread.sleep(1000);

		// After accept/dismiss the alert, we can interact with the main page
		driver.findElement(By.id("btnPrompt")).click();

		Alert prompt = driver.switchTo().alert();

		// There are 4 methods we can use
		// getText(); Gets the text from the Alert;
		// sendKeys(); Sends text to the Alert
		// accept(); Clicking ok
		// dismiss(); Clicking on Cancel

		prompt.sendKeys("Hola como estas ");
		prompt.accept();

		Thread.sleep(1000);

		tearDown();

	}

}
