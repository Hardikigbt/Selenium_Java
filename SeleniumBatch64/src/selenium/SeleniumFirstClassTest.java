package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFirstClassTest {

    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");

        //ClassName objName = new ClassName();
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();//open Firefox

        driver.get("https://www.facebook.com/");//Facebook

        driver.findElement(By.id("email")).sendKeys("abcdefgh");//Find email box and enter wrong email

        driver.findElement(By.id("pass")).sendKeys("1234567890");//Find password box and enter wrong password
        driver.findElement(By.name("login")).click();
        //click on login button

    }

}

