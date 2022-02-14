package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},          //creating file when test is failed
        features = "src/test/resources/features",   //reading feature folder
        glue = "com/vytrack/step_definitions",      //reading step_definitions folder
        dryRun = false,
        tags = "@furkan"
)
public class CukesRunner {
}
