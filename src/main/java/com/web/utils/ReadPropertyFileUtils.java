package com.web.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.web.constants.ConfigProperties;
import com.web.constants.Frameworkconstants;

public class ReadPropertyFileUtils {
	private ReadPropertyFileUtils() {

	}
	public static String getValue(ConfigProperties key) throws IOException {
		String value = key.toString();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(Frameworkconstants.getConfigfilepath());
		prop.load(fis);
		return prop.getProperty(value);

	}

}
