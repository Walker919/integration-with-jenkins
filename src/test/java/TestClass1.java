import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestClass1 {

    public static WebDriver driver;

    @BeforeMethod
    public void launchDriver() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void Test1() {
        driver.navigate().to("https://www.google.com/");
        System.out.println("Title: " + driver.getTitle());
    }

    @Test
    public void Test2() {
        driver.navigate().to("https://www.google.com/");
        System.out.println("Title: " + driver.getTitle());
    }

    @Test
    public void Test3() {
        driver.navigate().to("https://www.google.com/");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
