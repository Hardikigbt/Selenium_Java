package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class BackAndForwardButtonTest {

    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.findElement(By.linkText("About")).click();
        wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
        System.out.println(driver.getTitle());//About page title

        driver.navigate().back();
        wait.until(ExpectedConditions.titleIs("Google"));
        System.out.println(driver.getTitle());//Google Page title

        driver.navigate().forward();
        wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
        System.out.println(driver.getTitle());//about page title.

    }
}
