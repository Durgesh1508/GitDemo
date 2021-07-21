package stepdefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {
	
	
	@Given("^User wants  to select  a car type \"([^\"]*)\" from uber app$")
    public void user_wants_to_select_a_car_type_something_from_uber_app(String carType)  {
        System.out.println("Step 1: "+carType);
    }

    @When("^User selects car \"([^\"]*)\" and pick up point \"([^\"]*)\" and drop location \"([^\"]*)\"$")
    public void user_selects_car_something_and_pick_up_point_something_and_drop_location_something(String carType, String pickUpLocation, String DropLocation) {
       System.out.println("Step 2:" +carType+ "pickuplocation"+pickUpLocation+"DropLocation"+DropLocation);
    }

    @Then("Driver starts the journey")
    public void driver_starts_the_journey()  {
        System.out.println("Step 3");
    }
    
    
    @Then("Driver ends the journey")
    public void driver_ends_the_journey() {
        System.out.println("Step 4 ");
    }

    @Then("User pays {int} USD")
    public void user_pays_usd(Integer int1) {
        System.out.println("Step5 :"+int1);
    }
   

}
