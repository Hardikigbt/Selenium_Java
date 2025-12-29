package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowsersTest {

    public static void main(String[] args) {

        WebDriver driver;
        String browser = "Firefox"; //Chrome, Safari //Read this value from data file, Excel, Properties, ..
        
     // Detect OS
        String os = System.getProperty("os.name").toLowerCase();
        System.out.println("Running on OS: " + os);


        if (browser.equals("Firefox")) {
            //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
        	WebDriverManager.firefoxdriver().setup();
        	driver = new FirefoxDriver();
        } else if (browser.equals("Chrome")) {
            //System.setProperty("webdriver.chrome.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\chromedriver.exe");
        	WebDriverManager.firefoxdriver().setup();
        	driver = new ChromeDriver();
        } else {
            //System.setProperty("webdriver.safari.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\safaridriver.exe");
        	WebDriverManager.safaridriver().setup();
        	driver = new SafariDriver();
        }

        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("ABCDEFGH@");
        driver.findElement(By.id("pass")).sendKeys("12345");
        driver.findElement(By.name("login")).click();

    }


}


