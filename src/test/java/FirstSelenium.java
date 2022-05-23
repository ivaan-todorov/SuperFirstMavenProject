import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FirstSelenium {



    @Test
    public void testFirstSeleniumWiki1() {

        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://en.wikipedia.org/wiki/English_Wikipedia");

        WebElement searchBox = driver.findElement(By.name("search"));
        WebElement searchButton = driver.findElement(By.name("go"));

        searchBox.sendKeys("Java");

        searchButton.click();

        String searchTitle = driver.getTitle();

        Assert.assertEquals(searchTitle, "Java - Wikipedia");

        driver.quit();
    }

    @Test
    public void testFirstSeleniumWiki2() {

        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://en.wikipedia.org/wiki/English_Wikipedia");

        WebElement searchBox = driver.findElement(By.id("n-mainpage-description"));

        searchBox.click();

        String rightURL = driver.getCurrentUrl();

        Assert.assertEquals(rightURL, "https://en.wikipedia.org/wiki/Main_Page");

        driver.quit();
    }

}
