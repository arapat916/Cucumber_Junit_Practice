package com.myproject.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"rerun:target/rerun.txt",
                "json:target/cucumber.json"
        },
        features = "src\\test\\resources\\features",
        glue = "com\\myproject\\step_definitions",
        dryRun = false,
        tags = "@s_o",
        publish = true

)

public class CucumberRunner {

}
