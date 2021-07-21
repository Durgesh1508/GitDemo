package runnerclass;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src\\test\\java\\feature\\uber.feature"},
		glue= {"stepdefinition"},
		monochrome= true,
		tags="@Regression and @Sanity",
		plugin= {"pretty"}
		
		)
public class UberTest {

}
