Feature: Login

Inorder to preform successful login
As a user
I want to enter correct username and password

Scenario: In order to verify login to facebook page as valid user
Given user navigated to facebook website
When user validates the homapage title
Then user enters "valid" the username
And user enters "valid" the password
Then user shouldbe able to successfully login

Scenario: In order to verify login to facebook page as valid user
Given user navigated to facebook website
When user validates the homapage title
Then user enters "invalid" the username
And user enters "invalid" the password
Then user "shouldnot" able successfully login

         
        