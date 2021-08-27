package com.myproject.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src\\test\\resources\\features\\login.feature",
        glue = "com\\myproject\\step_definitions",
        dryRun = false


)

public class CucumberRunner {

}
