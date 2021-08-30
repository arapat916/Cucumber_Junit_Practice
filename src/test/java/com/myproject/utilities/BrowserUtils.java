package com.myproject.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

    public static void wait (int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickOnElement(WebElement button){
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(button)).click();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }

        public static void clickWithJS(WebElement element){
            Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            ( (JavascriptExecutor)(Driver.getDriver())).executeScript("arguments[0].click()",element);
            Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }

        public static void enterText(WebElement element,String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
        wait.until(ExpectedConditions.attributeToBe(element,"value",text));
            System.out.println("Entering text: "+ text);
        }

}
