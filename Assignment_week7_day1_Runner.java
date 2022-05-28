package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/features/Assignment_Week7_day1_CreateLead.feature",
		"src/test/java/features/Assignment_Week7_day1_DeleteLead.feature",
		"src/test/java/features/Assignment_Week7_day1_MergeLead.feature",
		"src/test/java/features/Assignment_Week7_day1_EditLead.feature",
		"src/test/java/features/Assignment_Week7_day1_DuplicateLead.feature" }, glue = "steps", monochrome = true, publish = true)
public class Assignment_week7_day1_Runner extends AbstractTestNGCucumberTests {

}
