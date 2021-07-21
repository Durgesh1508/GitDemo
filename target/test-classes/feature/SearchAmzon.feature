Feature: Amazon Search Engine
@Smoke @Regression
Scenario: Search a Product
	Given I have Search field for product on amazon Page
	When I search  for a product  with name "Apple Macbook pro1" and price 1000
	Then product with name "Apple Macbook pro" should be displayed
	@Smoke
Scenario: Search a Product2
	Given I have Search field for product on amazon Page
	When I search  for a product  with name "Apple Macbook pro2" and price 2000
	Then product with name "Apple Macbook pro" should be displayed
	@Regression
	Scenario: Search a Product3
	Given I have Search field for product on amazon Page
	When I search  for a product  with name "Apple Macbook pro3" and price 2000
	Then product with name "Apple Macbook pro3" should be displayed
	Then oh my god