package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_Base {
    protected static WebDriver driver;

    public Page_Base(WebDriver driver) {
        this.driver = driver;

    }

    public static void clickButton(By button) {
        driver.findElement(button).click();
    }
}