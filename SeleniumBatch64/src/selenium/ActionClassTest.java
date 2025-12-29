package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassTest {

    public static void main(String[] args) throws InterruptedException {
       //System.setProperty("webdriver.gecko.driver", "E:\\QA Work Space\\SeleniumJar\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.ebay.ca");

        WebElement electronics = driver.findElement(By.linkText("Electronics"));
        Actions builder = new Actions(driver);
        builder.moveToElement(electronics).build().perform();

        Thread.sleep(2000);
    	
    	      /*  WebDriverManager.firefoxdriver().setup();
    	        FirefoxDriver driver = new FirefoxDriver();

    	        driver.get("https://www.ebay.ca");

    	        WebElement electronics = driver.findElement(By.linkText("Electronics"));
    	        Actions builder = new Actions(driver);
    	        builder.moveToElement(electronics).perform();

    	        Thread.sleep(2000);*/
    	    }
    	}
