package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class GoogleSuggetionListTest {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");

        // type Canada in search box
        Thread.sleep(2000);
        //size-10
        //print text

        driver.findElement(By.name("q")).sendKeys("Canada");
        Thread.sleep(3000);

        List<WebElement> all = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
        System.out.println(all.size());
	
		/*for(int i=0; i<allLinks.size();i++) {
			System.out.println(allLinks.get(i).getText());*/

        //		For printing all selected webelements.
        for (WebElement a : all) {
            System.out.println(a.getText());

        }
    }
}

