package org.stepdefinition;

import org.base.BaseAkash;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class emaillogin extends BaseAkash{
	
	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
	    launchurl("https://www.facebook.com/");
	}

	@Given("User has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
	    launchbrowser();
	    winmaximize();
	}

	@When("User has to hit the facebook url")
	public void user_has_to_hit_the_facebook_url() {
	    launchurl("https://www.facebook.com/");
	}

	@When("User has to pass the data akashkj@gmail.com in email field")
	public void user_has_to_pass_the_data_akashkj_gmail_com_in_email_field() {
	    
	}

	@When("User has to pass the data shbbgy in password field")
	public void user_has_to_pass_the_data_shbbgy_in_password_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Close the entier browser")
	public void close_the_entier_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User has to pass the data {int}@gmail.com in email field")
	public void user_has_to_pass_the_data_gmail_com_in_email_field(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User has to pass the data akashkja in password field")
	public void user_has_to_pass_the_data_akashkja_in_password_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User has to pass the data akashkja{int}@gmail.com in email field")
	public void user_has_to_pass_the_data_akashkja_gmail_com_in_email_field(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User has to pass the data inmakes in password field")
	public void user_has_to_pass_the_data_inmakes_in_password_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User has to pass the data jenuaksh{int}@gmail.com in email field")
	public void user_has_to_pass_the_data_jenuaksh_gmail_com_in_email_field(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User has to pass the data imakesinfo in password field")
	public void user_has_to_pass_the_data_imakesinfo_in_password_field() {
	  
	}



}
