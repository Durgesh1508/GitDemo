package stepdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserR {

	@Given("User is on registration page")
	public void user_is_on_registration_page() {
		System.out.println("user navigates to the registration page");
	}

	@When("User enter following details")
	public void user_enter_following_details(DataTable dataTable) {
		List<List<String>> userList = dataTable.asLists(String.class);
		for(List<String> e: userList) {
			System.out.println(e);
		}
	}
	
	
	@When("User enter following details with columns")
	public void user_enter_following_details_with_columns(DataTable dataTable) {
	  List<Map<String,String>> userMap=dataTable.asMaps(String.class,String.class);
	  
		/*
		 * System.out.println(userMap); System.out.println(userMap.get(0).get("Name"));
		 */	  for(Map<String,String> e: userMap) {
			System.out.println(e.get("Name"));
			System.out.println(e.get("Gender"));
			System.out.println(e.get("email"));
			System.out.println(e.get("City"));
			System.out.println(e.get("Number"));
		}
	  
	}

	@Then("user registration is successful")
	public void user_registration_is_successful() {

	}

}
