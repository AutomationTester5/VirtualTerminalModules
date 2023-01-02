package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/AppFeature"},glue= {"StepDefinations", "AppHooks"},
//dryRun=true,
plugin= {"pretty",

        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

},
	tags= "@hierarchy"



)
public class portalrunner {
	
	
	


}
