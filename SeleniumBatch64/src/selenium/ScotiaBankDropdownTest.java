package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScotiaBankDropdownTest {

    public static void main(String[] args) {
       // System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://www.scotiabank.com/ca/en/personal.html");


//		WebElement BA = driver.findElement(By.id("mega-menu"));
//		Select s = new Select(BA);


        driver.quit();
    }
}
