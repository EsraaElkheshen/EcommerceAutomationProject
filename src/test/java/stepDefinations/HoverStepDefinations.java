package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HoverCateogary;

public class HoverStepDefinations {
    HoverCateogary hover=new HoverCateogary();
    @Given("open Homepage and hover on Category")
    public void Hofer(){
        hover.selectCategory();

    }

    @Then("user can open sub-Category and get Text")
    public void openSubCatogry(){
        hover.selectSubCategory();
        hover.pressSubCategory();
        Assert.assertTrue(hover.getTextSubCateogary().contains("desktops"));
        Assert.assertTrue(hover.getCurrentUrl().contains("https://demo.nopcommerce.com/desktops"));
    }
}
