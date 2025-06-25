package com.neotech.review02;

import org.openqa.selenium.By;

import utils.BaseClass;

public class Test2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// Preparing for the test

		setUp();

		// Do our test
		Thread.sleep(3000);
		// locate some elements
		// driver.findElement(By.id(""));

		// clean up everything
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		tearDown();

	}

}
