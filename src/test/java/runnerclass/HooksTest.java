package runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src\\test\\java\\feature\\SearchAmzon.feature"},
		glue= {"stepdefinition","myhooks"},
		tags="@Smoke or @Regression",
		monochrome= true,
		plugin= {"pretty","html:target/MyReport/report.html",
				"json:target/MyReport/report.json",
				"junit:target/MyReport/report.xml"},
		publish=true,
		strict=false
		
		
		
		)


public class HooksTest {

}
