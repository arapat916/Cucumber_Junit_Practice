package com.myproject.step_definitions;

import com.myproject.pages.GooglePage;
import com.myproject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;

public class searchStepDefinitions {

    GooglePage googlePage = new GooglePage();

    @Given("user is on the google page")
    public void user_is_on_the_google_page() {

        Driver.getDriver().get("http://www.google.com");

    }
    @When("User input {string} in google search box")
    public void user_input_in_google_search_box(String string) {

        googlePage.search(string);

    }
    @Then("User should see {string} on page")
    public void user_should_see_on_page(String ExpectedTitle) {

        String ActualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(ActualTitle.contains(ExpectedTitle));


    }


}
