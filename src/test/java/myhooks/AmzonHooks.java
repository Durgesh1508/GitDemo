package myhooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AmzonHooks {
	
	
	@Before("@Smoke or @Regression")
	public void setup_browser(Scenario sc) {
		System.out.println("launch browser");
		System.out.println(sc.getName());
	}
	
	
	
	
	@After
	public void tearDown_browser1() {
		System.out.println("close the browser1");
	}
	

}
