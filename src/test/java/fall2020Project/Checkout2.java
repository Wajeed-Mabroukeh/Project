package fall2020Project;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout2 {
	
	
	        private String nameB,nameA;
	        private int priceB,priceA,Result;
	        private  checkBA BA= new checkBA();
	        
	        //Scenario2
			@Given("the price of a {string} is {int}")
			public void thePriceOfAIs11(String string, Integer int1) {
			    // Write code here that turns the phrase above into concrete actions
				nameB = string;
				priceB = int1;
			}

			//Some other steps were also undefined:

			@And("the price of a {string} is {int}")
			public void thePriceOfAIs1(String string, Integer int1) {
			    // Write code here that turns the phrase above into concrete actions
				nameB = string;
				priceA = int1;
			}
			@When("I checkout {int} {string}")
			public void iCheckout1111(Integer int1, String string) {
			    // Write code here that turns the phrase above into concrete actions
				BA.add(int1,string,priceB);
			}
			@And("I checkout {int} {string}")
			public void iCheckout1(Integer int1, String string) {
			    // Write code here that turns the phrase above into concrete actions
				BA.add(int1,string,priceA);
			}
			@Then("the total price should be {int}")
			public void theTotalPriceShouldBe1(Integer int1) {
			    // Write code here that turns the phrase above into concrete actions
				Result= BA.Total();
			    assertTrue(Result == 65); 
			}

}
