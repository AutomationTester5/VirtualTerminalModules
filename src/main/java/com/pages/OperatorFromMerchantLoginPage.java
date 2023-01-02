package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OperatorFromMerchantLoginPage {

	private WebDriver driver;
	
	private By userMgt = By.xpath("//span[contains(text(),'User Management')]");
	
	private By Usermgtadd = By.xpath("//span[contains(text(),'Add')]");
	private By Addoperator = By.xpath("//span[normalize-space()='Add Operator']");

	 private By continueButton = By.xpath("//span[@class='MuiButton-label']");
	 private By loginButton = By.xpath("//span[contains(text(),'YES')]");
	 private By MerchantManagement = By.xpath("//span[contains(text(),'Merchant Management')]");
	 private By Search = By.id("outlined-name");
	 
	 //card detail:
	 private By epitype =  By.xpath("//span[@class='MuiButton-label']//div");
		private By sale = By.xpath("//input[@value='0']");
		private By amnt = By.name("amount");
		private By cdnumber = By.xpath("//input[@placeholder='Card number*']");
		private By cvv = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div/div/div/div[2]/div/div[3]/div/div/div/form/div[1]/div[2]/input");
		private By mmyy = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div/div/div/div[2]/div/div[3]/div/div/div/form/div[2]/div[3]/input");
		private By crdholdr =By.name("_chn");
		private By prcss = By.xpath("//div[@class='card-btn']//span[@class='MuiButton-label']");
		private By prc = By.xpath("//*[@id=\"body\"]/div[2]/div[3]/div/div[3]/button[2]/span[1]/span");
		private By phn	= By.name("phoneNo");
		private By close = By.xpath("//span[contains(text(),'Close')]");
		private By em = By.name("email");
	 //Tiels:
	 private By tils = By.xpath("//span[normalize-space()='Merchants']");
	 private By Threedot = By.xpath("(//span[@class='MuiIconButton-label'])[7]");
	 
	    private By email = By.xpath("//input[@id='email']");
	    private By UserName = By.xpath("//input[@id='user_Name']");
	    private By Phone = By.xpath("//input[@id='Phone']");
	    private By firstName = By.id("firstName");
	    private By lastName = By.xpath("//input[@id='lastName']");
	    private By nextBtn = By.xpath("//span[contains(text(),'Next')]");
	    private By allowRefundTxn = By.xpath("//input[@value='Allow Refund transaction']");
	    private By AddCashTxn = By.xpath("//input[@value='Allow Addcash transaction']");
	    private By RecurringPayment = By.xpath("//input[@value='Recurring payment conversion']");
	    private By submitbutton  = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained jr-btn next-btn MuiButton-containedPrimary'][2]");
	//Email Activation:
	    private By ed = By.id("identifierId");
		private By ps = By.name("Passwd");
	    private By registration = By.xpath("//div[@role='link']//div//div//span//span[contains(text(),'Registration')]");
	    private By  activate = By.xpath("//u[normalize-space()='Click Here For Activation']");
	
	//Heirachy:
	  private By Actions = By.xpath("(//button[@type='button'])[6]");
	  
	
	
	
	public OperatorFromMerchantLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Addbutton() {
		
		driver.findElement(Usermgtadd).click();
		driver.findElement(Addoperator).click();
		
		
		
	}
	
	
	
	
	
	
	public void operatorBoardingDetails() throws InterruptedException {
		
		driver.findElement(email).sendKeys("valorautomation+autoOperator@gmail.com");
		driver.findElement(UserName).sendKeys("ISOOperator");
		driver.findElement(Phone).sendKeys("7639552076");
		driver.findElement(firstName).sendKeys("Automation");
		driver.findElement(lastName).sendKeys("Operator");
		driver.findElement(nextBtn).click();
		driver.findElement(submitbutton).click();
		
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
	     jse.executeScript("window.open()");
	   //  driver.get("https://accounts.google.com/");
	     
	     ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	     driver.switchTo().window(tabs.get(1));
	     
	      driver.get("https://mail.google.com/mail/u/0/#inbox");
	     
	 	driver.findElement(ed).sendKeys("valorautomation@gmail.com");
	 	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	 	Thread.sleep(3000);
	 	driver.findElement(ps).sendKeys("Amma7639552076");
	 	driver.findElement(By.id("passwordNext")).click();
	     
	      for(int i = 0; i<20; i++) {
	  		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
	  		//Thread.sleep(3000);
	  		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
	  		}
	  		
	  		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
	  		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
	  		Thread.sleep(40000);
	  		//driver.findElement(By.xpath("//body[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/span[1]")).click();
	  	    driver.findElement(By.xpath("(//span[@class='bqe'][normalize-space()='Registration'])[2]")).click();
	  	    Thread.sleep(6000);
	  		WebElement newEML =driver.findElement(By.xpath("//td[@bgcolor='transparent']//p//span"));
	  		String getEML=newEML.getAttribute("innerHTML");
	  		System.out.println(getEML);
	  	    driver.findElement(activate).click();
	  	    Thread.sleep(3000);
	  	  
	  	    // JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	  	    // jse1.executeScript("window.open()");
	  	    //ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	  		 // driver.switchTo().window(tabs.get(2));
	  		  
	  		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
			  driver.switchTo().window(tabs1.get(2));
	  		  Thread.sleep(3000);
	  		  driver.findElement(By.xpath("//div[@class='app-login-main-content']//div[1]//div[1]//input[1]")).sendKeys("Valor123");
	  		  driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Valor123");
	  		  driver.findElement(By.xpath("//button[@type='sumbit']")).click();
	  		 // ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
	  		 // driver.switchTo().window(tabs2.get(0));
	  		
	  	//driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
	  	
	  	  driver.findElement(By.id("emailtype")).sendKeys(getEML);
	  	  driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
	  	  driver.findElement(continueButton).click();
	  	  //driver.findElement(loginButton).click();
	  	  System.out.println("SUCESSFULLY BORDING FOR Your Operator  "+ " "+getEML);
	  	  
	  	  
			/*
			 * Thread.sleep(3000);
			 * driver.findElement(By.xpath("(//div[@class='quick-menu dropdown'])[3]")).
			 * click();
			 * driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
			 * 
			 * driver.close();
			 */
	  	 // Thread.sleep(3000);
	   	 //driver.findElement(By.xpath("(//div[@class='quick-menu dropdown'])[3]")).click();
	 	  //driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
	     
	  	
	  	}	
		

	public void AddOperatorFromIsoLogin() throws InterruptedException {	
		 Thread.sleep(3000);
	  	 driver.findElement(By.xpath("(//div[@class='quick-menu dropdown'])[3]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
		  driver.findElement(By.id("emailtype")).sendKeys("vigneshradhakrishnan76+piniso@gmail.com");
	 	  driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
	 	 driver.findElement(continueButton).click();
	 	 driver.findElement(loginButton).click(); 
	 	driver.findElement(MerchantManagement).click();
	 	driver.findElement(Search).sendKeys("pin parac merchant");
	 	Thread.sleep(6000);
	 	//driver.findElement(tils).click();
	 	 driver.findElement(Threedot).click();
	 	
		 List<WebElement>filter = driver.findElements(By.xpath("(//ul[@role='menu'])[1]/li"));
		  filter.get(4).click();
		 //driver.findElement(Usermgtadd).click();
		//	driver.findElement(Addoperator).click(); 
		  	
		
	}
		
		
	public void OperatorRestrict() throws InterruptedException {	
		
		driver.findElement(email).sendKeys("valorautomation+autoOperator@gmail.com");
		driver.findElement(UserName).sendKeys("RestrictOperator3");
		driver.findElement(Phone).sendKeys("7639552076");
		driver.findElement(firstName).sendKeys("Automation");
		driver.findElement(lastName).sendKeys("Operator");
		driver.findElement(nextBtn).click();
		driver.findElement(allowRefundTxn).click();
		driver.findElement(submitbutton).click();
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
	     jse.executeScript("window.open()");
	   //  driver.get("https://accounts.google.com/");
	     
	     ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	     driver.switchTo().window(tabs.get(1));
	     
	      driver.get("https://mail.google.com/mail/u/0/#inbox");
	     
	 	driver.findElement(ed).sendKeys("valorautomation@gmail.com");
	 	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	 	Thread.sleep(3000);
	 	driver.findElement(ps).sendKeys("Amma7639552076");
	 	driver.findElement(By.id("passwordNext")).click();
	     
	      for(int i = 0; i<20; i++) {
	  		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
	  		//Thread.sleep(3000);
	  		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
	  		}
	  		
	  		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
	  		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
	  		Thread.sleep(40000);
	  		//driver.findElement(By.xpath("//body[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/span[1]")).click();
	  	    driver.findElement(By.xpath("(//span[@class='bqe'][normalize-space()='Registration'])[2]")).click();
	  	    Thread.sleep(6000);
	  		WebElement newEML =driver.findElement(By.xpath("//td[@bgcolor='transparent']//p//span"));
	  		String getEML=newEML.getAttribute("innerHTML");
	  		System.out.println(getEML);
	  	    driver.findElement(activate).click();
	  	    Thread.sleep(3000);
	  	  
	  	    // JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	  	    // jse1.executeScript("window.open()");
	  	    //ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	  		 // driver.switchTo().window(tabs.get(2));
	  		  
	  		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
			  driver.switchTo().window(tabs1.get(2));
	  		  Thread.sleep(3000);
	  		  driver.findElement(By.xpath("//div[@class='app-login-main-content']//div[1]//div[1]//input[1]")).sendKeys("Valor123");
	  		  driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Valor123");
	  		  driver.findElement(By.xpath("//button[@type='sumbit']")).click();
	  		 // ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
	  		 // driver.switchTo().window(tabs2.get(0));
	  		
	  	//driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
	  	
	  	  driver.findElement(By.id("emailtype")).sendKeys(getEML);
	  	  driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
	  	  driver.findElement(continueButton).click();
	  	  //driver.findElement(loginButton).click();
	  	  System.out.println("SUCESSFULLY BORDING FOR Your Restrict Operator  "+ " "+getEML);
	}
	
	public void epiD () {
	 	   
	 	   driver.findElement(epitype).click();
	 		
			List<WebElement> terminal = driver.findElements(By.xpath("//ul[@role='menu']/li"));
		       System.out.println("this size is"+terminal.size());
		    terminal.get(2).click();
		    
	    }  
		
		public void amount()  throws InterruptedException {
			
	         
			  
		  	driver.findElement(By.xpath("//span[contains(text(),'Virtual Terminal')]")).click(); 
			driver.findElement(amnt).sendKeys("1020");
			driver.findElement(phn).sendKeys("7639552000");
			driver.findElement(em).sendKeys("Vigneshwa11ran@valorpaytech.com");
			

		}
		

		public void cardNumber()  throws InterruptedException {
	  	  
			driver.findElement(cdnumber).sendKeys("4111111111111111");
			
		}
		
		public void CVV()  throws InterruptedException {
		  	  
			driver.findElement(cvv).sendKeys("999");
			  
		    driver.findElement(mmyy).sendKeys("12/25");
		}
		
		public void cardHolderName()  throws InterruptedException {
		  	  
			driver.findElement(crdholdr).sendKeys("Vignesh");
			  
		
		}
		public void Process()  throws InterruptedException {
		  	  
			driver.findElement(prcss).click();
			driver.findElement(prc).click();
			driver.findElement(close).click();
		
		}
		
		public void Txn() throws InterruptedException {
			
			driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
			driver.findElement(By.id("outlined-name")).sendKeys("1111");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@title='Options']")).click();
			List<WebElement> Recurring = driver.findElements(By.xpath("//ul[@role='menu']/li"));
		    System.out.println("Successfully show the convert to recurring"+Recurring.size());
		    Recurring.get(5).click();
		    
			
			}
	  	  
	  
	  
		public void officeHierarchy() throws InterruptedException {
			 Thread.sleep(3000);
		  	 driver.findElement(By.xpath("(//div[@class='quick-menu dropdown'])[3]")).click();
			  driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
			  driver.findElement(By.id("emailtype")).sendKeys("vigneshradhakrishnan76+piniso@gmail.com");
		 	  driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
		 	 driver.findElement(continueButton).click();
		 	 driver.findElement(loginButton).click(); 
		 	 driver.findElement(userMgt).click();
			
			driver.findElement(Actions).click();
			List<WebElement> showOffice = driver.findElements(By.xpath("//ul[@role='menu']/li"));
			showOffice.get(7).click();
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
}
