package com.neotech.review04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class WebTableExample extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		Thread.sleep(1000);
		// find the number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='MuiBox-root css-0']//tr"));
		System.out.println("The number of rows --> " + rows.size());
		List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		System.out.println("The number of col --> " + cols.size());

		List<WebElement> cells = driver.findElements(By.xpath("//div[@class='MuiBox-root css-0']//td"));
		System.out.println("The number of total cells --> " + cells.size());
		Thread.sleep(2000);

		System.out.println("----------------------------------------------------------------");

		// If i want to print the first row of the table
		// 1st way, Static way, location all the WebElements at once
		System.out.println();
		List<WebElement> firstRowList = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		for (WebElement el : firstRowList) {
			System.out.print(el.getText() + "|");

		}
		System.out.println();
		// 2nd way, Dynamic way, location the WebElements one-by-one
		for (int i = 1; i <= cols.size(); i++) {

			String path = "//table/tbody/tr[1]/td[" + i + "]";
			// System.out.println(path);

			WebElement el = driver.findElement(By.xpath(path));
			System.out.print(el.getText() + "|");

		}
		System.out.println("----------------------------------------------------------------");
		System.out.println("Let us print all the cells of all the rows");
		System.out.println("----------------------------------------------------------------");

		for (int row = 1; row <= rows.size(); row++) { // iterating the rows

			// to skip the last column we said --> col < cols.size();

			for (int col = 1; col < cols.size(); col++) { // iterating the colums

			}

//			//
//			//for (int row = 1; row <= rows.size(); row++) { // iterating the rows
//
//			// to skip the last column we said -> col < cols.size();
//			for (int col = 1; col < cols.size(); col++) { // iterating the columns
//				// String path = "//table/tbody/tr[" + row + "]/td[" + col + "]";
//				// System.out.println(path);
//
//				WebElement el = driver.findElement(By.xpath("//table/tbody/tr[" + row + "]/td[" + col + "]"));
//				System.out.println(el.getText());f
//			}
//			System.out.println();
//
//		}

			tearDown();

		}
	}

}
