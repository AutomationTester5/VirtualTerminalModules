Feature: Boarding the SubISO Feature

Background:
Given user is on SubisoCreatePage
        |username|password|
        |vigneshwaransanityiso38|Valor123|
Scenario: Creadential testing 

    When Create SubIso
    When create the subiso user with data
    And Delete Sub Iso and Delete Sub Iso User
