package selenium;

import data.Xls_Reader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.time.Duration;


public class MultipleBrowserTest1 {

    public static void main(String[] args) throws IOException, InterruptedException {


        /* Usnig Excel - Run MBTest1
         * String browser = "Chrome";
         * FileInputStream f = new
         * FileInputStream("Excel Path"); Properties
         * prop = new Properties(); prop.load(f);*/

        Xls_Reader d = new Xls_Reader("E:\\QA Work Space\\SeleniumJar\\TestData.xlsx");

        String browser = d.getCellData("Sheet1", 0, 1);
        System.out.println(browser);
        String url = d.getCellData("Sheet1", 2, 1);
        WebDriver driver = null;

        if (browser.equals("Firefox")) {
            System.setProperty(d.getCellData("Sheet1", 2, 2), d.getCellData("Sheet1", 3, 2));
            driver = new FirefoxDriver();
        } else if (browser.equals("Chrome")) {
            System.setProperty(d.getCellData("Sheet1", 2, 1), d.getCellData("Sheet1", 3, 1));
            driver = new ChromeDriver();
        } else if (browser.equals("Edge")) {
            System.setProperty(d.getCellData("Sheet1", 2, 3), d.getCellData("Sheet1", 3, 3));
        }

        driver.get("https://www.facebook.com");

        driver.findElement(By.name("email")).sendKeys(d.getCellData("Sheet1", 1, 1));
        driver.findElement(By.name("pass")).sendKeys("12345");
        driver.findElement(By.tagName("button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.close();

    }

}
