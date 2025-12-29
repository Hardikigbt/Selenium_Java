package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginTest {

    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();

        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com/");

        //EMAIL
        //1.className - Not working - compound class name not permitted
        //driver.findElement(By.className(inputtext _55r1 _6luy)).sendKeys("ABCDEFGH");

        //2.cssSelector- Need to learn Syntax for CSS
        //driver.findElement(By.cssSelector("")).sendKeys("ABCDEFGH");

        //3.id - id attribute
        //driver.findElement(By.id("email")).sendKeys("ABCDEFGH");

        //4.linkText - only for links
        //driver.findElement(By.linkText(""));

        //5.name - name attribute - Working
        driver.findElement(By.name("email")).sendKeys("ABCDEFGH");

        //6.partiallinkText- only for links
        //driver.findElement(By.partialLinkText(""));

        //7.tagName- not unique
        //driver.findElement(By.tagName("input")).sendKeys("ABCDEFGH");

        //8.need to learn syntax for xpath
        //driver.findElement(By.xpath(""));

        //PASSWORD
        driver.findElement(By.name("pass")).sendKeys("1234567890");

        //LOGIN
        driver.findElement(By.tagName("button")).click();

    }

}
