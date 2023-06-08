package pages;

import org.openqa.selenium.By;
import stepDefinations.Hooks;

public class ValidateBahrainPackage_Page {

    By txt_BahrainPackage = By.xpath("//div[text()='12 - Most Popular']");
    By txt_BahrainPackageType = By.cssSelector("#name-classic");
   By txt_BahrainPackagePrice = By.cssSelector("#currency-classic");


    public String validatePackageType(){
       return getText(txt_BahrainPackageType);
    }
    public boolean isDisplayBahrainPackage(){

        return isDisplay(txt_BahrainPackage);
    }
    public boolean isDisplayPrice(){

        return isDisplay(txt_BahrainPackagePrice);
    }


    public String getText(By element) {

        return Hooks.driver.findElement(element).getText();
    }

    public boolean isDisplay(By element){
        return Hooks.driver.findElement(element).isDisplayed() ;
    }

}
