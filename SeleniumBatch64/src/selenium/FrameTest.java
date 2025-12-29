package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class FrameTest {

    public static void main(String[] args) {

        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/droppable/");

        //To Inspect Element on web site

        List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
        System.out.println(sortable.size());

        if (sortable.size() > 0) {
            System.out.println("sortable Present");
        } else {
            System.out.println("sortable not present");

            List<WebElement> draggable = driver.findElements(By.id("draggable"));
            System.out.println(draggable.size());

            if (draggable.size() > 0) {
                System.out.println("draggable Present");
            } else {
                System.out.println("draggable not present");
            }


            System.out.println("-----------------------After switiching to the frame-----------------------");
            //driver.switchTo().frame(0); //By index
            //driver.switchTo().frame("demo-frame"); //Only for Name and id, in this case we can not use this option
            driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); //By WebElement

            sortable = driver.findElements(By.linkText("Sortable"));
            System.out.println(sortable.size());

            if (sortable.size() > 0) {
                System.out.println("sortable Present");
            } else {
                System.out.println("sortable not present");
            }

            draggable = driver.findElements(By.id("draggable"));
            System.out.println(draggable.size());

            if (draggable.size() > 0) {
                System.out.println("draggable Present");
            } else {
                System.out.println("draggable not present");
            }

            System.out.println("-----------------------------------Switching back to main page---------------------------");
            driver.switchTo().defaultContent();

            sortable = driver.findElements(By.linkText("Sortable"));
            System.out.println(sortable.size());

            if (sortable.size() > 0) {
                System.out.println("sortable Present");
            } else {
                System.out.println("sortable not present");
            }

            draggable = driver.findElements(By.id("draggable"));
            System.out.println(draggable.size());

            if (draggable.size() > 0) {
                System.out.println("draggable Present");
            } else {
                System.out.println("draggable not present");
            }
        }
    }
}
	
	
	
	
	

