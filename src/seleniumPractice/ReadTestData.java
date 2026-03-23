package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadTestData {
	
	public static String getData(String mykey) throws IOException {
		FileInputStream myfile = new FileInputStream("TestData/ApsrtcData.properties");  // News paper
		Properties prop = new Properties();  // is like news reader
		prop.load(myfile); // handover the newspaper to news reader
		String value = prop.getProperty(mykey);
		return value;
	}

}
