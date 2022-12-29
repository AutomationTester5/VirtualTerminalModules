package StepDefinations;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.SubisoCreatePage;
import com.pages.UserManagementPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SubIsoCreatePageStepdefination {
	
	
	  
    private LoginPage  loginPage = new LoginPage(DriverFactory.getDriver());
    private SubisoCreatePage subisocreatepage;
    private HomePage homePage;
    
    @Given("user is on SubisoCreatePage")
    public void user_is_on_subiso_create_page(DataTable credTable) throws InterruptedException {
       
        List<Map<String, String>> credList = credTable.asMaps();
        String userName = credList.get(0).get("username");
        String password = credList.get(0).get("password");
         DriverFactory.getDriver()
         .get("https://uat.valorpaytech.com/signin");
         homePage = loginPage.doLogin(userName, password);
         subisocreatepage=homePage.sbclick();
        
    }
	
	
    @When("Create SubIso")
    public void create_sub_iso() throws InterruptedException {
    	
	
	
    	  subisocreatepage.SubISO();
	     subisocreatepage.clickNextButton();
	     subisocreatepage.processorinfo();
	    
	     subisocreatepage.selectallmodule();
	     subisocreatepage.activationISO();
	    
	    
	    
	        
	    }
		
	@When("create the subiso user with data")
	public void create_the_subiso_user_with_data() throws InterruptedException {
		subisocreatepage.SubIsoUser();
		
		
	}

	@When("Delete Sub Iso and Delete Sub Iso User")
	public void delete_sub_iso_and_delete_sub_iso_user() throws InterruptedException {
		subisocreatepage.DeleteSubIso();
		
		
		
		
	}

		
	    

	


	
	
	
	
	

}

