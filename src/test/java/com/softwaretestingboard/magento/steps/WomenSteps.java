package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WomenSteps
{
    @Given("^I am on Home page$")
    public void iAmOnHomePage()
    {

    }

    @When("^I hovering mouse on women Menu$")
    public void iHoveringMouseOnWomenMenu()
    {
        new HomePage().mouseHoverWomenMenu();
    }

    @And("^I hovering mouse on Tops$")
    public void iHoveringMouseOnTops()
    {
        new HomePage().mouseHoverOnTop();
    }


    @And("^I click on jackets option$")
    public void iClickOnJacketsOption()
    {
        new WomenPage().clickOnJacket();
    }

//    @Then("^Verify the products name display in alphabetical order after sorting product name$")
//    public void verifyTheProductsNameDisplayInAlphabeticalOrderAfterSortingProductName()
//    {
//        new WomenPage().sortByProduct();
//    }

    @Then("^Verify the products name display in alphabetical order after sorting product name$")
    public void verify_the_products_name_display_in_alphabetical_order_after_sorting_product_name()
    {
        new WomenPage().sortByProduct();
    }

    @Then("^Verify the Price filter low to high after sorting price filter$")
    public void verifyThePriceFilterLowToHighAfterSortingPriceFilter()
    {
        new WomenPage().sortByPriceFilter();
    }
}
