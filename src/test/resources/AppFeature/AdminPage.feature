Feature: Portal HomePage Feature

	Background:
	Given user has open a AdminPage
	|username|password|
	|vigneshwaran@valorpaytech.com|Valor123|
	
	
	@TSYS
	Scenario Outline: Admin TSYS SIERRA
	When TSYS SIERRA processor to select the Add Customer option
	When user is on boarded a Contact Information Iso given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user is on boarded a Processor Info Iso given sheetname "<SheetName>" and rownumber <RowNumber> 
	When TSYS SIERRA processor select the Add User option
	When user is on boarded a Admin user given sheetname "<SheetName>" and rownumber <RowNumber> 
	When TSYS SIERRA processor to select the Add Customer option in User Level 
	When user is on boarded in a userlevel Contact Information ISO given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user is on boarded in a userlevel Processor Info ISO given sheetname "<SheetName>" and rownumber <RowNumber> 
	Examples: 
	
		|SheetName|RowNumber|
		|automation|0|
	
	@OMAHA
	Scenario Outline: Admin FDR OMAHA(F/B)
	When FD OMAHA processor to select the Add Customer option
	When user is boarded a Contact Information FD Iso given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user is boarded a Processor Info  FD Iso given sheetname "<SheetName>" and rownumber <RowNumber> 
	When FD OMAHA processor select the Add User option
	When user is boarded a Admin user FD processor given sheetname "<SheetName>" and rownumber <RowNumber> 
	When FD OMAHA processor to select the Add Customer option in User Level
	When user is boarded in a userlevel FD Contact Information ISO given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user is boarded in a userlevel FD Processor Info ISO given sheetname "<SheetName>" and rownumber <RowNumber> 
	Examples: 
	
		|SheetName|RowNumber|
		|automation|0|