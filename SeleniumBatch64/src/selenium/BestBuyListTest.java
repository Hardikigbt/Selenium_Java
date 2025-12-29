package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class BestBuyListTest {

    public static void main(String[] args) throws InterruptedException {
//		print size and text
        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.bestbuy.ca/en-ca/");

        WebElement signIn = driver.findElement(By.xpath("//li[@data-automation='shop']"));
        signIn.click();

        Thread.sleep(4000);
        List<WebElement> all = driver.findElements(By.xpath("//div[@class='menu_3LP5u menuActive_3neTn']"));
        System.out.println(all.size());

        for (WebElement a : all) {
            System.out.println(a.getText());
        }
    }
}
