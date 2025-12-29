package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAlertTest {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://echoecho.com/javascript4.htm");
//		write code that click on conform button

        driver.findElement(By.name("B2")).click();
        Thread.sleep(2000);

        Alert al = driver.switchTo().alert();
        System.out.println(al.getText());

        al.accept();
//	al.dismiss();

    }


}
