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
	
	@FDROMAHA
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
		|FirstData|0|
		
		
		
	@FDRCARDNET	
    Scenario Outline: Admin FDR NORTH / CARDNET
	When FD CARDNET	processor to select the Add Customer option
	When user is boarded a Contact Information FD CARDNET Iso given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user is boarded a Processor Info  FD CARDNET Iso given sheetname "<SheetName>" and rownumber <RowNumber> 
	When FD CARDNET processor select the Add User option
	When user is boarded a Admin user FD CARDNET processor given sheetname "<SheetName>" and rownumber <RowNumber> 
	When FD CARDNET processor to select the Add Customer option in User Level
	When user is boarded in a userlevel FD CARDNET Contact Information ISO given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user is boarded in a userlevel FD CARDNET Processor Info ISO given sheetname "<SheetName>" and rownumber <RowNumber> 
	Examples: 
	
		|SheetName|RowNumber|
		|FDCARDNET|0|
		
		
	@FDRBUYPASS	
    Scenario Outline: Admin FDR NORTH / BUYPASS
	When FD BUYPASS	processor to select the Add Customer option
	When user is boarded a Contact Information FD BUYPASS Iso given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user is boarded a Processor Info  FD BUYPASS Iso given sheetname "<SheetName>" and rownumber <RowNumber> 
	When FD BUYPASS processor select the Add User option
	When user is boarded a Admin user FD BUYPASS processor given sheetname "<SheetName>" and rownumber <RowNumber> 
	When FD BUYPASS processor to select the Add Customer option in User Level
	When user is boarded in a userlevel FD BUYPASS Contact Information ISO given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user is boarded in a userlevel FD BUYPASS Processor Info ISO given sheetname "<SheetName>" and rownumber <RowNumber> 
	Examples: 
	
		|SheetName|RowNumber|
		|FirstData|1|
		
	@FDRNASHVILLE	
    Scenario Outline: Admin FDR NORTH / NASHVILLE
	When FD NASHVILLE	processor to select the Add Customer option
	When user is boarded a Contact Information FD NASHVILLE Iso given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user is boarded a Processor Info  FD NASHVILLE Iso given sheetname "<SheetName>" and rownumber <RowNumber> 
	When FD NASHVILLE processor select the Add User option
	When user is boarded a Admin user FD NASHVILLE processor given sheetname "<SheetName>" and rownumber <RowNumber> 
	When FD NASHVILLE processor to select the Add Customer option in User Level
	When user is boarded in a userlevel FD NASHVILLE Contact Information ISO given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user is boarded in a userlevel FD NASHVILLE Processor Info ISO given sheetname "<SheetName>" and rownumber <RowNumber> 
	Examples: 
	
		|SheetName|RowNumber|
		|FirstData|1|
		
		
	@POSTILION	
    Scenario Outline: Admin FDR NORTH / NASHVILLE
	When FD POSTILION	processor to select the Add Customer option
	When user is boarded a Contact Information FD POSTILION Iso given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user is boarded a Processor Info  FD POSTILION Iso given sheetname "<SheetName>" and rownumber <RowNumber> 
	When FD POSTILION processor select the Add User option
	When user is boarded a Admin user FD POSTILION processor given sheetname "<SheetName>" and rownumber <RowNumber> 
	When FD POSTILION processor to select the Add Customer option in User Level
	When user is boarded in a userlevel FD POSTILION Contact Information ISO given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user is boarded in a userlevel FD POSTILION Processor Info ISO given sheetname "<SheetName>" and rownumber <RowNumber> 
	Examples: 
	
		|SheetName|RowNumber|
		|FirstData|1|
		
		
		
		
		
		