package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Home_Page;
import pages.ValidateBahrainPackage_Page;

import static stepDefinations.Hooks.driver;

public class ValidateBahrainPackageStepDefinitions {
    Home_Page homePage=new Home_Page(driver);
    ValidateBahrainPackage_Page validatePage=new ValidateBahrainPackage_Page();

    @Given("user open page and click on select country Bahrain")
    public void selectCountry(){
        homePage.navigateToSelectCountry();
        homePage.chooseBahrainCountry();
    }

    @Then("Package Type and Price should be displayed for Bahrain")
    public void verifyTypeAndPriceForBahrain(){
        Assert.assertTrue(validatePage.isDisplayBahrainPackage());
        Assert.assertEquals(validatePage.validatePackageType(),"CLASSIC");
        Assert.assertTrue(validatePage.isDisplayPrice());

    }
}
