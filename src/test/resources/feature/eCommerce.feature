Feature: Test login functionality of ecommerce app
Scenario Outline:
 user should be login with valid data
Given user  is at login page
When user provide <username>and <password>
And click on login button
Then use should be navigate to account page
#
Examples:
|username        |    password|   
|"sachingmailcom"|"sachin"  	|
#|"sachin@123"		 | 		"gadekr"|