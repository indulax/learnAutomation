package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BreadOmeletteHooksStepDef {

	@Given("^stove is on$")
	public void stove_is_on() throws Throwable {
	System.out.println("stove is on");
	}
	
	@When("^pan is hot$")
	public void pan_is_hot() throws Throwable {
		System.out.println("pan is hot");
	}

	@When("^place bread dipped in egg and onion mixture on pan$")
	public void place_bread_dipped_in_egg_and_onion_mixture_on_pan() throws Throwable {
		System.out.println("place bread dipped in egg and onion mixture on pan");
	}

	@When("^toast n both sides$")
	public void toast_n_both_sides() throws Throwable {
		System.out.println("toast on both sides");
		}
	
	@Then("^bread amelette should be ready$")
	public void bread_amelette_should_be_ready() throws Throwable {
		System.out.println("bread omelette should be ready");
	}

}
