package com.web.drivers;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import com.web.constants.ConfigProperties;
import com.web.constants.Frameworkconstants;
import com.web.utils.ReadPropertyFileUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverinitilization {

	private Driverinitilization() {
	}

	public static void initDriver() throws IOException {

		if (Objects.isNull(DriverManager.getDriver())) {
			WebDriverManager.chromedriver().setup();
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().manage().timeouts().implicitlyWait(Frameworkconstants.getWaittime(),
					TimeUnit.SECONDS);
			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().get(ReadPropertyFileUtils.getValue(ConfigProperties.URL));

		}
	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unLoad();
		}
	}

}
