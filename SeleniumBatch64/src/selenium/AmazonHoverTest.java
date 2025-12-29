package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class AmazonHoverTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.ca/");


        List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
        System.out.println(allLinks.size());

        for (int i = 0; i < allLinks.size(); i++) {
            System.out.println(allLinks.get(i).getText());


        }
    }

}
