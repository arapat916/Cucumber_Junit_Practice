package com.myproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id="prependedInput")
    private WebElement username;

    @FindBy(id = "prependedInput2")
    private WebElement password;

}
