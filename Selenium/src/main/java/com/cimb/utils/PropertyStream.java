package com.cimb.utils;

import java.io.InputStream;
import java.util.Properties;

public class PropertyStream {

	private static Properties prop;

	public static void loadProperty(String filename) throws Exception {
		try {
			prop = new Properties();
			InputStream is = PropertyStream.class.getResourceAsStream("/" + filename);
			prop.load(is);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to open the file: " + filename);
		}
	}

	public static String getProperty(String key) {
		String value = prop.getProperty(key);
		if (value == null)
			throw new RuntimeException(String.format("Key %s is not found", key));

		return value;
	}

	public static void setProperty(String key, String name) {
		if (key.isEmpty())
			throw new RuntimeException("Key name cannot be empty!");

		prop.setProperty(key, name);
	}
}
