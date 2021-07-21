Feature: User Registration

Scenario: user registration with different data
Given User is on registration page
When User enter following details
 |durgesh|male|ravi.durges12@gmail.com|varanasi|8449383672|
 |durgesh1|male1|ravi1.durges12@gmail.com|varanasi1|81449383672|
 Then user registration is successful
 
 
 Scenario: user registration with different data with columns
Given User is on registration page
When User enter following details with columns
 |Name   |Gender|email|City|Number|
 |durgesh|male|ravi.durges12@gmail.com|varanasi|8449383672|
 |durgesh1|male1|ravi1.durges12@gmail.com|varanasi1|81449383672|
 Then user registration is successful
 
 