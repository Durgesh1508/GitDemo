package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks {
	
	
	
	@Given("I have Search field for product on amazon Page")
	public void i_have_search_field_for_product_on_amazon_page() {
	  
	}


    @When("I search  for a product  with name {string} and price {int}")
    public void i_search_for_aproduct_with_name_something_and_price_1000(String strArg1,Integer int1) throws Throwable {
        System.out.println("product"+strArg1+"price"+int1);
    }


    @Then("product with name {string} should be displayed")
    public void product_with_name_something_should_be_displayed(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }

}
