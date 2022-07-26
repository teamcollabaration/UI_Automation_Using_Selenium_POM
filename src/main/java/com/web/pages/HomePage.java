package com.web.pages;

import org.openqa.selenium.By;



public class HomePage extends BasePage{

	private final By linksignin=By.xpath("//div[@class='header_user_info']//a");
	
	public LoginPage clickSignin() {
		click(linksignin);
		return new LoginPage();
	}
	
	
	
}
