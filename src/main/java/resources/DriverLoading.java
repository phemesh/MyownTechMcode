package resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverLoading {
	static String myowndriver = null;
	public  static WebDriver driver = null;
	static String path = "./configration.properties";
	public static Properties prop=null;
	public static WebDriver loadDriver() throws IOException {
		FileInputStream fis = new FileInputStream(path);
		 prop = new Properties();
		prop.load(fis);
		myowndriver = prop.getProperty("browser");
		if (myowndriver.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (myowndriver.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.geckodriver.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (myowndriver.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
		
		}
	
	
}