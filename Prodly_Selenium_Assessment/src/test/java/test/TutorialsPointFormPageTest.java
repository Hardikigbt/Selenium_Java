package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BasePage;
import constants.Constants;
import pages.TutorialsPointFormPage;
import utils.ElementActions;
import utils.TimeUtil;


public class TutorialsPointFormPageTest extends BasePage {
	
	WebDriver driver;
	public TutorialsPointFormPage tpfp;
	public ElementActions elementActions;
	
	@BeforeMethod
	@Parameters(value = {"browser"})
	public void setUp(String browserName){
		System.out.println(browserName);
		prop = initialize_Properties();
		TimeUtil.shortWait();
		driver = initialize_driver(browserName, prop);
		tpfp = new TutorialsPointFormPage(driver);
		elementActions = new ElementActions(driver);
		tpfp.clickOnCookieAccept();
	}
	
	@Test(priority = 1)
	public void verifyPageTitle() {
		String title = tpfp.getPageTitle();
		System.out.println("Page title is: " + title);
		Assert.assertEquals(title, Constants.PAGE_TITLE);
	}
	
	@Test(priority = 2,dataProvider = "FormData")
	public void fillForm(String firstName, String lastName, String gender, String yearsOfExperience, String profession, String falvoursOfSelenium, String continent, String seleniumCommands, String placeHolder) {
		tpfp.addFirstName(firstName);
		tpfp.addlastName(lastName);
		tpfp.clickOnGender(placeHolder, gender);
		tpfp.clickOnExperience(yearsOfExperience);
		tpfp.enterDate();
		tpfp.selectProfession(placeHolder,profession);
		tpfp.selectFlavoursOfSelenium(placeHolder, falvoursOfSelenium);
		tpfp.selectContinents(continent);
		tpfp.selectSeleniumCommands(seleniumCommands);
		TimeUtil.mediumWait();
		tpfp.clickOnSubmit();
		tpfp.clickOnAlert();
	}
	
	@DataProvider(name = "FormData")
	public String[][] formData(){
		int totalRows = d.getRowCount("sheet1");
		int totalCols = d.getColumnCount("sheet1");
		
		String data[][] = new String[totalRows][totalCols];

		for(int i=1;i<=totalRows;i++){		
			for(int j=0;j<totalCols;j++){
				data[i-1][j]= d.getCellData("sheet1",j, i);
			}
		}
		return data;
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
