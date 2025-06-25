package com.neotech.review04;

import org.openqa.selenium.By;

import utils.BaseClass;

public class PrintTableData extends BaseClass {

	// Go to https://the-internet.herokuapp.com/tables
	// I want you to print all the data from the tbody of the second table
	// Create the path dynamically
	// Don't print the last column

	public static void main(String[] args) {

		setUp();

		// The number of rows
		int rows = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr"));

		tearDown();

	}

}
