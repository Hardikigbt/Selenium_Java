package utils;

//import static org.testng.Assert.fail;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BasePage;

public class ElementActions extends BasePage {

	public ElementActions(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (Exception e) {
			System.out.println("element could not be created..." + locator);
		}

		return element;
	}

	public List<WebElement> getElementsSize(By locator) {
		List<WebElement> element = null;
		try {
			element = driver.findElements(locator);
			System.out.println(element.size());
		} catch (Exception e) {
			System.out.println("element could not be created..." + locator);
		}

		return element;
	}

	public List<WebElement> getElementsText(By locator) {
		List<WebElement> element = null;
		try {
			element = driver.findElements(locator);
		} catch (Exception e) {
			System.out.println("element could not be created..." + locator);
		}
		for (WebElement a : element) {
			System.out.println(a.getText());
		}
		return element;

	}

	public List<WebElement> clickFromMultipleOptions(By locator, String value) {
		List<WebElement> element = null;
		try {
			element = driver.findElements(locator);
		} catch (Exception e) {
			System.out.println("element could not be created..." + locator);
		}
		ArrayList<String> al = new ArrayList<String>();
		for (WebElement a : element) {
			al.add(a.getText());
			if (al.contains(value)) {
				a.click();
				break;
			}
		}
		if (al.contains(value)) {
			System.out.println("Clicked on " + value);
		} else {
			System.out.println(value + " Not found");
			Assert.fail();
		}

		return element;

	}

	public List<WebElement> clickFromMultiplecheckBox(By locator, String attribute, String valueName) {
		List<WebElement> element = null;
		try {
			element = driver.findElements(locator);
		} catch (Exception e) {
			System.out.println("element could not be created..." + locator);
		}
		for (int i = 0; i < element.size(); i++) {
			String value = (element.get(i).getAttribute(attribute));
			if (value.equalsIgnoreCase(valueName)) {
				element.get(i).click();
			}
		}

		return element;
	}
	
	public String splitElementValue(String elementName, String key,String splitValue,int splitIndex) {
		String element = elementName;
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put(key,element);
		elementName = hm.get(key).split(splitValue)[splitIndex];
		System.out.println("in ea"+elementName);
		return elementName;
//		elementActions.splitElementValue(yearsOfExperience, "years", ".0", 0);
//		String years = yearsOfExperience;
//		HashMap<String, String> hm = new HashMap<String, String>();
//		hm.put("years",years);
//		yearsOfExperience = hm.get("years").split(".0")[0];
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public void doActionsClick(By locator) {
		Actions ac = new Actions(driver);
		ac.click(getElement(locator)).perform();
	}

	public void doActionsSendKeys(By locator, String value) {
		Actions ac = new Actions(driver);
		ac.sendKeys(getElement(locator), value).perform();
	}

	public void doSelectValuesByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

	public void doSelectValuesByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public void doSelectValuesByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public List<String> getDropDownOptionsValues(By locator) {
		List<String> optionsList = new ArrayList<>();

		Select select = new Select(getElement(locator));

		List<WebElement> dropList = select.getOptions();
		System.out.println(dropList.size());

		for (int i = 0; i < dropList.size(); i++) {
			String text = dropList.get(i).getText();
			optionsList.add(text);
		}
		System.out.println(optionsList);
		return optionsList;
	}

	public void selectValuesFromDropDown(By locator, String value) {
		List<WebElement> dropDownList = driver.findElements(locator);

		for (WebElement element : dropDownList) {
			String text = element.getText();
			if (text.equals(value)) {
				element.click();
				break;
			}
		}
	}

	public String doGetPageTitleWithContains(int timeOut, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}

	public String doGetPageTitleWithIsTitle(int timeOut, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}

	public String doGetPageCurrentUrl(int timeOut, String urlValue) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.urlContains(urlValue));
		return driver.getCurrentUrl();
	}

	public WebElement waitForElementPresent(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public WebElement waitForElementToBeClickable(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public WebElement waitForElementToBeVisible(By locator, int timeOut) {
		WebElement element = getElement(locator);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public List<WebElement> visibilityOfAllElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	public void clickWhenReady(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}

	public Alert waitForAlertPresent(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public void acceptAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public void dismissAlert() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	public boolean isElementDisplayed(By locator, int timeout) {
		WebElement element = null;
		boolean flag = false;
		for (int i = 0; i < timeout; i++) {

			try {
				element = driver.findElement(locator);
				flag = element.isDisplayed();
				break;
			} catch (Exception e) {
				System.out.println("waiting for element to be present on the page -->" + i + "secs");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
				}
			}

		}
		return flag;

	}

	public WebElement waitForElementWithFluentWaitConcept(By locator, int timeOut) {
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public WebElement waitForElementWithFluentWait(final By locator, int timeOut) {
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});

		return element;
	}

}
