package org.stepdef;

import org.base.BaseCls;
import org.pojo.PojoCls;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefCls extends BaseCls {
	

@Given("Open chrome and launch fb application")
public void open_chrome_and_launch_fb_application() {
	
	loadUrl("https://www.facebook.com");

}

@When("User enters {string} and {string}")
public void user_enters_and(String email, String pass) {
	PojoCls pj=new PojoCls();
	fill(pj.getTxtEmail(), email);
	fill(pj.getTxtPass(),pass);

}

@When("Clicks on login button")
public void clicks_on_login_button() {
	PojoCls pj2=new PojoCls();
	btnClick(pj2.getBtnClick());

}

@Then("User should be navigated to invalid credentials page")
public void user_should_be_navigated_to_invalid_credentials_page() {
System.out.println("complete");
}


}
