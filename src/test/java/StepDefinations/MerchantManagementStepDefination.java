package StepDefinations;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.MerchantManagementPage;
import com.pages.UserManagementPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MerchantManagementStepDefination {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private MerchantManagementPage merchantmanagementpage;
	private HomePage homePage;

	@Given("user is on MerchantManagementPage")
	public void user_is_on_merchant_management_page(DataTable credTable) throws InterruptedException {

		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://demo.valorpaytech.com/signin");
		homePage = loginPage.doLogin(userName, password);
		merchantmanagementpage = homePage.merchantclick();

	}

	@When("click to the button")
	public void click_to_the_button() throws InterruptedException {
		merchantmanagementpage.add();

	}

	@When("user clicks Full Board")
	public void user_clicks_full_board() throws InterruptedException {
		merchantmanagementpage.fullbr();

	}

	@When("merchant boarding contact details from given sheetname {string} and rownumber {int}")
	public void merchant_boarding_contact_details_from_given_sheetname_and_rownumber(String SheetName,
			Integer rowNumber) throws InterruptedException, InvalidFormatException, IOException {

		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(
				"C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\merchantsheet.xlsx", SheetName);

		String dbaName = testData.get(rowNumber).get("DBA");

		String legname = testData.get(rowNumber).get("LegalName");
		String firname = testData.get(rowNumber).get("FirstName");
		String lasname = testData.get(rowNumber).get("LastName");
		String email = testData.get(rowNumber).get("Email");
		String usname = testData.get(rowNumber).get("UserName");
		String phonel = testData.get(rowNumber).get("Phon");
		String adrss = testData.get(rowNumber).get("Address");
		String zipco = testData.get(rowNumber).get("ZipCode");
		String cit = testData.get(rowNumber).get("City");

		merchantmanagementpage.creatmerchant(dbaName, legname, firname, lasname, email, usname, phonel, adrss, zipco,
				cit);

	}

	@When("User is click to the next button")
	public void user_is_click_to_the_next_button() throws InterruptedException {

		merchantmanagementpage.tzone();

		merchantmanagementpage.clickNextButton();

	}

	@When("user files the store details from given sheetname")
	public void user_files_the_store_details_from_given_sheetname() throws InterruptedException {
		
		
		merchantmanagementpage.tz2();
     	merchantmanagementpage.m2();
     	merchantmanagementpage.adStore();
		
	}
	
	
	@When("user files the device types and processor")
	public void user_files_the_device_types_and_processor() throws InterruptedException {
		
		merchantmanagementpage.Devic();
		merchantmanagementpage.proc();
		merchantmanagementpage.dname();
		
		
	    
	}

	@When("user files the device MIT and TID  details from given sheetname {string} and rownumber {int}")
	public void user_files_the_device_mit_and_tid_details_from_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException  {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(
				"C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\merchantsheet.xlsx", SheetName);
		

		String mi = testData.get(rowNumber).get("MID");
		String vn = testData.get(rowNumber).get("Vnumber");
		String st = testData.get(rowNumber).get("storeno");
		String te = testData.get(rowNumber).get("TermNo");
		String ag = testData.get(rowNumber).get("AgentBankNumber");
		String ch = testData.get(rowNumber).get("chain");
		String age = testData.get(rowNumber).get("Agent");
		
		merchantmanagementpage.tsysdata(mi, vn, st, te, ag, ch, age);
	}
	


	@When("User is click to  next button")
	public void user_is_click_to_next_button() throws InterruptedException {
		merchantmanagementpage.dnxt();

	}

	@When("user is select to all the modules")
	public void user_is_select_to_all_the_modules() {

	}
	

}
