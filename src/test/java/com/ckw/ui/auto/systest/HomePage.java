package com.ckw.ui.auto.systest;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseUiPage {

    private WebDriver webDriver;
    private static final String LOGOUT_LINK="//a[@href='#/logout']";
    @FindBy(xpath=LOGOUT_LINK)
    WebElement logoutLink;
    LogoutPage lo;

    @FindBy(xpath="//a[@href='#/home/dashboard']")
    WebElement dashBoardLink;

    public boolean isDashBoardLinkVisible(){
        return dashBoardLink.isDisplayed();
    }

    public void clickLogout(){
        logoutLink.click();
        waitForElementLocatedByXpath(this.webDriver,"//div[@class='tile column center white']" );
        lo=new LogoutPage(webDriver);
        Assert.assertTrue(lo.showSignInAgain());
    }

    public HomePage(WebDriver driver){
        this.webDriver=driver;
        PageFactory.initElements(this.webDriver,this);
    }
}
