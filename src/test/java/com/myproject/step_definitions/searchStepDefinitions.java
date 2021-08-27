package com.myproject.step_definitions;

import com.myproject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class searchStepDefinitions {

    @Given("User is on the google page")
    public void user_is_on_the_google_page() {

        Driver.getDriver().get("http://www.google.com");

    }
    @Then("User should see title is google")
    public void user_should_see_title_is_google() {
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

    }


}
