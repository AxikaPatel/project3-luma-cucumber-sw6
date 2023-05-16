package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility
{
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }

    //---------------Homepage action takes to WomanPage------------------
    //Mouse Hover on Women Menu
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement mouseHoverWomenMenu;

    // Mouse Hover on Tops
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement mouseHoverTop;

    public void mouseHoverWomenMenu()
    {
        Reporter.log("Mouse Hover on Women Menu"+ "<br>");
        mouseHoverToElement1(mouseHoverWomenMenu);
        log.info("Mouse hoover on women menu : "+ "<br>");

    }

    public void mouseHoverOnTop()
    {
        Reporter.log("Mouse Hover on Tops"+ "<br>");
        mouseHoverToElement1(mouseHoverTop);
        log.info("Mouse Hover on Tops"+ "<br>");

    }

    //----------------Homepage action takes to MenPage----------------


    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement mouseHoverOnMenMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement mouseHoverOnBottom;

    //Mouse Hover on Men Menu
    public void mouseHoverOnMenMenu()
    {
        Reporter.log("Mouse Hover on Men Menu"+ "<br>");
        mouseHoverToElement1(mouseHoverOnMenMenu);
        log.info("Mouse Hover on Men Menu"+ "<br>");

    }

    //Mouse Hover On Bottom
    public void mouseHoverOnBottom()
    {
        Reporter.log("Mouse Hover On Bottom"+ "<br>");
        mouseHoverToElement1(mouseHoverOnBottom);
        log.info("Mouse Hover On Bottom"+ "<br>");

    }

    //--------------Homepage action takes to GearPage---------

    //By mouseHoverGearMenu = By.xpath("//span[normalize-space()='Gear']");
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement mouseHoverGearMenu;

    // Mouse Hover on Gear Menu
    public void mouseHoveOnGearMenu()
    {
        Reporter.log("Mouse Hover on Gear Menu"+ "<br>");
        mouseHoverToElement1(mouseHoverGearMenu);
        log.info("Mouse Hover on Gear Menu"+ "<br>");
    }

}
