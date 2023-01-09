package StepDefinations;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.pages.AdminPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.MerchantManagementPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AdminPageStepDefinition {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private AdminPage adminpage;
	private HomePage homePage;

	@Given("user has open a AdminPage")
	public void user_has_open_a_admin_page(DataTable credTable) throws InterruptedException {

		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://uat.valorpaytech.com/signin");
		homePage = loginPage.doLogin(userName, password);
		adminpage = homePage.Adclick();
		
	}
	
	
	

@When("TSYS SIERRA processor to select the Add Customer option")
public void tsys_sierra_processor_to_select_the_add_customer_option() throws InterruptedException {

	 adminpage.addISO();
	 adminpage.addcust();
	
	
}

@When("user is on boarded a Contact Information Iso given sheetname {string} and rownumber {int}")
public void user_is_on_boarded_a_contact_information_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber)throws InvalidFormatException, IOException, InterruptedException, org.apache.poi.openxml4j.exceptions.InvalidFormatException{  {
		
		 
		 ExcelReader reader = new ExcelReader();
		 List<Map<String,String>> testData=
				 reader.getData("C:\\Users\\vigneshwaran\\Desktop\\valor.xlsx", SheetName);
	
		
		 String custName = testData.get(rowNumber).get("cust");
		
		 String email = testData.get(rowNumber).get("mail");
		 String UserName = testData.get(rowNumber).get("usname");
		 String Phone = testData.get(rowNumber).get("Phone");
		 String firstName = testData.get(rowNumber).get("firstname");
		 String lastName = testData.get(rowNumber).get("lastname");
		 String address = testData.get(rowNumber).get("addres");
		 String zipcode = testData.get(rowNumber).get("zipcod");
		 String city = testData.get(rowNumber).get("cit");
		
		 adminpage.createISO(custName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
			
			adminpage.clickNextButton();
			
			
			
			
			
			

	     }	
	
	}	
		
		
		
	@When("user is on boarded a Processor Info Iso given sheetname {string} and rownumber {int}")
	public void user_is_on_boarded_a_processor_info_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
		
		ExcelReader reader = new ExcelReader();
		 List<Map<String,String>> testData=
				 reader.getData("C:\\Users\\vigneshwaran\\Desktop\\valor.xlsx", SheetName);
				 
				 
		 String bin = testData.get(rowNumber).get("BinNumber");
		 String agent = testData.get(rowNumber).get("AgentBankNo");
		 String agentcode = testData.get(rowNumber).get("AgentCode");
		 String chainNumber = testData.get(rowNumber).get("ChainNumber");
		 String label = testData.get(rowNumber).get("Label");
		 String debitsharing = testData.get(rowNumber).get("DebitSharing");
		 String abaNumber = testData.get(rowNumber).get("AbaNumber");
		    adminpage.Processordetails(bin, agent, agentcode, chainNumber, label, debitsharing, abaNumber);
		    adminpage.clickNextButton();
			adminpage.clickNextButton();
			adminpage.selectallmodule();
			adminpage.activationISO();
		
		
		
		
	}
	
	@When("TSYS SIERRA processor select the Add User option")
	public void tsys_sierra_processor_select_the_add_user_option() throws InterruptedException {
		adminpage.AddUser();
	}
	
	
	
	
		
	@When("user is on boarded a Admin user given sheetname {string} and rownumber {int}")
	public void user_is_on_boarded_a_admin_user_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
		 
		
		 ExcelReader reader = new ExcelReader();
		 List<Map<String,String>> testData=
				 reader.getData("C:\\Users\\vigneshwaran\\Desktop\\valor.xlsx", SheetName);
	

		 String email = testData.get(rowNumber).get("mail2");
		 String UserName = testData.get(rowNumber).get("usname2");
		 String Phone = testData.get(rowNumber).get("Phone2");
		 String firstName = testData.get(rowNumber).get("firstname2");
		 String lastName = testData.get(rowNumber).get("lastname2");
		 adminpage.AddUserDetail(email, UserName, Phone, firstName, lastName);
		
		 adminpage.AddUserActivation();
		
		
		 
		
	}
	
	@When("TSYS SIERRA processor to select the Add Customer option in User Level")
	public void tsys_sierra_processor_to_select_the_add_customer_option_in_user_level() throws InterruptedException {
		adminpage.userLevelUM();
		adminpage.addISO();
		adminpage.addcust();
	}
	
	
	
	@When("user is on boarded in a userlevel Contact Information ISO given sheetname {string} and rownumber {int}")
	public void user_is_on_boarded_in_a_userlevel_contact_information_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
		

		 ExcelReader reader = new ExcelReader();
		 List<Map<String,String>> testData=
				 reader.getData("C:\\Users\\vigneshwaran\\Desktop\\valor.xlsx", SheetName);
		
		
		 String custName = testData.get(rowNumber).get("custname2");
			
		 String email = testData.get(rowNumber).get("UserLevelMail");
		 String UserName = testData.get(rowNumber).get("UserLevelname");
		 String Phone = testData.get(rowNumber).get("UserLevelphone");
		 String firstName = testData.get(rowNumber).get("UserLevelfirstname");
		 String lastName = testData.get(rowNumber).get("UserLevellastname");
		 String address = testData.get(rowNumber).get("UserLeveladd");
		 String zipcode = testData.get(rowNumber).get("UserLevelzip");
		 String city = testData.get(rowNumber).get("UserLevelcit");
		
		 adminpage.userLevelISO2(custName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
		 adminpage.clickNextButton();
		 
	}
	

@When("user is on boarded in a userlevel Processor Info ISO given sheetname {string} and rownumber {int}")
public void user_is_on_boarded_in_a_userlevel_processor_info_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
    
	ExcelReader reader = new ExcelReader();
	List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Desktop\\valor.xlsx", SheetName);
			 
	
	
	 
	 String bin = testData.get(rowNumber).get("BinNumber2");
	 String agent = testData.get(rowNumber).get("AgentBankNo2");
	 String agentcode = testData.get(rowNumber).get("AgentCode2");
	 String chainNumber = testData.get(rowNumber).get("ChainNumber2");
	 String label = testData.get(rowNumber).get("Label2");
	 String debitsharing = testData.get(rowNumber).get("DebitSharing2");
	 String abaNumber = testData.get(rowNumber).get("AbaNumber2");
	 adminpage.UserLevelProcessordetails(bin, agent, agentcode, chainNumber, label, debitsharing, abaNumber);
	 adminpage.clickNextButton();
		adminpage.clickNextButton();
		adminpage.clickNextButton();
		adminpage.selectallmodule();
		adminpage.userLevelactivationISO2();
		
	
	
	
	
	
}
	
@When("FD OMAHA processor to select the Add Customer option")
public void fd_omaha_processor_to_select_the_add_customer_option() throws InterruptedException {
    
	 adminpage.addISO();
	 adminpage.addcust();
	 
	
	
}
	




@When("user is boarded a Contact Information FD Iso given sheetname {string} and rownumber {int}")
public void user_is_boarded_a_contact_information_fd_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber)throws InvalidFormatException, IOException, InterruptedException, org.apache.poi.openxml4j.exceptions.InvalidFormatException{  {
	
	 
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Desktop\\FDDetail.xlsx", SheetName);


	 String custName = testData.get(rowNumber).get("cust");
	
	 String email = testData.get(rowNumber).get("mail");
	 String UserName = testData.get(rowNumber).get("usname");
	 String Phone = testData.get(rowNumber).get("Phone");
	 String firstName = testData.get(rowNumber).get("firstname");
	 String lastName = testData.get(rowNumber).get("lastname");
	 String address = testData.get(rowNumber).get("addres");
	 String zipcode = testData.get(rowNumber).get("zipcod");
	 String city = testData.get(rowNumber).get("cit");
	
	 adminpage.createISO(custName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
		
		adminpage.clickNextButton();
		adminpage.OMAHAprocessorType();
	
	
	
	
       }
  
	
	
	
    
}



@When("user is boarded a Processor Info  FD Iso given sheetname {string} and rownumber {int}")
public void user_is_boarded_a_processor_info_fd_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber)throws InvalidFormatException, IOException, InterruptedException, org.apache.poi.openxml4j.exceptions.InvalidFormatException{  {
	
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Desktop\\FDDetail.xlsx", SheetName);
	 
	 String Tid = testData.get(rowNumber).get("TPPId");
		
	 String Sid = testData.get(rowNumber).get("ServiceId");
	 String AName = testData.get(rowNumber).get("AppName");
	 
	     adminpage.FDOMAHA(Tid, Sid, AName);
	     adminpage.clickNextButton();
		 adminpage.clickNextButton();
		 adminpage.clickNextButton();
		 adminpage.selectallmodule();
		 adminpage.activationISO();
	 
	 
}

	
	
	
	
	
	
    
}



@When("FD OMAHA processor select the Add User option")
public void fd_omaha_processor_select_the_add_user_option() throws InterruptedException {
    
	adminpage.AddUser();
	
	
	
}


@When("user is boarded a Admin user FD processor given sheetname {string} and rownumber {int}")
public void user_is_boarded_a_admin_user_fd_processor_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
    

	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("\\Users\\vigneshwaran\\Documents\\Automation testing\\FDDetail.xlsx", SheetName);


	 String email = testData.get(rowNumber).get("mail2");
	 String UserName = testData.get(rowNumber).get("usname2");
	 String Phone = testData.get(rowNumber).get("Phone2");
	 String firstName = testData.get(rowNumber).get("firstname2");
	 String lastName = testData.get(rowNumber).get("lastname2");
	 adminpage.AddUserDetail(email, UserName, Phone, firstName, lastName);
	
	 adminpage.AddUserActivation();
	
	
	
	
	
	
	
	
}



@When("FD OMAHA processor to select the Add Customer option in User Level")
public void fd_omaha_processor_to_select_the_add_customer_option_in_user_level() throws InterruptedException {
	adminpage.userLevelUM();
	adminpage.addISO();
	adminpage.addcust();
	
	
	
	
    
}


@When("user is boarded in a userlevel FD Contact Information ISO given sheetname {string} and rownumber {int}")
public void user_is_boarded_in_a_userlevel_fd_contact_information_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
    
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("\\Users\\vigneshwaran\\Documents\\Automation testing\\FDDetail.xlsx", SheetName);
	
	
	 String custName = testData.get(rowNumber).get("custname2");
		
	 String email = testData.get(rowNumber).get("UserLevelMail");
	 String UserName = testData.get(rowNumber).get("UserLevelname");
	 String Phone = testData.get(rowNumber).get("UserLevelphone");
	 String firstName = testData.get(rowNumber).get("UserLevelfirstname");
	 String lastName = testData.get(rowNumber).get("UserLevellastname");
	 String address = testData.get(rowNumber).get("UserLeveladd");
	 String zipcode = testData.get(rowNumber).get("UserLevelzip");
	 String city = testData.get(rowNumber).get("UserLevelcit");
	
	 adminpage.userLevelISO2(custName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
	 adminpage.clickNextButton();
	 adminpage.DPFiscal();
	
	
	
	
	
	
	
	
	
}



	
	
	
@When("user is boarded in a userlevel FD Processor Info ISO given sheetname {string} and rownumber {int}")
public void user_is_boarded_in_a_userlevel_fd_processor_info_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("\\Users\\vigneshwaran\\Documents\\Automation testing\\FDDetail.xlsx", SheetName);
	 
	 String Tid = testData.get(rowNumber).get("TPPId");
		
	 String Sid = testData.get(rowNumber).get("ServiceId");
	 String AName = testData.get(rowNumber).get("AppName");
	 
	        adminpage.FDOMAHA(Tid, Sid, AName);
	        adminpage.clickNextButton();
			adminpage.clickNextButton();
			adminpage.clickNextButton();
			adminpage.selectallmodule();
			adminpage.userLevelactivationISO2();
	
	
	
}
	
	
	






@When("FD CARDNET	processor to select the Add Customer option")
public void fd_cardnet_processor_to_select_the_add_customer_option() throws InterruptedException {
	 adminpage.addISO();
	 adminpage.addcust();
	
	
	
	
	
	
	
	
}

@When("user is boarded a Contact Information FD CARDNET Iso given sheetname {string} and rownumber {int}")
public void user_is_boarded_a_contact_information_fd_cardnet_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InterruptedException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
    
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\CARDNET.xlsx", SheetName);


	 String custName = testData.get(rowNumber).get("cust");
	
	 String email = testData.get(rowNumber).get("mail");
	 String UserName = testData.get(rowNumber).get("usname");
	 String Phone = testData.get(rowNumber).get("Phone");
	 String firstName = testData.get(rowNumber).get("firstname");
	 String lastName = testData.get(rowNumber).get("lastname");
	 String address = testData.get(rowNumber).get("addres");
	 String zipcode = testData.get(rowNumber).get("zipcod");
	 String city = testData.get(rowNumber).get("cit");
	
	 adminpage.createISO(custName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
		
		adminpage.clickNextButton();
		adminpage.CARDNETProcessorType();
	
	
	
	
       }
	
	
	

	
	
	


@When("user is boarded a Processor Info  FD CARDNET Iso given sheetname {string} and rownumber {int}")
public void user_is_boarded_a_processor_info_fd_cardnet_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InterruptedException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
   
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Desktop\\FDDetail.xlsx", SheetName);
	 
	 String Tid = testData.get(rowNumber).get("TPPId");
		
	 String Sid = testData.get(rowNumber).get("ServiceId");
	 String AName = testData.get(rowNumber).get("AppName");
	 
	     adminpage.FDCARDNET(Tid, Sid, AName);
	     adminpage.clickNextButton();
		 adminpage.clickNextButton();
		 adminpage.clickNextButton();
		 adminpage.selectallmodule();
		 adminpage.activationISO();
		 
	 
	 
}
	
	
	
	
	
	


@When("FD CARDNET processor select the Add User option")
public void fd_cardnet_processor_select_the_add_user_option() throws InterruptedException {
    
	
	
	adminpage.AddUser();
	
	
	
	
	
	
	
	
	
	
}

@When("user is boarded a Admin user FD CARDNET processor given sheetname {string} and rownumber {int}")
public void user_is_boarded_a_admin_user_fd_cardnet_processor_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
   
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("\\Users\\vigneshwaran\\Documents\\Automation testing\\FDDetail.xlsx", SheetName);


	 String email = testData.get(rowNumber).get("mail2");
	 String UserName = testData.get(rowNumber).get("usname2");
	 String Phone = testData.get(rowNumber).get("Phone2");
	 String firstName = testData.get(rowNumber).get("firstname2");
	 String lastName = testData.get(rowNumber).get("lastname2");
	 adminpage.AddUserDetail(email, UserName, Phone, firstName, lastName);
	
	 adminpage.AddUserActivation();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

@When("FD CARDNET processor to select the Add Customer option in User Level")
public void fd_cardnet_processor_to_select_the_add_customer_option_in_user_level() throws InterruptedException {
   
	
	
	adminpage.userLevelUM();
	adminpage.addISO();
	adminpage.addcust();
	
	
	
	
	
	
}

@When("user is boarded in a userlevel FD CARDNET Contact Information ISO given sheetname {string} and rownumber {int}")
public void user_is_boarded_in_a_userlevel_fd_cardnet_contact_information_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
    
	
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("\\Users\\vigneshwaran\\Documents\\Automation testing\\FDDetail.xlsx", SheetName);
	
	
	 String custName = testData.get(rowNumber).get("custname2");
		
	 String email = testData.get(rowNumber).get("UserLevelMail");
	 String UserName = testData.get(rowNumber).get("UserLevelname");
	 String Phone = testData.get(rowNumber).get("UserLevelphone");
	 String firstName = testData.get(rowNumber).get("UserLevelfirstname");
	 String lastName = testData.get(rowNumber).get("UserLevellastname");
	 String address = testData.get(rowNumber).get("UserLeveladd");
	 String zipcode = testData.get(rowNumber).get("UserLevelzip");
	 String city = testData.get(rowNumber).get("UserLevelcit");
	
	 adminpage.userLevelISO2(custName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
	 adminpage.clickNextButton();
	 adminpage.DPFiscal();
	
	
}

@When("user is boarded in a userlevel FD CARDNET Processor Info ISO given sheetname {string} and rownumber {int}")
public void user_is_boarded_in_a_userlevel_fd_cardnet_processor_info_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
   
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("\\Users\\vigneshwaran\\Documents\\Automation testing\\FDDetail.xlsx", SheetName);
	 
	 String Tid = testData.get(rowNumber).get("TPPId");
		
	 String Sid = testData.get(rowNumber).get("ServiceId");
	 String AName = testData.get(rowNumber).get("AppName");
	 
	        adminpage.FDCARDNET(Tid, Sid, AName);
	        adminpage.clickNextButton();
			adminpage.clickNextButton();
			adminpage.clickNextButton();
			adminpage.selectallmodule();
			adminpage.userLevelactivationISO2();
	
	
	
}

@When("FD BUYPASS	processor to select the Add Customer option")
public void fd_buypass_processor_to_select_the_add_customer_option() throws InterruptedException {
	 adminpage.addISO();
	 adminpage.addcust();
	
	
	
}

@When("user is boarded a Contact Information FD BUYPASS Iso given sheetname {string} and rownumber {int}")
public void user_is_boarded_a_contact_information_fd_buypass_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
    
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\BUYPASS.xlsx", SheetName);


	 String custName = testData.get(rowNumber).get("cust");
	
	 String email = testData.get(rowNumber).get("mail");
	 String UserName = testData.get(rowNumber).get("usname");
	 String Phone = testData.get(rowNumber).get("Phone");
	 String firstName = testData.get(rowNumber).get("firstname");
	 String lastName = testData.get(rowNumber).get("lastname");
	 String address = testData.get(rowNumber).get("addres");
	 String zipcode = testData.get(rowNumber).get("zipcod");
	 String city = testData.get(rowNumber).get("cit");
	
	 adminpage.createISO(custName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
		
		adminpage.clickNextButton();
		adminpage.BUYPASSProcessorType();
	
	
	
	 
		 
	
	
}

@When("user is boarded a Processor Info  FD BUYPASS Iso given sheetname {string} and rownumber {int}")
public void user_is_boarded_a_processor_info_fd_buypass_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\BUYPASS.xlsx", SheetName);
	 
	 String Tid = testData.get(rowNumber).get("TPPId");
		
	 String Sid = testData.get(rowNumber).get("ServiceId");
	 String AName = testData.get(rowNumber).get("AppName");
	 
	     adminpage.FDBUYPASS(Tid, Sid, AName);
	     adminpage.clickNextButton();
		 adminpage.clickNextButton();
		 adminpage.clickNextButton();
		 adminpage.selectallmodule();
		 adminpage.activationISO();
	
	
	
}

@When("FD BUYPASS processor select the Add User option")
public void fd_buypass_processor_select_the_add_user_option() throws InterruptedException {
    
	adminpage.AddUser();
	
	
	
}

@When("user is boarded a Admin user FD BUYPASS processor given sheetname {string} and rownumber {int}")
public void user_is_boarded_a_admin_user_fd_buypass_processor_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\BUYPASS.xlsx", SheetName);


	 String email = testData.get(rowNumber).get("mail2");
	 String UserName = testData.get(rowNumber).get("usname2");
	 String Phone = testData.get(rowNumber).get("Phone2");
	 String firstName = testData.get(rowNumber).get("firstname2");
	 String lastName = testData.get(rowNumber).get("lastname2");
	 adminpage.AddUserDetail(email, UserName, Phone, firstName, lastName);
	
	 adminpage.AddUserActivation();
	
}

@When("FD BUYPASS processor to select the Add Customer option in User Level")
public void fd_buypass_processor_to_select_the_add_customer_option_in_user_level() throws InterruptedException {
    
	
	adminpage.userLevelUM();
	adminpage.addISO();
	adminpage.addcust();
	
	
}

@When("user is boarded in a userlevel FD BUYPASS Contact Information ISO given sheetname {string} and rownumber {int}")
public void user_is_boarded_in_a_userlevel_fd_buypass_contact_information_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("\\Users\\vigneshwaran\\Documents\\Automation testing\\FDDetail.xlsx", SheetName);
	
	
	 String custName = testData.get(rowNumber).get("custname2");
		
	 String email = testData.get(rowNumber).get("UserLevelMail");
	 String UserName = testData.get(rowNumber).get("UserLevelname");
	 String Phone = testData.get(rowNumber).get("UserLevelphone");
	 String firstName = testData.get(rowNumber).get("UserLevelfirstname");
	 String lastName = testData.get(rowNumber).get("UserLevellastname");
	 String address = testData.get(rowNumber).get("UserLeveladd");
	 String zipcode = testData.get(rowNumber).get("UserLevelzip");
	 String city = testData.get(rowNumber).get("UserLevelcit");
	
	 adminpage.userLevelISO2(custName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
	 adminpage.clickNextButton();
	 adminpage.DPFiscal();
	
}

@When("user is boarded in a userlevel FD BUYPASS Processor Info ISO given sheetname {string} and rownumber {int}")
public void user_is_boarded_in_a_userlevel_fd_buypass_processor_info_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("\\Users\\vigneshwaran\\Documents\\Automation testing\\FDDetail.xlsx", SheetName);
	 
	 String Tid = testData.get(rowNumber).get("TPPId");
		
	 String Sid = testData.get(rowNumber).get("ServiceId");
	 String AName = testData.get(rowNumber).get("AppName");
	 
	        adminpage.FDCARDNET(Tid, Sid, AName);
	        adminpage.clickNextButton();
			adminpage.clickNextButton();
			adminpage.clickNextButton();
			adminpage.selectallmodule();
			adminpage.userLevelactivationISO2();
}

@When("FD NASHVILLE	processor to select the Add Customer option")
public void fd_nashville_processor_to_select_the_add_customer_option() throws InterruptedException {
	 adminpage.addISO();
	 adminpage.addcust();
}

@When("user is boarded a Contact Information FD NASHVILLE Iso given sheetname {string} and rownumber {int}")
public void user_is_boarded_a_contact_information_fd_nashville_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\NASHVILLE.xlsx", SheetName);


	 String custName = testData.get(rowNumber).get("cust");
	
	 String email = testData.get(rowNumber).get("mail");
	 String UserName = testData.get(rowNumber).get("usname");
	 String Phone = testData.get(rowNumber).get("Phone");
	 String firstName = testData.get(rowNumber).get("firstname");
	 String lastName = testData.get(rowNumber).get("lastname");
	 String address = testData.get(rowNumber).get("addres");
	 String zipcode = testData.get(rowNumber).get("zipcod");
	 String city = testData.get(rowNumber).get("cit");
	
	 adminpage.createISO(custName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
		
		adminpage.clickNextButton();
		adminpage.NASHVILLEProcessorType();
}

@When("user is boarded a Processor Info  FD NASHVILLE Iso given sheetname {string} and rownumber {int}")
public void user_is_boarded_a_processor_info_fd_nashville_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
   
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\NASHVILLE.xlsx", SheetName);
	 
	 String Tid = testData.get(rowNumber).get("TPPId");
		
	 String Sid = testData.get(rowNumber).get("ServiceId");
	 String AName = testData.get(rowNumber).get("AppName");
	 
	     adminpage.FDNASHVILLE(Tid, Sid, AName);
	     adminpage.clickNextButton();
		 adminpage.clickNextButton();
		 adminpage.clickNextButton();
		 adminpage.selectallmodule();
		 adminpage.activationISO();
	
	
	
	
	
	
	
	
}

@When("FD NASHVILLE processor select the Add User option")
public void fd_nashville_processor_select_the_add_user_option() throws InterruptedException {

	adminpage.AddUser();
	
}

@When("user is boarded a Admin user FD NASHVILLE processor given sheetname {string} and rownumber {int}")
public void user_is_boarded_a_admin_user_fd_nashville_processor_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\NASHVILLE.xlsx", SheetName);


	 String email = testData.get(rowNumber).get("mail2");
	 String UserName = testData.get(rowNumber).get("usname2");
	 String Phone = testData.get(rowNumber).get("Phone2");
	 String firstName = testData.get(rowNumber).get("firstname2");
	 String lastName = testData.get(rowNumber).get("lastname2");
	 adminpage.AddUserDetail(email, UserName, Phone, firstName, lastName);
	
	 adminpage.AddUserActivation();
	
}

@When("FD NASHVILLE processor to select the Add Customer option in User Level")
public void fd_nashville_processor_to_select_the_add_customer_option_in_user_level() throws InterruptedException {

	adminpage.userLevelUM();
	adminpage.addISO();
	adminpage.addcust();
}

@When("user is boarded in a userlevel FD NASHVILLE Contact Information ISO given sheetname {string} and rownumber {int}")
public void user_is_boarded_in_a_userlevel_fd_nashville_contact_information_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\NASHVILLE.xlsx", SheetName);
	
	
	 String custName = testData.get(rowNumber).get("custname2");
		
	 String email = testData.get(rowNumber).get("UserLevelMail");
	 String UserName = testData.get(rowNumber).get("UserLevelname");
	 String Phone = testData.get(rowNumber).get("UserLevelphone");
	 String firstName = testData.get(rowNumber).get("UserLevelfirstname");
	 String lastName = testData.get(rowNumber).get("UserLevellastname");
	 String address = testData.get(rowNumber).get("UserLeveladd");
	 String zipcode = testData.get(rowNumber).get("UserLevelzip");
	 String city = testData.get(rowNumber).get("UserLevelcit");
	
	 adminpage.userLevelISO2(custName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
	 adminpage.clickNextButton();
	 adminpage.DPFiscal();
	
}

@When("user is boarded in a userlevel FD NASHVILLE Processor Info ISO given sheetname {string} and rownumber {int}")
public void user_is_boarded_in_a_userlevel_fd_nashville_processor_info_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\NASHVILLE.xlsx", SheetName);
	 
	 String Tid = testData.get(rowNumber).get("TPPId");
		
	 String Sid = testData.get(rowNumber).get("ServiceId");
	 String AName = testData.get(rowNumber).get("AppName");
	 
	        adminpage.FDNASHVILLE(Tid, Sid, AName);
	        adminpage.clickNextButton();
			adminpage.clickNextButton();
			adminpage.clickNextButton();
			adminpage.selectallmodule();
			adminpage.userLevelactivationISO2();
}

@When("FD POSTILION	processor to select the Add Customer option")
public void fd_postilion_processor_to_select_the_add_customer_option() throws InterruptedException {
	
	adminpage.addISO();
	 adminpage.addcust();
	
	
	
   }

@When("user is boarded a Contact Information FD POSTILION Iso given sheetname {string} and rownumber {int}")
public void user_is_boarded_a_contact_information_fd_postilion_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\POSTILION.xlsx", SheetName);


	 String custName = testData.get(rowNumber).get("cust");
	
	 String email = testData.get(rowNumber).get("mail");
	 String UserName = testData.get(rowNumber).get("usname");
	 String Phone = testData.get(rowNumber).get("Phone");
	 String firstName = testData.get(rowNumber).get("firstname");
	 String lastName = testData.get(rowNumber).get("lastname");
	 String address = testData.get(rowNumber).get("addres");
	 String zipcode = testData.get(rowNumber).get("zipcod");
	 String city = testData.get(rowNumber).get("cit");
	
	 adminpage.createISO(custName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
		
		adminpage.clickNextButton();
		adminpage.POSTILIONProcessorType();
	
	
	
}

@When("user is boarded a Processor Info  FD POSTILION Iso given sheetname {string} and rownumber {int}")
public void user_is_boarded_a_processor_info_fd_postilion_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\POSTILION.xlsx", SheetName);
	 
	 String Tid = testData.get(rowNumber).get("TPPId");
		
	 String Sid = testData.get(rowNumber).get("ServiceId");
	 String AName = testData.get(rowNumber).get("AppName");
	 
	     adminpage.FDPOSTILION(Tid, Sid, AName);
	     adminpage.clickNextButton();
		 adminpage.clickNextButton();
		 adminpage.clickNextButton();
		 adminpage.selectallmodule();
		 adminpage.activationISO();
}

@When("FD POSTILION processor select the Add User option")
public void fd_postilion_processor_select_the_add_user_option() throws InterruptedException {
	adminpage.AddUser();
}

@When("user is boarded a Admin user FD POSTILION processor given sheetname {string} and rownumber {int}")
public void user_is_boarded_a_admin_user_fd_postilion_processor_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\POSTILION.xlsx", SheetName);


	 String email = testData.get(rowNumber).get("mail2");
	 String UserName = testData.get(rowNumber).get("usname2");
	 String Phone = testData.get(rowNumber).get("Phone2");
	 String firstName = testData.get(rowNumber).get("firstname2");
	 String lastName = testData.get(rowNumber).get("lastname2");
	 adminpage.AddUserDetail(email, UserName, Phone, firstName, lastName);
	
	 adminpage.AddUserActivation();
}

@When("FD POSTILION processor to select the Add Customer option in User Level")
public void fd_postilion_processor_to_select_the_add_customer_option_in_user_level() throws InterruptedException {
	adminpage.userLevelUM();
	adminpage.addISO();
	adminpage.addcust();
}

@When("user is boarded in a userlevel FD POSTILION Contact Information ISO given sheetname {string} and rownumber {int}")
public void user_is_boarded_in_a_userlevel_fd_postilion_contact_information_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\POSTILION.xlsx", SheetName);
	
	
	 String custName = testData.get(rowNumber).get("custname2");
		
	 String email = testData.get(rowNumber).get("UserLevelMail");
	 String UserName = testData.get(rowNumber).get("UserLevelname");
	 String Phone = testData.get(rowNumber).get("UserLevelphone");
	 String firstName = testData.get(rowNumber).get("UserLevelfirstname");
	 String lastName = testData.get(rowNumber).get("UserLevellastname");
	 String address = testData.get(rowNumber).get("UserLeveladd");
	 String zipcode = testData.get(rowNumber).get("UserLevelzip");
	 String city = testData.get(rowNumber).get("UserLevelcit");
	
	 adminpage.userLevelISO2(custName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
	 adminpage.clickNextButton();
	 adminpage.DPFiscal();
	 adminpage.POSTILIONProcessorType();
}

@When("user is boarded in a userlevel FD POSTILION Processor Info ISO given sheetname {string} and rownumber {int}")
public void user_is_boarded_in_a_userlevel_fd_postilion_processor_info_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\POSTILION.xlsx", SheetName);
	 
	 String Tid = testData.get(rowNumber).get("TPPId");
		
	 String Sid = testData.get(rowNumber).get("ServiceId");
	 String AName = testData.get(rowNumber).get("AppName");
	 
	        adminpage.FDPOSTILION(Tid, Sid, AName);
	        adminpage.clickNextButton();
			adminpage.clickNextButton();
			adminpage.clickNextButton();
			adminpage.selectallmodule();
			adminpage.userLevelactivationISO2();
}
	
	
	
}







	
	
	
	
	
	
	
	
