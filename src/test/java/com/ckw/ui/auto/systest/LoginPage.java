package com.ckw.ui.auto.systest;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import java.util.concurrent.TimeUnit;
//import static java.lang.Thread.sleep;

public class LoginPage extends BaseUiPage {

    private WebDriver webDriver;
    private static final String BUTTON_NAME_LOGIN="//button[@type='submit']";
    @FindBy(name="username")
    WebElement userName;

    @FindBy(name="password")
    WebElement passWord;

    @FindBy(xpath=BUTTON_NAME_LOGIN)
    WebElement btnLogin;

    public void setUsername(String uname){
        userName.clear();
        userName.sendKeys(uname);
    }

    public void setPassword(String pwd){
        passWord.clear();
        passWord.sendKeys(pwd);
    }

    public void clickLogin(){
        btnLogin.click();
        waitForElementLocatedByXpath(this.webDriver, "//a[@href='#/logout']");
    }

    public void clickFailLogin(){
        btnLogin.click();
        waitForElementLocatedByXpath(this.webDriver, "//div[@class='tile column center white']");
    }

    public LoginPage(WebDriver webDriver){
        this.webDriver=webDriver;
        PageFactory.initElements(this.webDriver,this);
    }
}
