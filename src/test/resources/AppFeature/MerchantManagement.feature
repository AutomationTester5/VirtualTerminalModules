Feature: Boarding the Merchant Management Feature 

Background: 
	Given user is on MerchantManagementPage 
		|username|password|
		|vigneshradhakrishnan76+dtysys@gmail.com|Valor123|
		
Scenario Outline: Boarding Merchant Managemen with different set of data 
	When click to the button 
	When user clicks Full Board 
	When merchant boarding contact details from given sheetname "<SheetName>" and rownumber <RowNumber> 
	And User is click to the next button 
	When user files the store details from given sheetname 
	When user files the device types and processor
	When user files the device MIT and TID  details from given sheetname "<SheetName>" and rownumber <RowNumber> 
	And User is click to  next button 
	When user is select to all the modules 
	
	Examples: 
	
		|SheetName|RowNumber|
		|boardmerchant|0|