package pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import constants.Constants;
import utils.ElementActions;

public class TutorialsPointFormPage extends BasePage {
	private WebDriver driver;
	ElementActions elementActions;
	
	By acceptButton = By.id("banner-accept");
	By firstName = By.xpath("//input[@name='firstname']");
	By lastName = By.xpath("//input[@name='lastname']");
	By gender = By.xpath("//input[@name='sex']");
	By yearsOfExperience = By.xpath("//table[@width='100%']/tbody/tr[4]//span");
	By date = By.xpath("//form[@target='_blank']//tr[5]/td[2]/input[1]");
	By profession = By.xpath("//table[@width='100%']/tbody/tr[6]/td[2]//input");
	By falvoursOfSelenium = By.xpath("//input[@name='tool']");
	By continents = By.xpath("//select[@name='continents']");
	By seleniumCommands = By.xpath("//select[@name='selenium_commands']//option");
	By submitButton = By.xpath("//button[@name='submit']");

	public TutorialsPointFormPage(WebDriver driver) {
		this.driver = driver;
		elementActions = new ElementActions(this.driver);
	}

	public void clickOnCookieAccept() {
		elementActions.waitForElementToBeClickable(acceptButton, 10);
		elementActions.doClick(acceptButton);
	}

	public String getPageTitle() {
		return elementActions.doGetPageTitleWithIsTitle(10, Constants.PAGE_TITLE);
	}

	public void addFirstName(String fName) {
		elementActions.doSendKeys(firstName, fName);
	}

	public void addlastName(String lName) {
		elementActions.doSendKeys(lastName, lName);
	}

	public void clickOnGender(String attribute, String genderToSelect) {
		elementActions.clickFromMultiplecheckBox(gender, attribute, genderToSelect);
	}

	public void clickOnExperience(String years) {
		String YearsSplit = elementActions.splitElementValue(years, "years", ".0", 0);
		System.out.println("in pages" + YearsSplit);
		elementActions.clickFromMultipleOptions(yearsOfExperience, YearsSplit);
	}

	public void enterDate() {
		elementActions.doSendKeys(date, currentDate());
	}

	public void selectProfession(String attribute, String professionToSelect) {
		elementActions.clickFromMultiplecheckBox(profession, attribute, professionToSelect);
	}

	public void selectFlavoursOfSelenium(String attribute, String falvoursOfSeleniumToSelect) {
		elementActions.clickFromMultiplecheckBox(falvoursOfSelenium, attribute, falvoursOfSeleniumToSelect);
	}

	public void selectContinents(String continentsToSelect) {
		elementActions.selectValuesFromDropDown(continents, continentsToSelect);
	}

	public void selectSeleniumCommands(String seleniumCommandsToSelect) {
		elementActions.selectValuesFromDropDown(seleniumCommands, seleniumCommandsToSelect);
	}

	public void clickOnSubmit() {
		elementActions.doClick(submitButton);
	}

	public void clickOnAlert() {
		elementActions.acceptAlert();
	}

	public String currentDate() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		System.out.println(date1);
		return date1;
	}
}
