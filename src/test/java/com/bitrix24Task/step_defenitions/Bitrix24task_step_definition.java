package com.bitrix24Task.step_defenitions;

import com.bitrix24Task.pages.Bitrix24TaskPages;
import com.bitrix24Task.pages.LoginPage;
import com.bitrix24Task.utilities.ConfigurationReader;
import com.bitrix24Task.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bitrix24task_step_definition {

    LoginPage loginPage=new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Bitrix24TaskPages bitrix24TaskPages=new Bitrix24TaskPages();

    @Given("user login")
    public void userLogin() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        loginPage.login();
        String actualTitle="Portal";
        Assert.assertEquals(Driver.getDriver().getTitle(), actualTitle);
    }



    @When("User clicks on <Task> button")
    public void user_clicks_on_task_button() {
        wait.until(ExpectedConditions.visibilityOf(bitrix24TaskPages.taskButton)).click();
    }
    @When("User clicks <High Priority> dropdown box")
    public void user_clicks_high_priority_dropdown_box() {
    wait.until(ExpectedConditions.visibilityOf(bitrix24TaskPages.priorityBox)).click();

    }
    @When("User see fire icon colored")
    public void user_see_fire_icon_colored() {

        //the fire icon should be verified

    }


    @Then("User clicks on the letter <A> in the bottom of the message box")
    public void userClicksOnTheLetterAInTheBottomOfTheMessageBox() {
    wait.until(ExpectedConditions.visibilityOf(bitrix24TaskPages.visualEditor)).click();

    }

    @Then("The editor text-bar on the top of the message box is displayed")
    public void theEditorTextBarOnTheTopOfTheMessageBoxIsDisplayed() {
    Assert.assertTrue("Element does not displayed",bitrix24TaskPages.postVisualEditor.isDisplayed());

    }


}
