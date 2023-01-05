Feature: Portal HomePage Feature

	Background:
	Given user has open a AdminPage
	|username|password|
	|vigneshwaran@valorpaytech.com|Valor123|
	
	
	@TSYS
	Scenario: Admin TSYS SIERRA
	When user is on boarded a Iso
	When user is on boarded a Admin user
	When user is on boarded in a userlevel ISO
	
	@OMAHA
	Scenario: Admin FDR OMAHA(F/B)
	When user is to boarded a Iso
	When user is to boarded a Admin user
	When user is the boarded in a userlevel ISO