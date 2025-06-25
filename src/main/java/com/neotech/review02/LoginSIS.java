package com.neotech.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class LoginSIS extends BaseClass {

	// Login to SIS Web Application
	// https://sis.neotechacademy.com/
	// username -> Admin
	// password -> Neotech$123

	public static void main(String[] args) throws InterruptedException {

		setUp();

		// We are performing our test
		Thread.sleep(1000);

		WebElement username = driver.findElement(By.id("tUsername"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.id("tPassword"));
		password.sendKeys("Neotech$123");

		// The input whose type attribute has a value of submit
		WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		submitBtn.click();

		Thread.sleep(3000);
		tearDown();

	}

}
