package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class DropDownTest {

    public static void main(String[] args) throws InterruptedException {

       // System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
        WebDriverManager.firefoxdriver().setup();

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.ebay.ca/");

        List<WebElement> allLinks = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
        System.out.println(allLinks.size());

        for (int i = 0; i < allLinks.size(); i++) {
            if (allLinks.get(i).isSelected()) {
                System.out.println(allLinks.get(i).getText() + "-----" + allLinks.get(i).isSelected());
                // it will gives wherether element is selected or not.(bollen written type)//
            }
        }
        WebElement box = driver.findElement(By.id("gh-cat"));
        Select s = new Select(box);

        s.selectByIndex(1);//to select Antiques in drop down menu.
        Thread.sleep(2000);

        s.selectByValue("2984");// to select baby in drop down menu.
        System.out.println("--------------After Selection---------------------");

        for (int i = 0; i < allLinks.size(); i++) {
            System.out.println(allLinks.get(i).getText() + "-----" + allLinks.get(i).isSelected());

            driver.close();
        }
    }
}
