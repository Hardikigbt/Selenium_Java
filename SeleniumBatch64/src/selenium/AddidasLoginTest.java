package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddidasLoginTest {

    public static void main(String[] args) throws InterruptedException {

       // System.setProperty("webdriver.gecko.driver", "E:\\QA Work Space\\SeleniumJar\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.adidas.ca/en/account-login");

        //enter wrong email
//		enter wrong password
//		click signon

        driver.findElement(By.id("login-email")).sendKeys("ABCDEFGH");
        driver.findElement(By.id("login-password")).sendKeys("1234567890");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(6000);

        String exptecErr = "Your request timed out � please retry";
        String actualErr = driver.findElement(By.xpath("//div[@data-auto-id='login-from-login]")).getText();
        System.out.println(actualErr);

        if (exptecErr.equals(actualErr)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");

        }

    }
}
