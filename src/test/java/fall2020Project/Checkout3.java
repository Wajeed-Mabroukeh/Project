package fall2020Project;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout3 {

	
	private String name;
	private int price;
	private CheckB1 B= new CheckB1();
	//Scenario3
	@Given("the price of a {string} is 40c")
	public void thePriceOfAIs40c(String string ,int price) {
	    // Write code here that turns the phrase above into concrete actions
		name = string;
		this.price =price;
	}

	//Some other steps were also undefined:

	@When("i checkout {int} {string}")
	public void iCheckout(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
	    B.set(string, int1.intValue());
	}
	@Then("the total price should be 40c")
	public void theTotalPriceShouldBe40c() {
	    // Write code here that turns the phrase above into concrete actions
	   int result = B.valueCheck();
	   assertTrue(result == 40);
	}
}
