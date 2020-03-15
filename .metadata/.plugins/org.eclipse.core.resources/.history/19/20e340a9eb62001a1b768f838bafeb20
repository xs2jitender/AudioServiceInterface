Feature: As a user, I want to log into ASI software 

@ValidCase @Smoke 
Scenario Outline: Successful login using valid account 
	Given I am on the login page 
	When I type in username <username> 
	And I type password as <password> 
	And click on login button 
	Then I successfully login and land on homepage displaying Dashboard page 

	Examples: 
		| username| password |
		| admin   | admin        |
		
		
		
#		@InvalidCase @Smoke 
#		Scenario Outline: Failed login for not providing password 
#			Given I am on the login page 
#			When I type in user name<username> 
#			And I leave the <password> box empty 
#			And click on login button 
#			Then nothing happens 
#			Examples: 
#				| username         | password |
#				| admin            | admin    |
#				| admin            |          |
#     