package org.sourcefuse.helper;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class ResourceHelper {

	/**
	 * This reads the config.properties file kept in the user directory of the
	 * project and stores it into a key value pair
	 * 
	 * @param globalMap
	 * @throws IOException
	 */
	public static void readProperties(HashMap<String, Object> globalMap) throws IOException {
		String path = System.getProperty("user.dir");
		String configpath = path + "\\config.properties";
		FileReader reader = new FileReader(configpath);
		Properties prop = new Properties();
		prop.load(reader);
		for (Object key : prop.keySet()) {
			System.out.println(key + ": " + prop.getProperty(key.toString()));
			globalMap.put((String) key, prop.getProperty(key.toString()));
		}
	}

	/**
	 * This loads the testdata file For now we have kept the testdata as properties
	 * file and the location will be read from config.properties file. File Should
	 * be kept inside the project
	 * 
	 * @param testdataMap
	 * @param filePath
	 * @throws IOException
	 */
	public static void loadtestData(HashMap<String, String> testdataMap, String filePath) throws IOException {
		String path = System.getProperty("user.dir");
		String configpath = path + filePath;
		FileReader reader = new FileReader(configpath);
		Properties prop = new Properties();
		prop.load(reader);
		for (Object key : prop.keySet()) {
			System.out.println(key + ": " + prop.getProperty(key.toString()));
			testdataMap.put((String) key, prop.getProperty(key.toString()));
		}
	}

}
