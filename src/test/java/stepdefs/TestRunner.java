package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/html-cucumber",
		"json:target/cucumber.json" }, features = "src/test/java/features", glue = "stepdefs",
		// tags = { "@WIP" } // to run a work in progress scenario
		// tags = {"@sanity"} // to run all the sanity scenarios
		// tags = {"Regression or @sanity"}// either Regression or sanity
		// tags = {"Regression and @sanity"}// both the tags should be there
		// tags = {"calculator"} // feature level tag
		// tags = {"not @WIP"} // run all the scenarios except WIP
		tags = { "@browser and not @WIP" } // run all the browser scenarios except WIP
)
public class TestRunner {

}
