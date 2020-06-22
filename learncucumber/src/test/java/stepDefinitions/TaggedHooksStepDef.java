package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksStepDef {
	
	@Given("^This is first step$")
	public void this_is_first_step() throws Throwable {
		System.out.println("This is first step");
	}

	@When("^This is second step$")
	public void this_is_second_step() throws Throwable {
		System.out.println("This is second step");
	}

	@Then("^This is third step$")
	public void this_is_third_step() throws Throwable {
		System.out.println("This is third step");
	}

}
