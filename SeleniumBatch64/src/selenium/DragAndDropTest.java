package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropTest {

    public static void main(String[] args) {
       // System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));


        System.out.println(droppable.getText());
        Actions builder = new Actions(driver);
        builder.dragAndDrop(draggable, droppable).build().perform();
        System.out.println(droppable.getText());


    }

}
