package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.OptionsManager;
import utils.Xls_Reader;

public class BasePage {

	public WebDriver driver;
	public Properties prop;
	public OptionsManager optionsManager;
	public Xls_Reader d = new Xls_Reader("./src/main/java/testData/Form_Data.xlsx");

	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();

	public WebDriver initialize_driver(String browserName, Properties prop) {
		optionsManager = new OptionsManager(prop);
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver(optionsManager.getChromeOptions()));
		}

		else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tldriver.set(new FirefoxDriver(optionsManager.getFirefoxOptions()));
		}

		else {
			System.out.println("browser Name " + browserName + " is not found, please pass the correct browser");
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		getDriver().manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		getDriver().get(prop.getProperty("url"));
		return getDriver();
	}

	public static synchronized WebDriver getDriver(){
		return tldriver.get();
	}

	public Properties initialize_Properties() {

		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/main/java/configuration/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;

	}

	public String getScreenshot() {
		File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + ".png";
		File destination = new File(path);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			System.out.println("Capture Failed " + e.getMessage());
		}
		return path;
	}
}
