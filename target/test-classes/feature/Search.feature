Feature: Amazon Search

Inorder to preform successful login
As a user
I want to enter correct username and password


	Background: 
	Given Login into the homepage
	Then Enter the username and password
	Then User navigated to the homepage
	
	Scenario: Search a Product1
	Given I have Search field for product1 on amazon Page
	When I search  for a product  with name "Apple Macbook pro1" and price 1000
	Then product with name "Apple Macbook pro" should be displayed
	
	Scenario: Search a Product2
	Given I have Search field product2 on amazon Page
	When I search  for a product  with name "Apple Macbook pro2" and price 2000
	Then product with name "Apple Macbook pro2" should be displayed
	
	Scenario: Search a Product3
	Given I have Search field product3 on amazon Page
	When I search  for a product  with name "Apple Macbook pro3" and price 3000
	Then product with name "Apple Macbook pro3" should be displayed

         
        