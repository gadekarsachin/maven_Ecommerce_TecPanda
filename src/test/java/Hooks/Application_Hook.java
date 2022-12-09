package Hooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.factory.Base_driver;
import com.utility.Configur;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.config.Config;

public class Application_Hook {

	private Base_driver basedriver;
	private WebDriver driver;
	Properties prop;
	private Configur conf;

	@Before(order = 0)
	public void getreader() {

		conf=new Configur();
		prop=conf.initialized_prop();
	}

	@Before(order = 1)
	public void launchbrowser() {
		String browsername = prop.getProperty("browser");
		basedriver = new Base_driver();
		driver = basedriver.initializedDriver(browsername);
	}

	@After(order = 0)
	public void quitebrowser() {
		 driver.close();
	}
}
