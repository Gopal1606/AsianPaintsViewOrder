package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/Feature/ViewOrder.feature",glue= {"StepDefinition"},plugin= {"pretty"})
public class TestRunner extends AbstractTestNGCucumberTests
{
	
}

 