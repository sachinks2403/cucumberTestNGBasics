package stepdefinition;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("user is on net banking landing page")
	public void user_is_on_net_banking_landing_page() {
		System.out.println("Used is in landing page");
	  
	}
	@When("user login to the application")
	public void user_login_to_the_application() {
		System.out.println("Used is in login page");
		  
	    
	}
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Used is in home page");
		  
	   
	}
	@Then("cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Cards are displayed");
		     
	}
	
	@Given("^user login to the application with (.+) and (.+)$")
	public void login(String username,String password) {
		
		System.out.println(username + " " + password);
		
	}
	
	@When("user sign up to the application")
	public void user_sign_up_to_the_application(List<String> data) {
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
	
	}
	
	@Given("I connect to the database")
	public void i_connect_to_the_database() {
	    System.out.println("Statement under BACKGROUND - 1");
	}

	@Given("I verify the user details")
	public void i_verify_the_user_details() {
		 System.out.println("Statement under BACKGROUND - 2");
	}

	@Then("user entry should be present")
	public void user_entry_should_be_present() {
		 System.out.println("Statement under BACKGROUND - 3");
	}

}
