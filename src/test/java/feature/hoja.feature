Feature: Login with scenario outline

Scenario Outline: User registration form
Given: User is on the login page1
When: User enter the the "<username>" and "<password>"
Then: User is  able to login

Examples:
|username|password|
|Durgesh |123455  |
|Singh   |67867657| 