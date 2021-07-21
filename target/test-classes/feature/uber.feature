@All
Feature: Uber booking Feature 


@Prod
Scenario:  Booking Cab SUV
Given User wants  to select  a car type "sedan" from uber app
When User selects car "sedan" and pick up point "Bangalore" and drop location "Pune"
Then Driver starts the journey
And  Driver ends the journey
Then User pays 1000 USD


@Regression
Scenario:  Booking Cab Sedan
Given User wants  to select  a car type "sedan" from uber app
When User selects car "sedan" and pick up point "Bangalore" and drop location "Hyderabad"
Then Driver starts the journey
And  Driver ends the journey
Then User pays 1000 USD


@Sanity
Scenario:  Booking Cab mini
Given User wants  to select  a car type "sedan" from uber app
When User selects car "Mini" and pick up point "Bangalore" and drop location "Chennai"
Then Driver starts the journey
And  Driver ends the journey
Then User pays 1000 USD

@Regression 
Scenario:  Booking Cab Sedan
Given User wants  to select  a car type "sedan" from uber app
When User selects car "sedan" and pick up point "Bangalore" and drop location "Hyderabad"
Then Driver starts the journey
And  Driver ends the journey
Then User pays 1000 USD

@Regression @Sanity @Prod
Scenario:  Booking Cab Sedan
Given User wants  to select  a car type "sedan" from uber app
When User selects car "sedan" and pick up point "Bangalore" and drop location "Hyderabad"
Then Driver starts the journey
And  Driver ends the journey
Then User pays 1000 USD



