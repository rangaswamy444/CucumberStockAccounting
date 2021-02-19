Feature: stockLogin
@Loginsingledata
Scenario: Admin Login
Given i launch url in browser
When i click on reset button
When i enter username and password
When i click on login button
Then i validate title
Then i close browser
@logindatatable
Scenario Outline: validate login with data
Given user launch "<Browser>" in multiple
When user Click on reset button
When user enter "<Username>" in userfield
When user enter "<Password>" in passwordfield
When user click on login button
Then user validate title
Then user close Browser
Examples:
|Browser|Username|Password|  
|chrome|admin|master|
|firefox|admin|master|
|chrome|admin1|master|
|firefox|admin|master1|
|chrome|admin|master|
|chrome|admin|master|

