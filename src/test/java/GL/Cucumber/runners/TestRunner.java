package GL.Cucumber.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import GL.Cucumber.stepDefinitions.*; 
@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature",
		glue = {""},			// tu szuka step definitions;
		strict=true,
		dryRun=false,
		tags= {"@Positive, @Negative"}//or
		//, tags= {"@Positive", "@Negative"}//and
		//tags= {"@Positive,@Negative"} //or
		//tags= {"~@Positive", "@Negative"}//and
		)

public class TestRunner {

}
