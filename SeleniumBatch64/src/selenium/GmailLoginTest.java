package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLoginTest {

    public static void main(String[] args) throws InterruptedException {

       // System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fhl%3Den&ss=1&scc=1&ltmpl=default&ltmplcache=2&hl=en&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        driver.findElement(By.id("identifierId")).sendKeys("ABCDEFGH");
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        Thread.sleep(3000);

        String expecteErr = "Could'nt find your Google Account";
        String actualErr = driver.findElement(By.className(expecteErr)).getText();
        System.out.println(actualErr);

        if (expecteErr.equals(actualErr)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


    }

}
