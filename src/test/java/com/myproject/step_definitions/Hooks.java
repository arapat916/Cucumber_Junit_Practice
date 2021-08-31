package com.myproject.step_definitions;

import com.myproject.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hooks {



    @Before  //will triggered before every test scenario
    public void setUp(Scenario scenario){

        System.out.println("::::::::::starting Automation::::::::::");
        System.out.println(scenario.getSourceTagNames());
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Before(value = "@smoke")
    public void smokeTestSetup(){
        System.out.println(":::::smoke test is running !!!!");
    }


    @After(value = "@smoke")
        public void smokeTestTearDown(){
            System.out.println("::::: smoke test is ending:::::");
        }

    @After       //will triggered after every test scenario
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()) {
            byte[] data = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());
        }

        Driver.closeDriver();
        System.out.println(":::::::Eng of test execution:::::::");

    }
}
