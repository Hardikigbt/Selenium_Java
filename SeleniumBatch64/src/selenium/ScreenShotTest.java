package selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;

public class ScreenShotTest {

    public static void main(String[] args) throws IOException {
       // System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.ca/");
//		Add Commons.io Jar to the project

        File screenShotFile = driver.getScreenshotAs(OutputType.FILE);
//		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//This line is for Webdriver
        FileUtils.copyFile(screenShotFile, new File("E:\\QA Work Space\\SeleniumJar\\screenshot.png"));
    }

}
