Feature: Rename Companyname 

Background:
Given Open the Chrome Browser
And Maximize the Browser
And Set the Timeouts
And Load the URL

Scenario Outline: EditLead Positive Flow 
And Enter the username as <username>
And Enter the password as <password>
When click the login button
Then Verify login sucessfully
And Click CRMSFA Button
And Click Leads Button
When Click FindLeads Button
And Enter the First name
Then Click the Find Lead Button
When Select the First Lead name 
Then Verify the PageTitle
And Select the CompanyName Field
When Enter the CompanyName as <companyname>
Then Select the Update

Examples: 

|username|password|companyname|
|demosalesmanager|crmsfa|allusa|
|demosalesmanager|crmsfa|allusa|
