package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/AppFeature"},glue= {"StepDefinations", "AppHooks"},
dryRun=true,plugin= {"pretty"}
		



)
public class portalrunner {
	
	
	


}
