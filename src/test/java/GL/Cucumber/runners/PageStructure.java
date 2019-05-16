package GL.Cucumber.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:GL/Cucumber/features/PageStructure.feature",
		glue = {"GL/Cucumber/stepDefinitions"},			// tu szuka step definitions;
		strict=true,
		dryRun=false
		,tags= {"@RunNow"}
		//,tags= {"@Positive"}//or
		//, tags= {"@Positive", "@Negative"}//and
		//tags= {"@Positive,@Negative"} //or
		//tags= {"~@Positive", "@Negative"}//and
		)

public class PageStructure {

}
