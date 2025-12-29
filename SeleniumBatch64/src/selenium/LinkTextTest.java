package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class LinkTextTest {

    public static void main(String[] args) throws InterruptedException {

       // System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");

//		driver.findElement(By.linkText("About")).click();
        driver.findElement(By.partialLinkText("Abo")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.titleIs(""));

        driver.findElement(By.linkText("About")).click();

        String expectedTitle = "Google - About Google, Our Culture & Company News";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        String expectedurl = "https://about.google/";
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);


        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");

        }
    }

}


