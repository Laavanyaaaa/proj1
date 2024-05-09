package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@CucumberOptions(
features = "src//test//resources",
glue = "StepDefinition",
dryRun = false,
publish = true ,
//tags = "@All",
//tags = "@Smoke",
//tags = "@Sanity",
//tags = "@Retesting",
//tags = "@Regression",
//tags="@Smoke or @Sanity",
//tags="@Smoke and @Sanity",



plugin = { "pretty",
"junit:target/cucumber-reports/Cucumber.xml",
"json:target/cucumber-reports/Cucumber.json",
"html:target/cucumber-report/cucumber.html",
"html:target/cucumber-html-report",
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
}
)
@RunWith(Cucumber.class)

public class Runner { }