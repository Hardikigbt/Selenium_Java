package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;


public class DynamicTableTest {

    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        //		Number of Colums
        //		NumbList<A>of rows
//		Nested for loop

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
        System.out.println(rows.size());

        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
        System.out.println(cols.size());

        for (int i = 2; i <= rows.size(); i++) {

            for (int j = 1; j <= cols.size(); j++) {
                System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr[" + i + "]/td[" + j + "]")).getText());
                System.out.print(" | ");
            }
            System.out.println();
        }

    }

}
