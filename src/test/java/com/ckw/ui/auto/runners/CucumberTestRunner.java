package com.ckw.ui.auto.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        dryRun = false,
        features = "classpath:features",
        glue = {"com.ckw.ui.auto"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports",
                "json:target/cucumber-reports/cucumber.json"
        }
)
public class CucumberTestRunner {
}
