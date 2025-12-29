package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class MissisuagaTest {

    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.mississauga.ca/");
//	size and text of our organization coloum;
        driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
        Thread.sleep(2000);

        List<WebElement> all = driver.findElements(By.xpath("//ul[@class='main-nav-links']//li[3]//a"));
        System.out.println(all.size());

        for (WebElement a : all) {
            System.out.println(a.getText());
            if (a.getText().equals("Jobs and volunteer")) {
                a.click();
                Thread.sleep(2000);
                System.out.println(driver.getDevTools());
                break;

            }
        }


    }

}
