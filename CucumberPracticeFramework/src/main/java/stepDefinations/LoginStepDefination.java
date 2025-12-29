package stepDefinations;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;

public class LoginStepDefination {

	WebDriver driver;
	public static FileInputStream f ;
	public static Properties prop = new Properties();
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws IOException{
	    // Write code here that turns the phrase above into concrete actions
		
		f= new FileInputStream("D:\\QA automation\\eclipse\\selenium_workspace\\BasicFrameWork\\src\\utilities\\prop.properties");
		prop.load(f);
		System.setProperty("webdriver.gecko.driver", "D:\\QA automation\\eclipse\\Seleniumjar\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@When("^title of login page is \"([^\"]*)\"$")
	public void title_of_login_page_is(String arg1){
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Sign in | Scotiabank", title);
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("usernameInput-input")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
	    // Write code here that turns the phrase above into concrete actions;
		driver.findElement(By.id("signIn")).click();
	}
	
	@Then("^user get global error$")
	public void user_get_global_error(){
		WebElement gE = driver.findElement(By.id("globalError"));
		System.out.println(gE.getText());
	}
	
	@Then("^user quit$")
	public void user_quit(){
		driver.quit();
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
