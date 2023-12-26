package com.saddy.runners;

import com.saddy.drivers.WebDriverManager;
import com.saddy.reporter.GenerateReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com.saddy.stepdef",
        plugin = {"pretty",
                "json:target/cucumber.json",
        },
//        tags = "@yourTag",
        monochrome = true
)
public class TestRunner {
        @AfterClass
        public static void tearDown() {
                WebDriverManager.quitDriver();
                GenerateReport.generateReport();
        }
}
