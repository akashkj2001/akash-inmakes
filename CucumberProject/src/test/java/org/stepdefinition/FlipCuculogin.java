package org.stepdefinition;

import org.base.BaseAkash;
import org.pojo.FlipPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class FlipCuculogin  extends BaseAkash {
	FlipPojo f ;
	

	@Given("To launch the browser and maximize window")
	public void to_launch_the_browser_and_maximize_window() {
	    launchbrowser();
	    winmaximize();
	}

	@When("To launch the url of the flipkart application")
	public void to_launch_the_url_of_the_flipkart_application() {
	    launchurl("https://www.flipkart.com/");
	}
    
	@When("To pass valide user name in email field")
	public void to_pass_valide_user_name_in_email_field() {
	    f =new FlipPojo();
	    passtext("akashkja000@gmail.com", f.getFlemailfield());
	    
	}
	@When("to cilc the request otp boutton")
	public void to_cilc_the_request_otp_boutton() {
	    f = new FlipPojo();
	    clickbtn(f.getFlemailfield());
	}

	@Then("To close the entire browser")
	public void to_close_the_entire_browser() {
	    clossentirebrowser();
	}
	}
