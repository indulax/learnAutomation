package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundStepDef {

	@Given("^Student finished primary education$")
	public void student_finished_primary_education() throws Throwable {
		System.out.println("Student finished primary education");
	}

	@Given("^Student finished secondary education$")
	public void student_finished_secondary_education() throws Throwable {
		System.out.println("Student finished secondary education");
	}
	

	@Given("^Student taken entrance exam$")
	public void student_taken_entrance_exam() throws Throwable {
		System.out.println("Student taken entrance exam");
	}

	@When("^student cleared exam$")
	public void student_cleared_exam() throws Throwable {
		System.out.println("student cleared exam");
	}

	@Then("^join to any medical college$")
	public void join_to_any_medical_college() throws Throwable {
		System.out.println("join to any medical college");
	}

	@Given("^Student attended entrance$")
	public void student_attended_entrance() throws Throwable {
		System.out.println("Student attended entrance");
	}

	@When("^student scores cut off$")
	public void student_scores_cut_off() throws Throwable {
		System.out.println("student scores cut off");
	}

	@Then("^join to any engineering college$")
	public void join_to_any_engineering_college() throws Throwable {
		System.out.println("join to any engineering college");
	}

}
