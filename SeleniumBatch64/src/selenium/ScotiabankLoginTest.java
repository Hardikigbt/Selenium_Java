package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScotiabankLoginTest {


    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=dguNnif3e-Q&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiZGd1Tm5pZjNlLVEiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY1NTY0NzYzOSwiaWF0IjoxNjU1NjQ2NDM5LCJqdGkiOiJmMmZiM2FmMi1lNTRiLTRjMDItYmFkMi1jMWQ0YjQ2ZTZkZmQiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.XSGFukJSvzK8Bh0XbQsGw5hoHCv2Wynhty8yGspDdXw63SdYLqIy4os57nyaGDIzc3TgPeiwXfBovPk06O6CK3PCcDbuG2OlYEN-zZgj36Ba608ygs3uGd_a_UhzXjC7gWwU4hpxdzWHajTfdNppd6BhP-r-2su9BreAHEz9o2cChmVJIorCWbWmImBrwW4Ot-17wROx5_VNfpRp8edP6DCj8Itk58aluEKUiCFdBbE0X6yAm2r9_kPEojnO5GMiRSivrQzM_QYnKNXWPw_V8MaB3OIf78S7jUYIVrEeyZSbFEN9skqKxzUdh7V7kbrk96mdhLDif-xzlGiFzqC8NA&preferred_environment=");

        //enter email with special character - ABCDEFGH@
        //enter any wrong password
        //click on SignIn button

        driver.findElement(By.id("usernameInput-input")).sendKeys("ABCDEFGH@");
        driver.findElement(By.name("password")).sendKeys("1234567890");
        driver.findElement(By.id("signIn")).click();
    }

}
