package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecuterClassTest {

    public static void main(String[] args) throws InterruptedException {

       // System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.adidas.ca/en/");

        Thread.sleep(10000);
        WebElement careers = driver.findElement(By.linkText("Careers"));
//			driver.findElement(By.linkText("careers")).click();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
//			Option 1 using x and y cordination
        System.out.println(careers.getLocation());
        jse.executeScript("window.scrollBy(0,5000)");
        careers.click();

        //option 2 - Scroll until the element is in the view
        jse.executeScript("arguments[0].scrollIntoView(true);", careers);
        careers.click();
//	option 3 Direct click
        jse.executeScript("arguments[0].scrollIntoView(true);", careers);
    }

}
