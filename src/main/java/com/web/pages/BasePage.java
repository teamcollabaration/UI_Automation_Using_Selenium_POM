package com.web.pages;

import org.openqa.selenium.By;

import com.web.constants.Waitstrategy;
import com.web.drivers.DriverManager;
import com.web.factories.ExplicitWaitFactory;


public class BasePage {
	protected void click(By by) {
		DriverManager.getDriver().findElement(by).click();
	}

	protected void click(By by, Waitstrategy wait) {
		ExplicitWaitFactory.performExplicitWait(wait, by).click();
		
	}
	protected void sendkeys(By by,String value) {	
		DriverManager.getDriver().findElement(by).sendKeys(value);
	}

}
