package fall2020Project;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkout{
	
	    //Scenario1
	    private String name;
	    private int price,Result;
	    private  checkB BB= new checkB();
	    
	    //Scenario
		@Given("the price of a {string} is {int}")
		public void thePriceOfAIs(String string, Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
			name = string;
			price = int1;
		}
		
		//Some other steps were also undefined:
		
		@When("I checkout {int} {string}")
		public void iCheckout111(Integer int1, String string) {
		    // Write code here that turns the phrase above into concrete actions
		    BB.add(int1,string,price);
		}
		@And("I checkout {int} {string}")
		public void iCheckout11(Integer int1, String string) {
		    // Write code here that turns the phrase above into concrete actions   
		     BB.add(int1,string,price);
		}
		@Then("the total price should be {int}")
		public void theTotalPriceShouldBe(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
			Result= BB.Total();
		    assertTrue(Result == 80); 
		}
}