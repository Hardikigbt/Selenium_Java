package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverTest {

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\chromedriver.exe");
    	WebDriverManager.chromedriver().setup();

    	ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.ca/");

        driver.findElement(By.id("email")).sendKeys("Hardikigbt");
        driver.findElement(By.id("pass")).sendKeys("123456789");
        driver.findElement(By.name("Sign in"));
        driver.quit();

    }

}
