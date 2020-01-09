package com.ZEROBANK.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty", "html:target/default-cucumber-reports" ,"json:target/cucumber.json"},
        features ="src/test/resources/features",
        glue ="com/ZEROBANK/step_definitions",
        monochrome = true,
        dryRun = false,
        tags = "@payment_with_missing_amount_or_date"


)



public class CukesRunner {
}
