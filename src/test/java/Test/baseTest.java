package Test;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Driverfactory.DriverFactory;
import Pages.Youtube;
import Utilities.configfileReader;

public class baseTest {

	DriverFactory drf;
	configfileReader cp;
	Properties prop;
	WebDriver driver;
	Youtube yt;

	@BeforeTest

	public void setUp() throws IOException {

		cp = new configfileReader();
		prop = cp.initProp();
		drf = new DriverFactory();
		driver = drf.startDriver(prop);
		yt = new Youtube(driver);
	}

	@AfterTest

	public void closeAll() {
		drf.closeDriver();
	}

}
