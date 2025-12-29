package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementTest {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();

        driver.get("http://www.facebook.com/");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("ABCDEFGH");

        WebElement email1 = driver.findElement(By.id("pass"));
        email1.sendKeys("1234567890");

        WebElement loginButton = driver.findElement(By.name("u_0_5_8g"));


    }

}
