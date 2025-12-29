package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximizeWindowTest {

    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	WebDriverManager.chromedriver().setup();
    	//WebDriverManager.edgedriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();// maximize window in browser
    }

}
