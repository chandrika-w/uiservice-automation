package com.ckw.ui.auto.systest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends BaseUiPage {

    WebDriver webDriver;

    @FindBy(xpath="//div[@class='tile column center white']")
    WebElement signOutLink;

    @FindBy(xpath="//a[@href='#/login']")
    WebElement signInLink;

    public boolean showSignInAgain(){
        return signOutLink.isDisplayed();
    }

    public LoginPage clickSignIn(){
        signInLink.click();
        waitForElementLocatedByXpath(this.webDriver,"//button[@type='submit']");
        return new LoginPage(webDriver);
    }

    public LogoutPage(WebDriver driver){
        this.webDriver=driver;
        PageFactory.initElements(this.webDriver,this);
    }
}
