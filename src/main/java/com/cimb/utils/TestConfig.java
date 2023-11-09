package com.cimb.utils;

import java.io.InputStream;
import java.util.Properties;

public class TestConfig {

	private static final Properties config;
	public static String TEST_BROWSER;
	public static String TEST_ENV;
	public static String TEST_ENV_VERSION;
	public static String TEST_OS;

	static {
		config = new Properties();
		InputStream is = TestConfig.class.getResourceAsStream("/testConfig.properties");
		try {
			config.load(is);
		} catch (Exception t) {
			System.out.println(t.getMessage());
			throw new RuntimeException(t.getMessage());
		}

		TEST_BROWSER = config.getProperty("browser");
		TEST_ENV = config.getProperty("environment");
		TEST_ENV_VERSION = config.getProperty("version");
		TEST_OS = config.getProperty("os");
	}

}
