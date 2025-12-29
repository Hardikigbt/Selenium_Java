package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class PopUPTest {

    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.aliexpress.com/");
        Thread.sleep(3000);

//		if you get popup --- close popUp-----type computer in search box
//		Type Computer in Box

        List<WebElement> popup = driver.findElements(By.className("btn-close"));
        System.out.println(popup.size());

        if (popup.size() > 0) {
            driver.findElement(By.id("search-key")).sendKeys("computer");
        }


    }

}
