package StepDefinations;

import java.util.List;
import java.util.Map;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.OperatorFromMerchantLoginPage;
import com.pages.SubisoCreatePage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class OperatorFromMerchantLoginStepdefination {
	
	
	
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private OperatorFromMerchantLoginPage operatorfrommerchantlogipage;
	private HomePage homePage;

	@Given("user is on OperatorFromMerchantLoginPage")
	public void user_is_on_operator_from_merchant_login_page(DataTable credTable) throws InterruptedException {

		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://uat.valorpaytech.com/signin");
		homePage = loginPage.doLogin(userName, password);
		operatorfrommerchantlogipage = homePage.OPclick();


}	
	

@When("user click on add button")
public void user_click_on_add_button() {
	
	operatorfrommerchantlogipage.Addbutton();
	
    
}

@When("user given the contact information")
public void user_given_the_contact_information() throws InterruptedException {
	
	operatorfrommerchantlogipage.operatorBoardingDetails();
	
    
}

@When("Add the Opertaor for Merchant X from ISO login and Ad")
public void add_the_opertaor_for_merchant_x_from_iso_login_and_ad() throws InterruptedException {
	operatorfrommerchantlogipage.AddOperatorFromIsoLogin();
	operatorfrommerchantlogipage.Addbutton();
	operatorfrommerchantlogipage.operatorBoardingDetails();
	
	
    
}

@When("Operator from Restrict the Refund , Covert to recurring and check the modules availability of Operator")
public void operator_from_restrict_the_refund_covert_to_recurring_and_check_the_modules_availability_of_operator() throws InterruptedException {
	
	operatorfrommerchantlogipage.Addbutton();
	operatorfrommerchantlogipage.OperatorRestrict();
	operatorfrommerchantlogipage.amount();
	operatorfrommerchantlogipage.cardNumber();
	operatorfrommerchantlogipage.CVV();
	operatorfrommerchantlogipage.cardHolderName();
	operatorfrommerchantlogipage.Process();
	operatorfrommerchantlogipage.Txn();
    
}

@When("Verify office hierarchy")
public void verify_office_hierarchy() throws InterruptedException {
	operatorfrommerchantlogipage.officeHierarchy();
	
	
	
	
	
	
    
}
	
	
	
	
	
	

}
