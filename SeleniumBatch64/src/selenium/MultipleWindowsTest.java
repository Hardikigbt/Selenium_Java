package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowsTest {

    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fhl%3Den&ss=1&scc=1&ltmpl=default&ltmplcache=2&hl=en&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        // Click on Help Button
        driver.findElement(By.linkText("Help")).click();

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows.size());

        Iterator<String> itr = allWindows.iterator();
        String mainWindow = itr.next();
        String childWindow = itr.next();
        System.out.println(mainWindow);
        System.out.println(childWindow);

        driver.switchTo().window(childWindow);//Handle for the window
        Thread.sleep(2000);
        System.out.println(driver.getTitle());// Help page title
        driver.close();

        driver.switchTo().window(mainWindow);//
        Thread.sleep(2000);
        System.out.println(driver.getTitle());//Gmail page title
        driver.quit();

//		driver.switchTo().window(null); // to pass Handle for the windows


    }

}
