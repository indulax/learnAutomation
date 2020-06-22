package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "featureFiles", 
		glue = {"stepDefinitions", "hooks"},
		strict=true,
		//dryRun = true,
		monochrome = true,
		//format is depricated, so using plugin. both works same and same syntax.
		//reports will be generated under folder testReports. refresh project and check for the folder.
		plugin = {"html: testReports/webPageReport", "json: testReports/jsonReport.json", "junit: testReports/xmlReports.xml"},
		tags = {"@Background"}
		)

public class RunnerClass {
		

}
