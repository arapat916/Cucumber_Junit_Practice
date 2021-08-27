package com.myproject.step_definitions;

import com.myproject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class loginStepDefinitions {

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {

        Driver.getDriver().get(("http://qa1.vytrack.com"));
    }
    @When("user logs in")
    public void user_logs_in() throws InterruptedException {

        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys("salesmanager110");
        Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys("Useruser123"+ Keys.ENTER);
        Thread.sleep(3000);
    }
    @Then("user should see dashboard page")
    public void user_should_see_dashboard_page() {

        System.out.println("user sees dashboard page");
        Driver.closeDriver();
    }

    @When("user logs in with {string} username and {string} password")
    public void user_logs_in_with_username_and_password(String string, String string2) {

    }
    @Then("user verifies that {string} message is displayed.")
    public void user_verifies_that_message_is_displayed(String string) {

    }




}
