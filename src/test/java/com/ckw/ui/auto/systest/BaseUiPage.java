package com.ckw.ui.auto.systest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseUiPage {

    private static final long MAX_WAIT_TIME=30;

    public WebElement waitForElementLocatedByName(WebDriver driver,String name){
        WebDriverWait driverWait=new WebDriverWait(driver,MAX_WAIT_TIME);
        return driverWait.until(ExpectedConditions.presenceOfElementLocated(By.name(name)));
    }

    public WebElement waitForElementLocatedByXpath(WebDriver driver,String xpath){
        WebDriverWait driverWait=new WebDriverWait(driver,MAX_WAIT_TIME);
        return driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }
}
