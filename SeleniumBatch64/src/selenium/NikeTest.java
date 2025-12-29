package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class NikeTest {

    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.nike.com/ca/");

//		hover in men get size and text in 2nd colum;

        WebElement men = driver.findElement(By.linkText("Men"));
        Actions builder = new Actions(driver);
        builder.moveToElement(men).build().perform();

        Thread.sleep(2000);

        List<WebElement> all = driver.findElements(By.xpath(""));
        System.out.println(all.size());

        for (WebElement a : all) {
            System.out.println(a.getText());

        }
    }
}
