Feature: Boarding the virtual terminal Feature

Background:
Given user is on VirtualTerminalPage
		|username|password|
		|vigneshradhakrishnan76+pinmerchant@gmail.com|Valor123|
		
Scenario Outline:Boarding virtual terminal with different set of transaction Sale,Authorization,Refund,E-Invoice,GiftCard,Cash
  When click to the Virtual Terminal modules
  
  When click to EPI type and transation types
  And enter the amount 
  When give to card number and CVV and MM/YY and Cardholder name 
  And click to the process
  And multiple sale transaction
  When click the authorization transaction
  When click to refund transaction
   When click to the einvoice transaction with paynow link,valor lite QR,flexsible,never expiry
  And click to the cash
  When sale with recurring billing transaction given to the billing address
  
  
  
  
  
 Examples: 
	
		|SheetName|RowNumber|
		|boardmerchant|0|
