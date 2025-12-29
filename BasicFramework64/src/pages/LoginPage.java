package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	//WebElement email = driver.findElement(By.id("usernameInput-input"));
	//WebElement password = driver.findElement(By.name("password"));
	
	@FindBy(id = "usernameInput-input")
    public WebElement email;
	
	@FindBy(name = "password")
    public WebElement password;
	
	@FindBy(id = "signIn")
    public WebElement signInButton;
	
	@FindBy(id = "globalError")
    public WebElement globalError;
	
	@FindBy(id = "UsernameTextField__errors-usernameInput")
    public WebElement emailError;
	
	@FindBy(id = "PasswordTextField__errors-password")
    public WebElement passwordError;
	
	public void OpenBrowser() throws IOException {
		FileInputStream f = new FileInputStream("E:\\Nikulbhai Classes\\testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String browser = prop.getProperty("browser");
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver(); 
		}else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}else {
			System.setProperty("webdriver.safari.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\safaridriver.exe");
			driver = new SafariDriver(); 
		}
		
		PageFactory.initElements(driver, this);
	}
	
	public void openLoginPage() {
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=ChaHWmsqzEA&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiQ2hhSFdtc3F6RUEiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY1NTA2NDczNywiaWF0IjoxNjU1MDYzNTM3LCJqdGkiOiIxMDMwYmI4MS02MzliLTRjYzItODc3My1iMTcwZTQxN2U2YzAiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.DbcCP5rJfZHYzbePDKkENJBI6raobfm9YQZJBmiJ7kHhDqddUzHZVakVGDyYq7_2HRY_xOY9DfH88rHGlavimI3_NSW37nbQ9wnh8VTpFClYTM9Fd8OaH5lWFx_nk8jpoEJi0mQXZBuGwdRacQX5TRJNHxtJ1_ISYy6Knq8mytRal0M2214Pkgb7rMou3VGkiO857n6lVXKbHPbMxSbW9RrLeyHftG7kZBiE77evkuzlz4JTQGgXNtkBaNDaSbECBiyMfc2adAikByGvA0JSnz_i0DJ9SuADEoW9wWGgSXrFDhgb3vsWG9RsUhzR1d6vR7ogYRGLfMIHwmIsmkxN_Q&preferred_environment=");		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public void login(String a, String b) throws InterruptedException {
		email.sendKeys(a);
		password.sendKeys(b);
		signInButton.click();	
		Thread.sleep(2000);	
	}
	
	public String readEmailErr() {
		String actualErr = emailError.getText();
		System.out.println(actualErr);
		return actualErr;
	}
	
	public String readPasswordErr() {
		String actualErr = passwordError.getText();
		System.out.println(actualErr);
		return actualErr;
	}
	
	public String readGlobalErr() {
		String actualErr = globalError.getText();
		System.out.println(actualErr);
		return actualErr;
	}
	
	

}
