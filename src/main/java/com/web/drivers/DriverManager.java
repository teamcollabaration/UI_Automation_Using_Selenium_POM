package com.web.drivers;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	private DriverManager() {
		
	}
	
	private static ThreadLocal<WebDriver> dr= new ThreadLocal<WebDriver>();
	 public static WebDriver getDriver() {
			return dr.get();
		}
		
		public static void setDriver(WebDriver driverref) {
			dr.set(driverref);
		}
		
		public static void unLoad() {
			dr.remove();
		}

}
