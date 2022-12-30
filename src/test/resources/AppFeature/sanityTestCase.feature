Feature: Boarding the SubISO Feature

Background:
Given user is on SubisoCreatePage
        |username|password|
        |vigneshwaransanityiso51|Valor123|
 @Createdioss      
Scenario: Creadential testing 

    When Create ISO User
    When Create SubIso
    When create the subiso user with data
    
    And Delete Sub Iso and Delete Sub Iso User
    
 @Resendisouser 
 Scenario: Resend Activations IsoU  
 When Resend Activation for ISO USER
 
 @ResendSubiso   
 Scenario: Resend Activations SubI   
    When  Resent Activation for SubIso
    
 @ResendSubisouser 
 Scenario: Resend Activations SubIU   
    And Resent Activation email for Sub Iso user