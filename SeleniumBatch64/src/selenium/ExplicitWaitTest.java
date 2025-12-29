package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class ExplicitWaitTest {

    public static void main(String[] args) {

        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://echoecho.com/javascript4.htm");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.findElement(By.name("B2")).click();

        wait.until(ExpectedConditions.alertIsPresent());
        Alert al = driver.switchTo().alert();
        System.out.println(al.getText());

        al.accept();


    }

}
