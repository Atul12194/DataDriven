package com.w2a.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase {
	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException {
		verifyEquals("abc", "xyz");
		Thread.sleep(3000);
		log.debug("inside Login test");
        click("bmlBtn_CSS");
        Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))), "Login not successful");
		log.debug("Login Successfully Executed");
		//Assert.fail("Login Not Success");
		
	}

}
