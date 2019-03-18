package gri;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class gridd {
	public WebDriver driver;
	@Test
	public void testgrid() throws MalformedURLException{
		DesiredCapabilities cp = DesiredCapabilities.chrome();
	    cp.setBrowserName("chrome");
	        cp.setPlatform(Platform.WIN8_1);
	        driver = new RemoteWebDriver(new URL("http://localhost:5557/wd/hub"),cp);
	        driver = new RemoteWebDriver(new URL("http://localhost:5556/wd/hub"),cp);
	        driver.get("http://facebook.com");
	}
	
}
