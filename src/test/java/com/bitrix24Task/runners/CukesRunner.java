package com.bitrix24Task.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/Bitrix24.html",
        features = "src/test/resources/features",
        glue = "com\\bitrix24Task\\step_defenitions",
        dryRun = false,
        tags = "@test3"
)

public class CukesRunner {
}