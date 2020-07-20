package com.bitrix24Task.pages;

import com.bitrix24Task.utilities.ConfigurationReader;
import com.bitrix24Task.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.security.auth.login.Configuration;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    // LOGIN WebElements

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    //

    public void login() {

        wait.until(ExpectedConditions.visibilityOf(userNameBox)).sendKeys(ConfigurationReader.getProperty("username1"));
        wait.until(ExpectedConditions.visibilityOf(passwordBox)).sendKeys(ConfigurationReader.getProperty("password2"));
        loginButton.click();

    }




}
