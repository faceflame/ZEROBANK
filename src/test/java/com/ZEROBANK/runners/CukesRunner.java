package com.ZEROBANK.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty", "json:target/cucumber.json",
                "html:target/default-cucumber-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/ZEROBANK/step_definitions",
        monochrome = true,
        dryRun = false,
        tags= "@smoke"


)


public class CukesRunner {
}
