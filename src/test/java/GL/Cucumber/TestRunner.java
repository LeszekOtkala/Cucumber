package GL.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature",
		glue = {""}			// tu szuka step definitions;
		)

public class TestRunner {

}
