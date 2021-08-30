package com.myproject.pages;

import com.myproject.utilities.BrowserUtils;
import com.myproject.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BasePage{

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchBox;

    public void search (String keyWord){

        searchBox.sendKeys(keyWord + Keys.ENTER);
    }
}
