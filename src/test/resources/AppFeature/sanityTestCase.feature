Feature: Sanity test case feature

Background:
Given user is on UAT 
		|username|password|
		|vigneshradhakrishnan76+taxmerchant@gmail.com|Valor123|
		
Scenario: Creadential testing 
When Create ISO (UAT&DEMO)
When Board the merchant from ISO and do the transaction . Once READY TO TRANSACT MODE enabled. Transaction go through fine (Invalid feature)
And Resend Activation for SUB ISO USER
When Create SubIso
And Resent Activation email
When Activate SubIso
And Reset Password
Then Create SubIso User
And Resent Activation email for Sub Iso user
When Delete Sub Iso
And Delete Sub Iso User
When Add the opertaor from merchant login -> Check the modules you provided should be visible to Ops
Then Add the Opertaor for Merchant X from ISO login and Ad

