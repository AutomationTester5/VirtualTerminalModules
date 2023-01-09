package StepDefinations;



import java.io.IOException;
import java.util.List;
import java.util.Map;



import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;



import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.UserManagementPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;



import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class UserManagementPageStepDefination {
    
    private LoginPage  loginPage = new LoginPage(DriverFactory.getDriver());
    private UserManagementPage usermanagementPage;
    private HomePage homePage;
    
    @Given("user is on UserManagementPage")
    public void user_is_on_user_management_page(DataTable credTable) throws InterruptedException {
       
        List<Map<String, String>> credList = credTable.asMaps();
        String userName = credList.get(0).get("username");
        String password = credList.get(0).get("password");
         DriverFactory.getDriver()
         .get("https://uat.valorpaytech.com/signin");
         homePage = loginPage.doLogin(userName, password);
         usermanagementPage =homePage.umclick();
        
    }



   @When("user clicks add button")
    public void user_clicks_add_button() throws InterruptedException {
        
        usermanagementPage.addISO();
    }                     



   @When("user clicks add customer")
    public void user_clicks_add_customer() throws InterruptedException {
        usermanagementPage.addcust();
        
    }
    
   
   @When("user files the details from")
   public void user_files_the_details_from() throws InterruptedException {
       
	   usermanagementPage.createISO();
            
            
         
            }
    
    
  



   @When("User clicks the next button")
    public void user_clicks_the_next_button() {
        usermanagementPage.clickNextButton();
    }
    


   @When("user files the processor details")
   public void user_files_the_processor_details() {
    
	   usermanagementPage.Processordetails();
    
     usermanagementPage.clickNextButton();
    
    
}



@When("user click the next button")
public void user_click_the_next_button() {
    usermanagementPage.clickNextButton();
    
}



@When("user select all the modules")
public void user_select_all_the_modules() {
    usermanagementPage.selectallmodule();
    
}      
        
     
    

@Then("activation on that iso in email")
public void activation_on_that_iso_in_email() throws InterruptedException {
	
	usermanagementPage.activationISO();
	usermanagementPage.AddUser();
	usermanagementPage.activationISO();
	usermanagementPage.AddUser();
	
	
}
}









