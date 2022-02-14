package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/failed-html-reports"},
        features = "@target/rerun.txt",              //reading rerun.txt
        glue = "com/vytrack/step_definitions"        //reading step_definitions folder
)
public class FailedTestRunner {
}
