package com.web.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.web.drivers.Driverinitilization;



public class BaseTest {

	protected BaseTest() {

	}
	@BeforeMethod
	protected void SetUp() throws IOException {
		Driverinitilization.initDriver();
	}
	
	@AfterMethod
	protected void TearDown() {
		Driverinitilization.quitDriver();
	}

}
