package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverTest {

    public static void main(String[] args) {

        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
        //ClassName objName = new ClassName();
        //FirefoxDriver driver = new FirefoxDriver();
        //ParentClassName(Interface) objName = new Classname();
    	WebDriverManager.firefoxdriver().setup();
    	WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("Hardikigbt");
        driver.findElement(By.id("pass")).sendKeys("123456789");
        driver.findElement(By.name("Log in"));


    }
}
