package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AttributeTest {

    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();

    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.ebay.ca/");

        String s = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
        System.out.println(s);

        String p = driver.findElement(By.id("gh-ac")).getAttribute("Iphone");
        System.out.println(p);

    }

}
