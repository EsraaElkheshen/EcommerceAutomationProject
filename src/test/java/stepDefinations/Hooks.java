package stepDefinations;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.Home_Page;
import utilities.BrowserUtils;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    public static Home_Page homepage;

    @BeforeAll
    public static void open_chrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://subscribe.stctv.com/sa-en");
        driver.manage().window().maximize();
        homepage =new Home_Page(driver);

    }

    @AfterAll
    public static void closeDriver(){
        BrowserUtils.waitFor(3);
        driver.quit();
    }

}
