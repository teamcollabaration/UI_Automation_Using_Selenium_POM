package com.web.tests;

import org.testng.annotations.Test;

import com.web.pages.HomePage;

public class HomePageTest extends BaseTest {
	private HomePageTest() {

	}

	@Test
	public void CheckSignLink() {
		new HomePage().clickSignin();
	}
}
