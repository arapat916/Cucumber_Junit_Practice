package com.myproject.pages;

import com.myproject.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
    @FindBy(id="prependedInput")
    private WebElement username;

    @FindBy(id = "prependedInput2")
    private WebElement password;



}
