package com.demowebshop_GenericUtility;

public interface FrameWorkConstants {

	JavaUtility javaUtility = new JavaUtility();

	static final String propertyPath = "./src/test/resources/testData/data.properties";

	static final String excelPath = "./src/test/resources/testData/data.xlsx";

	static final String screenshotPath = "./screenshot/" + javaUtility.dateAndTime() + ".png";

	static final String reportPath = "./reports/" + javaUtility.dateAndTime() + ".html";

}
