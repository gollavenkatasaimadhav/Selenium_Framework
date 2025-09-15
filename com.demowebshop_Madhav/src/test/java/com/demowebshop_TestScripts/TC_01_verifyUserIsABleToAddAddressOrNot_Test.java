package com.demowebshop_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.demowebshop_GenericUtility.BaseTest;
import com.demowebshop_POM.AddNewAddressPage;
import com.demowebshop_POM.AddressesPage;

public class TC_01_verifyUserIsABleToAddAddressOrNot_Test extends BaseTest {

	@Test
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException {
		webDriverUtility.javaScriptScroll(driver);
		homePage.getAddressesLink().click();

		AddressesPage addressesPage = new AddressesPage(driver);
		addressesPage.getAddNewBtn().click();

		AddNewAddressPage addNewAddress = new AddNewAddressPage(driver);
		addNewAddress.getFirstNameTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 0));
		addNewAddress.getLastNameTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 1));
		addNewAddress.getEmailNameTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 2));

		webDriverUtility.selectByVisibleText(addNewAddress.getCountryDropDown(),
				fileUtility.readDataFromPropertyFile("country"));

		addNewAddress.getCityTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 3));
		addNewAddress.getAddress1TextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 4));
		addNewAddress.getPincodeTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 5));
		addNewAddress.getPhoneNumberTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 6));
		addNewAddress.getSaveBtn().click();

		Thread.sleep(2000);
		webDriverUtility.captureWebPageScreenShot(driver);

	}

}
