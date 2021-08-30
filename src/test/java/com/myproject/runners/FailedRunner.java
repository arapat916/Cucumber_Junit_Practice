package com.myproject.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                glue = "com\\myproject\\step_definitions",
                features = "@target\\rerun.txt",
                publish = true

)
public class FailedRunner {
}
