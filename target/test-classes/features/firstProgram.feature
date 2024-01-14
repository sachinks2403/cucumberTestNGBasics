Feature: Verify banking application 

Background:
Given I connect to the database
And I verify the user details
Then user entry should be present

@Regresssion @NetBanking
Scenario: Verify banking login functionality 

	Given user is on net banking landing page 
	When user login to the application 
	Then Home page is displayed 
	And cards are displayed 
	

 @NetBanking	
Scenario Outline: Validate by passing username and password 

	Given user is on net banking landing page 
	When user login to the application with "<username>" and "<password>" 
	Then Home page is displayed 
	And cards are displayed 
	
	Examples: 
		|username|password|
		|admin|pass123|
		|user|pass456|
		
@Mortgage	
Scenario: Verify banking login functionality 

	Given user is on net banking landing page 
	When user sign up to the application 
		|rahul|
		|shetty|
		|rahul@gmail.com|
	Then Home page is displayed 
	And cards are displayed