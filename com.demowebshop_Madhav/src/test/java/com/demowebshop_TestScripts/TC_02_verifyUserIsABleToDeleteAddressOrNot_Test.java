package com.demowebshop_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.demowebshop_GenericUtility.BaseTest;
import com.demowebshop_POM.AddressesPage;

public class TC_02_verifyUserIsABleToDeleteAddressOrNot_Test extends BaseTest {

	@Test
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException {
		webDriverUtility.javaScriptScroll(driver);
		homePage.getAddressesLink().click();

		AddressesPage addressesPage = new AddressesPage(driver);
		addressesPage.getDeleteBtn().click();

		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();

		Thread.sleep(2000);
		webDriverUtility.captureWebPageScreenShot(driver);

	}

}
