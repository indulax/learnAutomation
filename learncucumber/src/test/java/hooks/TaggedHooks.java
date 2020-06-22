package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TaggedHooks {

	@Before
	public void beforeEveryScenario() {
		System.out.println("Execute before every scenario");
	}

	@After (order = 1)
	public void afterEveryScenario() {
		System.out.println("Execute after every scenario");
	}

	@After(order = 0)
	public void afterEveryScenariolast() {
		System.out.println("Execute after every scenario very last step");
	}
	/*
	 * @Before("@First") public void beforeFirstScenario() {
	 * System.out.println("Execute before first scenario"); }
	 */
	@Before("@Second")
	public void beforeSecondScenario() {
		System.out.println("Execute before second scenario");
	}

	/*
	 * @Before("@Third") public void beforeThirdScenario() {
	 * System.out.println("Execute before third scenario"); }
	 */
	@After("@First")
	public void afterFirstScenario() {
		System.out.println("Execute after first scenario");
	}

	@After("@Second")
	public void afterSecondScenario() {
		System.out.println("Execute after second scenario");
	}

	@After("@Third")
	public void afterThirdScenario() {
		System.out.println("Execute after third scenario");
	}

	@Before("@First, @Third")
	public void beforeFirstAndThirdScenario() {
		System.out.println("Before first and third scenarios");
	}

}
