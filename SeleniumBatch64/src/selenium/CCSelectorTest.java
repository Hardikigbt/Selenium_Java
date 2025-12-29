package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CCSelectorTest {

    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
       
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();//open Firefox
        driver.get("https://www.facebook.com/");//Facebook
//			Using CSS SELECTORS;

        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("ABCDEFGH");

        driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("1234567890");
        driver.findElement(By.name("login")).click();

        Thread.sleep(5000);//wait for 5 sec and open next site google
        driver.get("https://www.google.com/");

        driver.close();

    }
}
