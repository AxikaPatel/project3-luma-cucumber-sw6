package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility
{
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage()
    {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[text()='Shopping Cart']")
    WebElement verifyShopping;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement verifyCronusYogaPant;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement verifyProductSize32;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement verifyProductColourBlack;

//
//    @CacheLookup
//    @FindBy(xpath = "//input[@title='Qty']")
//    WebElement verifyQty3;
//
//    @CacheLookup
//    @FindBy(xpath = "//td[@class='col subtotal']//span[@class='price']")
//    WebElement productPrice$135;
//
//    @CacheLookup
//    @FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/div[1]/label[1]")
//    WebElement changeQty5to3;
//
//    @CacheLookup
//    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
//    WebElement updateShoppingCart;
//
//    @CacheLookup
//    @FindBy(xpath = "//span[contains(text(),'$225.00')]")
//    WebElement productPrice$225;
//
//
//
    // Verify the text ‘Shopping Cart.'
    public void verifyShoppingCart()
    {
        Reporter.log("Verify the text ‘Shopping Cart.'" + verifyShopping.toString()+ "<br>");
        String expectedMessage = "Shopping Cart";
        String actualMessage = getTextFromElement(verifyShopping);
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("Verify the text ‘Shopping Cart.'" + verifyShopping.toString()+ "<br>");
    }

    // Verify the product name ‘Cronus Yoga Pant’
    public void verifyProductNameCronusYogaPant()
    {
        Reporter.log("Verify the product name ‘Cronus Yoga Pant’" + verifyCronusYogaPant.toString()+ "<br>");
        String expectedMessage = "Cronus Yoga Pant";
        String actualMessage = getTextFromElement(verifyCronusYogaPant);
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("Verify the product name ‘Cronus Yoga Pant’" + verifyCronusYogaPant.toString()+ "<br>");
    }

    // Verify the product size ‘32’
    public void verifyProductSize32()
    {
        Reporter.log("Verify the product size ‘32’" + verifyProductSize32.toString()+ "<br>");
        String expectedMessage = "32";
        String actualMessage = getTextFromElement(verifyProductSize32);
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("Verify the product size ‘32’" + verifyProductSize32.toString()+ "<br>");
    }

    // Verify the product colour ‘Black’
    public void verifyProductColourBlack()
    {
        Reporter.log("Verify the product colour ‘Black’" + verifyProductColourBlack.toString()+ "<br>");
        String expectedMessage = "Black";
        String actualMessage = getTextFromElement(verifyProductColourBlack);
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("Verify the product colour ‘Black’" + verifyProductColourBlack.toString()+ "<br>");
    }
//
//    //Verify the Qty is ‘3’
//    public void verifyQty3()
//    {
//        Reporter.log("Verify the Qty is ‘3’ : " + verifyQty3.toString()+ "<br>");
//        String expectedMessage = "3";
//        String actualMessage = getTextFromElement(verifyQty3);
//        Assert.assertEquals(expectedMessage,actualMessage);
//        log.info("Verify the Qty is ‘3’ : " + verifyQty3.toString()+ "<br>");
//    }
//
//    // Verify the product price ‘$135.00’
//    public void productPrice$135()
//    {
//        Reporter.log("Verify the product price ‘$135.00’: " + productPrice$135.toString()+ "<br>");
//        String expectedMessage = "$135.00";
//        String actualMessage = getTextFromElement(productPrice$135);
//        Assert.assertEquals(expectedMessage,actualMessage);
//        log.info("Verify the product price ‘$135.00’: " + productPrice$135.toString()+ "<br>");
//    }
//
//    //Change Qty to ‘5’
//    @CacheLookup
//    @FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/div[1]/label[1]")
//    WebElement qty;
//    @CacheLookup
//    @FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/div[1]/label[1]")
//    WebElement click;
//    @CacheLookup
//    @FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/div[1]/label[1]")
//    WebElement clean;
//    public void changeQty5()
//    {
//        Reporter.log("Change Qty to ‘5’ :"+ changeQty5to3.toString()+ "<br>");
//        mouseHoverToElement1(qty);
//        clickOnElement(click);
//        clearQty(clean);
//        sendTextToElement(changeQty5to3,"5");
//        log.info("Change Qty to ‘5’ : " + changeQty5to3.toString() + "<br>");
//    }
//
//    //Click on ‘Update Shopping Cart’ button
//    public void updateShoppingCartButton()
//    {
//        Reporter.log("Click on ‘Update Shopping Cart’ button"+ "<br>");
//        clickOnElement(updateShoppingCart);
//        log.info("Click on ‘Update Shopping Cart’ button"+ "<br>");
//    }
//
//    //Verify the product price ‘$225.00’
//    public void productPrice$225()
//    {
//        Reporter.log("Verify the product price ‘$225.00’ : " + productPrice$225.toString()+ "<br>");
//        String expectedMessage = "$225.00";
//        String actualMessage = getTextFromElement(productPrice$225);
//        Assert.assertEquals(expectedMessage,actualMessage);
//        log.info("Verify the product price ‘$225.00’ : " + productPrice$225.toString() + "<br>");
//    }


}
