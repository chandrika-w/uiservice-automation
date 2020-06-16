package com.ckw.ui.auto.steps;

import com.ckw.ui.auto.systest.BaseUiPage;
import com.ckw.ui.auto.systest.HomePage;
import com.ckw.ui.auto.systest.LoginPage;
import com.ckw.ui.auto.systest.LogoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private LogoutPage logoutPage;

    @Given("The user is in WebUi login page")
    public void the_user_is_in_WebUi_login_page() {
        System.setProperty("webdriver.gecko.driver","/home/thushan/Documents/my-office/software/installed/geckodriver-v0.26.0-linux64/geckodriver");
        driver=new FirefoxDriver();
        driver.get("http://localhost:9119");
        driver.manage().window().maximize();
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("the user enters a valid username {string} and valid password {string}")
    public void the_user_enters_a_valid_username_and_valid_password(String username, String pwd) {
        loginPage = new LoginPage(driver);
        loginPage.setUsername(username);
        loginPage.setPassword(pwd);
    }

    @When("the user click on login button")
    public void the_user_click_on_login_button() {
        loginPage.clickLogin();
        homePage = new HomePage(driver);
    }

    @Then("the user must go to the home page")
    public void the_user_must_go_to_the_home_page() {
        Assert.assertTrue(homePage.isDashBoardLinkVisible());
        homePage.clickLogout();
        logoutPage=new LogoutPage(driver);
        loginPage = logoutPage.clickSignIn();
    }

    @When("the user enters an invalid {string} username and {string} password")
    public void the_user_enters_an_invalid_username_and_password(String uname, String pwd) {
        loginPage=new LoginPage(driver);
        loginPage.setUsername(uname);
        loginPage.setPassword(pwd);
    }

    @When("the user click fail login")
    public void the_user_click_fail_login() {
        loginPage.clickFailLogin();
        logoutPage=new LogoutPage(driver);
    }

    @Then("the user must see the expected error page")
    public void the_user_must_see_the_expected_error_page() {
        Assert.assertTrue(logoutPage.showSignInAgain());
        logoutPage.clickSignIn();
    }

    @After
    public void tearDown(){
        if(driver!= null) {
            driver.close();
        }
    }
}
