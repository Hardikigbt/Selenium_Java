package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyTest {

    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=132QZa6ADlg&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiMTMyUVphNkFEbGciLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY1Njk0OTMwMSwiaWF0IjoxNjU2OTQ4MTAxLCJqdGkiOiI3ODQ4ODc4Yy1mNzQ3LTRiMmUtYWU5MS03ODliMTY3OWM1YzUiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.iWB__KNMRYAoqCwMkgIMUueYs_Y6Ye0tWvfH22KkuXGxdwMW1qE96sbJqUOtqHR9xDdB84E1Sff_dfnQa8lG9d6XlYIqtRXgMbM3j-rIxSKFZrRaLMBBGj3bLAh8Wmrtrw1wKBTdYHCoYhsbVQk68PplT8eFlyHDrapt60qRo6dHJOIdgwYWV4cMyEwL21hwef9s-TH2xXT63VRIQVrD9uRv-Y08VrvhdxUXV81UE0aKbEbqCZmc1wWNkCL-09hsvgH8L_20iXCM4sE96LD6ZOys7TC3b1NU70BuWCdDL3g-txyOpsfQOyICAzHaEQi14HVJXawGil6vbfwqIuzvYw&preferred_environment=");

        driver.findElement(By.id("")).sendKeys("ABCD");
        driver.findElement(By.name("password")).sendKeys("123245");
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        String expectedErr = "Please enter a ussername or card number without special characters.";

    }

}
