package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class FacebookSignUpTest {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// this is maximum time that Selenium will wait.

        //click on create new account

        driver.findElement(By.linkText("Create new account")).click();

        //enter lastName
        //enter 10 digit mobile number
        //enter pass
        //click on signUp button

        driver.findElement(By.name("firstname")).sendKeys("Hardik");
        driver.findElement(By.name("lastname")).sendKeys("Patel");
        driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
        driver.findElement(By.name("reg_passwd__")).sendKeys("12345");

        // to Print in drop down menu
        //selct auguest
        //select 20
        //select2000
        //click

        WebElement month = driver.findElement(By.id("month"));
        Select m = new Select(month);
        m.selectByValue("8");
        System.out.println(m.toString());

        WebElement date = driver.findElement(By.id("day"));
        Select d = new Select(date);
        d.selectByValue("20");
        System.out.println(m.toString());

        WebElement year = driver.findElement(By.id("year"));
        Select y = new Select(year);
        y.selectByValue("2000");
        System.out.println(m.toString());

        WebElement Gender = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
        Gender.click();

        driver.findElement(By.name("websubmit")).click();

        driver.close();

    }
}
