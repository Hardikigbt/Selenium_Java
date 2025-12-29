package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class YahooSuggetionTets {

    public static void main(String[] args) throws InterruptedException {

       // System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://ca.yahoo.com/");

        driver.findElement(By.name("p")).sendKeys("canada");
        Thread.sleep(2000);

        List<WebElement> all = driver.findElements(By.xpath("//nav[@aria-label='Top Categories']/ul)[3]/li"));
        System.out.println(all.size());

        for (WebElement a : all) {
            System.out.println(a.getText());
        }
    }

}

