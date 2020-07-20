package com.bitrix24Task.pages;

import com.bitrix24Task.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bitrix24TaskPages {

    public Bitrix24TaskPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div/span[.='Task']")
    public WebElement taskButton;


    @FindBy(xpath = "//input[@id='tasks-task-priority-cb']")
    public WebElement priorityBox;


    @FindBy(xpath = "(//div[@class='feed-add-post-form-but-more-open']/span[1])[3]")
    public WebElement visualEditor;


    @FindBy(xpath = "(//div[@class=\"bxhtmled-toolbar\"])[3]")
    public WebElement postVisualEditor;




}
