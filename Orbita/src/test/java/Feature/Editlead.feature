Feature: Rename companyname 

Background:
Given Open the Chrome Browser
And Maximize the Browser
And Set the Timeouts
And Load the URL

Scenario Outline: EditLead Positive Flow 
And Enter the username as <username>
And Enter the password as <password>
When click the login button
Then Verifiy login sucessfully
And Click CRMSFA Button
And Click Leads Button
When Click FindLeads Button
And Enter the First name
Then Click the Find Lead Button
When Select the First Lead name 
Then Verifiy the PageTitle
And Select the CompanyName Field
And Enter the CompanyName as <companyname>
When Select the Update
Then Verifiy the changes as <companyname>

Examples: 

|username|password|title|companyname|
|demosalesmanager|crmsfa|View Lead | opentaps CRM|Ameexusa|
|demosalesmanager|crmsfa|View Lead | opentaps CRM|Ameexusa|


Scenario Outline: EditLead Negative Flow
And Enter the wusername as <username>
And Enter the wpassword as <passwrod>
When click the wlogin button
Then Verifiy login Failures
And User entered Wrong Crediential
But Credentials are wrong

Examples:

|username|password|
|demosalesmanager1|crmsfa|