package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class ElementPresentTest {

    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
		
	/*	if(driver.findElement(By.linkText("Abouts")).isDisplayed()) {
			System.out.println("Element Present");
		}else {
			System.out.println("ElList<A>t Not present");
			
		}*/

        List<WebElement> element = driver.findElements(By.linkText("Abouts"));
        System.out.println(element.size());

        if (element.size() > 0) {
            System.out.println("Element Present");
        } else {
            System.out.println("Element not Present");

        }
    }

}
