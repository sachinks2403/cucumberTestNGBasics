package cucumberOptionsdemo;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
glue="stepdefinition",
monochrome = true,
tags = "@NetBanking or @Mortgage",
plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json"}
)

public class TestNGRunner extends AbstractTestNGCucumberTests {

}
