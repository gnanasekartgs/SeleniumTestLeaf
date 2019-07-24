Feature: Leaftaps Login

Background:
Given Open the Chrome Browser1
And Maximize the Browser1
And Set the Timeouts1
And Load the URL1

Scenario Outline: TC001_CreateLead Positive Flow
And Enter the Username as <username>
And Enter the Password as <password>
When click on the login button
Then Verify Login Successful
And Click the CRMSFA button
And Click Create Lead Button
And Enter company name as <companyname>
And Enter first name as <fname>
And Enter last name as <lname> 
When Click on submit button
Then Verify Submit details 
And Lead not created successfully
But If not Submit

Examples:
|username|password|companyname|fname|lname|
|demosalesmanager|crmsfa|all|gnana|tgs|


