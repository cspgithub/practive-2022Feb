package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configfileReader {

	private Properties prop;
	private FileInputStream ip;

	public Properties initProp() throws IOException {
		prop = new Properties();
		ip = new FileInputStream("./src/test/resources/config.properties");
		prop.load(ip);
		return prop;
	}

}
