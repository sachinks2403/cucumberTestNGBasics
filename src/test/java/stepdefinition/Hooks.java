package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@NetBanking")
	public void netBankingSetup() {
		System.out.println("#### Run before netbanking scenarios ##");
	}
	
	@Before("@Mortgage")
	public void mortgageSetup() {
		System.out.println("***** Run before mortgage scenarios ****");
	}
	
	@After("@Mortgage")
	public void mortgageTearDown() {
		System.out.println("***** Run after mortgage scenarios ****");
	}
	
	@Before()
	public void setUp()
	{
		System.out.println("$$$$ Run before each scenario $$$$");
	}

	
	@After
	public void tearDown() {
		System.out.println("$$$$ Run after each scenario $$$$");
	}
	
	@Before("@First,@Third")
    public void beforeFirstAndThird(){
        System.out.println("This will run before both First & Third Scenario");
    }
}
