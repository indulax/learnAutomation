package stepDefinitions;

import cucumber.api.java.en.Given;

public class ExpressionsStepDef {
	
	@Given("^I have (\\d+) laptops$")
	public void i_have_laptops(int count) {
		System.out.println("I have " + count + " laptops");
	}
	
	@Given("^I have (\\d+\\.\\d+) GB RAM$")
	public void i_have_GB_RAM(float memory) throws Throwable {
		System.out.println("I have " + memory + " GB RAM");
		}

	@Given("^\"(.*?)\" is costlier than \"(.*?)\" and \"(.*?)\"$")
	public void is_costlier_than_and(String os1, String os2, String os3) throws Throwable {
		System.out.println(os1 +" is costier than " +os2 + " and " + os3);
	}

}
