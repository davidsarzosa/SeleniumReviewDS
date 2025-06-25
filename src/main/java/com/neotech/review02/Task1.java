package com.neotech.review02;

import utils.ConfigsReader;
import utils.Constants;

public class Task1 {

	public static void main(String[] args) {

		// I just read the file only one time
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);

		String browser = ConfigsReader.getProperty("browser");
		System.out.println("browser --> " + browser);

		System.out.println("url --> " + ConfigsReader.getProperty("url"));

	}

}
