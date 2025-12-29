package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class RadioButtonTest {

    public static void main(String[] args) throws InterruptedException {
        //print size 3 and text for echo echo radio web site


       // System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://echoecho.com/htmlforms10.htm");

        Thread.sleep(3000);

        List<WebElement> radioButtons = driver.findElements(By.name("group1"));
        System.out.println(radioButtons.size());

        for (int i = 0; i < radioButtons.size(); i++) {
            System.out.println(radioButtons.get(i).getAttribute("value") + "----------" + radioButtons.get(i).isSelected());
        }

        //driver.findElements(By.xpath("//input[@value='Cheese']")).click();
        radioButtons.get(2).click();
        System.out.println("---------------------------------------------");

        for (int i = 0; i < radioButtons.size(); i++) {
            System.out.println(radioButtons.get(i).getAttribute("value") + "----------" + radioButtons.get(i).isSelected());
        }
    }
}
