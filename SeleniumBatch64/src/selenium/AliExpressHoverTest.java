package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class AliExpressHoverTest {

    public static void main(String[] args) throws InterruptedException {
        //womens fashon size and text 11

       // System.setProperty("webdriver.gecko.driver", "E:\\Nikulbhai Classes\\SeleniumJars\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();

    	FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.aliexpress.com/?src=google&albch=fbrnd&acnt=347-178-5672&isdl=y&aff_short_key=UneMJZVf&albcp=57826500&albag=1875807660&slnk=&trgt=aud-826855890664:kwd-330328770604&plac=&crea=399557126814&netw=g&device=c&mtctp=b&memo1=&albbt=Google_7_fbrnd&aff_platform=google&albagn=888888&isSmbActive=false&isSmbAutoCall=false&needSmbHouyi=false&gclid=EAIaIQobChMIo4qe8KHs-AIVxdrICh3RQg6REAAYASAAEgJPffD_BwE");

        List<WebElement> popup = driver.findElements(By.className("btn-close"));
        System.out.println(popup.size());

        if (popup.size() > 0) {
            driver.findElement(By.className("btn-close")).click();
        }

        WebElement womensFashion = driver.findElement(By.linkText("Women's Fashion"));
        Actions builder = new Actions(driver);
        builder.moveToElement(womensFashion).build().perform();

        Thread.sleep(3000);
        List<WebElement> all = driver.findElements(By.xpath("//div[@class='sub-cate-row'])[1]/dl[1]//a"));
        System.out.println(all.size());

        for (WebElement a : all) {
            System.out.println(a.getText());

        }

    }
}
