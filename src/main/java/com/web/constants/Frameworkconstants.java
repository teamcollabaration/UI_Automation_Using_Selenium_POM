package com.web.constants;

public class Frameworkconstants {

		private Frameworkconstants() {}
		private static final String RESOURCEPATH=System.getProperty("user.dir")+"/src/test/resources";
		private static final String CHROMEDRIVERPATH=RESOURCEPATH+"/Drivers/chromedriver";
		private static final String CONFIGFILEPATH=RESOURCEPATH+"/config/Framework.properties";
		private static final int WAITTIME=10;
		private static final String EXCELFILEPATH=RESOURCEPATH+"/Data/Userdata.xlsx";

		public static String getExcelfilepath() {
			return EXCELFILEPATH;
		}
		public static int getWaittime() {
			return WAITTIME;
		}
		public static String getConfigfilepath() {
			return CONFIGFILEPATH;
		}
		public static String getChromedriverpath() {
			return CHROMEDRIVERPATH;
		}

}
