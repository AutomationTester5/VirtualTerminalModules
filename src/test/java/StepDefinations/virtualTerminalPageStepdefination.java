package StepDefinations;

import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.VirtualTerminalPage;
import com.qa.factory.DriverFactory;
import com.testing.framework.EmailUtils;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class virtualTerminalPageStepdefination {
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private VirtualTerminalPage virtualterminalpage;
	private HomePage homePage;
	
	
	
	

	@Given("user is on VirtualTerminalPage")
	public void user_is_on_virtual_terminal_page(DataTable credTable) throws InterruptedException {

		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://uat.valorpaytech.com/signin");
		homePage = loginPage.doLogin(userName, password);
		virtualterminalpage = homePage.virtualclick();
		

	}
	
	
	
	@When("click to the Virtual Terminal modules")
	public void click_to_the_virtual_terminal_modules() {
		
		virtualterminalpage.epiD();
	    
	}

	@When("click to EPI type and transation types")
	public void click_to_epi_type_and_transation_types() throws InterruptedException {
		virtualterminalpage.amount();
	    
	}

	@When("enter the amount")
	public void enter_the_amount() throws InterruptedException {
		
		virtualterminalpage.cardNumber();
		
	   
	}

	@When("give to card number and CVV and MM\\/YY and Cardholder name")
	public void give_to_card_number_and_cvv_and_mm_yy_and_cardholder_name() throws InterruptedException {
		virtualterminalpage.CVV();
		virtualterminalpage.cardHolderName();
	}

	@When("click to the process")
	public void click_to_the_process() throws InterruptedException {
		virtualterminalpage.Process();
	}

	
	@When("multiple sale transaction")
	public void multiple_sale_transaction() throws InterruptedException {
		for(int i = 0; i<0; i++) {
		virtualterminalpage.amount();
	    virtualterminalpage.cardNumber();
	    virtualterminalpage.CVV();
	    virtualterminalpage.cardHolderName();
	    virtualterminalpage.Process();
			 }
			}

	
	@When("click the authorization transaction")
	public void click_the_authorization_transaction() throws InterruptedException {
		for(int i = 0; i<1; i++) {
		virtualterminalpage.authoriz();
	  //  virtualterminalpage.cardNumber();
	    virtualterminalpage.CVV();
	    virtualterminalpage.cardHolderName();
	    virtualterminalpage.Process();
	    virtualterminalpage.Txn();
		}
		
		}
	

	
		@When("click to refund transaction")
		public void click_to_refund_transaction() throws Exception {
			
			virtualterminalpage.refund();
			
		
			
		}
			
		@When("click to the einvoice transaction with paynow link,valor lite QR,flexsible,never expiry")
		public void click_to_the_einvoice_transaction_with_paynow_link_valor_lite_qr_flexsible_never_expiry() throws Exception {
			
			virtualterminalpage.Einvoice();
			virtualterminalpage.paynow();
			//virtualterminalpage.paynowwithFlexible();
			//virtualterminalpage.paynowwithNeverExpire();
			//virtualterminalpage.paynowBothFlexandNever();
			//virtualterminalpage.valorLiteQR();
			virtualterminalpage.manageEinvoice();
			virtualterminalpage.transactionsfilteringoptinclick();
			virtualterminalpage.statusfilteringoptinclick();
			virtualterminalpage.IDFilteringOptinclick();
			virtualterminalpage.srchClick();
			virtualterminalpage.gifttxn();
		}

		
		
		
		
		

		@When("click to the cash")
		public void click_to_the_cash() throws Exception {
			virtualterminalpage.cashTxn();
			
		}
	
		
		
		
	
	
}



	
	


