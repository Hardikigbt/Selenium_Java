package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class YahooHeaderTest {

    public static void main(String[] args) {
       // System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://ca.yahoo.com/");


        List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='bd']/div[1]//a"));
        System.out.println(allLinks.size());

        for (int i = 0; i < allLinks.size(); i++) {
            System.out.println(allLinks.get(i).getText());
        }
    }
}
