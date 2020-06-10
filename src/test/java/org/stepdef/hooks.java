package org.stepdef;

import java.util.Date;

import org.base.BaseCls;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends BaseCls {
	
	@Before(order=1)
	public void beforeScenario() {
System.out.println("Scenario starts");
	}
	
	@After(order=1)
	public void afterScenario() {
System.out.println("Scenario ends");
	}
	
	@Before(order=2)
	public void enterDate() {
System.out.println(new Date());
	}
	
	@After(order=2)
	public void exitDate() {
System.out.println(new Date());
	}
	
    @Before(order=3)
	public void beforeSc() {
launchBrowser();
	}
    
    @After(order=3)
    public void afterSc() {
    	closeBrowser();

	}
	
	

	

}
