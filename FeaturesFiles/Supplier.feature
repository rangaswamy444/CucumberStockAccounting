Feature: validating ERP tests
@Supplierdata
Scenario Outline: Supplier creation Functionality Validation
When Open Browser
When Open Application
When Wait For Username
When Enter Username
When Wait For Password
When Enter Password
When Wait For Login
When Click On Login
When Wait For Supplier
When Click On Supplier
When Wait For AddButton
When Click On AddButton
When Wait For SupplierNumber
Then Capture Data
When Wait For SupplierName
When Enter in "<SupplierName>" with "id" and "x_Supplier_Name" 
When Enter in "<address>" with "xpath" and "//*[@id='x_Address']" 
When Enter in "<city>" with "xpath" and "//*[@id='x_City']" 
When Enter in "<country>" with "xpath" and "//*[@id='x_Country']" 
When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']" 
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']" 
When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']" 
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']" 
When Enter in "<note>" with "xpath" and "//*[@id='x_Notes']" 
When Wait For Add Button
When Click On Add Button after adding notes
When Wait For Ok Button
When Click On Ok Button with "xpath" and "(//*[text()='OK!'])[1]"
When Wait For Alert
When Click On Alert
Then user validate the supplier table
When user closes the browser

Examples:
|SupplierName|address|city|country|cperson|pnumber|mail|mnumber|note|
|Akhilesh1|srnagar1|Hyderabad1|India|Rangapappasani1|1234567|test@gmail.com|8765432|iam purchasing mobile1|
|Akhilesh1|srnagar87|Hyderabad|India|Rangapappasani1|1234567|test@gmail.com|8765432|iam purchasing mobile1|
|Akhilesh1|srnagar|Hyderabad|India|Rangapappasani1|1234567|test@gmail.com|8765432|iam purchasing mobile1|



