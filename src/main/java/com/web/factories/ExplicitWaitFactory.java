package com.web.factories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.web.constants.Frameworkconstants;
import com.web.constants.Waitstrategy;
import com.web.drivers.DriverManager;
public class ExplicitWaitFactory {
	private ExplicitWaitFactory() {}
	public static WebElement performExplicitWait(Waitstrategy waitstrategy, By by) {
		WebElement element = null;
		if(waitstrategy == Waitstrategy.CLICKABLE) {
			element = 	new WebDriverWait(DriverManager.getDriver(), Frameworkconstants.getWaittime())
					.until(ExpectedConditions.elementToBeClickable(by));
		}
		else if(waitstrategy == Waitstrategy.PRESENCE) {
			element =	new WebDriverWait(DriverManager.getDriver(), Frameworkconstants.getWaittime())
					.until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if(waitstrategy == Waitstrategy.VISIBLE) {
			element =new WebDriverWait(DriverManager.getDriver(),Frameworkconstants .getWaittime())
					.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		else if(waitstrategy == Waitstrategy.NONE) {
			element = DriverManager.getDriver().findElement(by);
		}
		return element;
	}

}
