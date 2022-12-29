Feature: Boarding the ISO Feature



Background:
    Given user is on UserManagementPage
        |username|password|
        |vigneshwaran@valorpaytech.com|Valor123|
        
       
        
Scenario: Boarding iso with different set of data
   When user clicks add button
    When user clicks add customer  
    When user files the details from 
    And User clicks the next button
    When user files the processor details 
    And user click the next button
    When user select all the modules
    Then activation on that iso in email
    
    
 
        
       

