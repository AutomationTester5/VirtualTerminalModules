package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SubisoCreatePage {
	private WebDriver driver;
	
	 private By continueButton = By.xpath("//span[@class='MuiButton-label']");
	 private By Dellogin = By.xpath("//span[contains(text(),'Yes')]");
	 private By loginButton = By.xpath("//span[contains(text(),'YES')]");
	 

	   private By userMgtadd = By.xpath("//span[contains(text(),'User Management')]");
	    private By umaddCust = By.xpath("//span[contains(text(),'ADD CUSTOMER')]");
	    private By add = By.xpath("(//button[@type='button'])[5]");
	    private By custName = By.name("DBA");
	    private By email = By.xpath("//input[@id='email']");
	    private By UserName = By.xpath("//input[@id='user_Name']");
	    private By Phone = By.xpath("//input[@id='Phone']");
	    private By firstName = By.id("firstName");
	    private By lastName = By.xpath("//input[@id='lastName']");
	    private By address = By.xpath("//input[@id='address']");
	    private By zipCode = By.xpath("//input[@name='zipCode']");
	    private By city = By.xpath("//input[@id='city']");
	    // private By state =By.xpath("//div[@class='css-1hwfws3']");
	    private By nextBtn = By.xpath("//span[contains(text(),'Next')]");
	    private By submitbutton  = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained jr-btn next-btn MuiButton-containedPrimary'][2]");
	    private By selectmodule = By.xpath("//input[@value='jason']");
	
	  //ActivatISO:   
	    private By ed = By.id("identifierId");
		private By ps = By.name("Passwd");
	    private By registration = By.xpath("//div[@role='link']//div//div//span//span[contains(text(),'Registration')]");
	    private By  activate = By.xpath("//u[normalize-space()='Click Here For Activation']");
	  //ADDISOUSER
	    private By subuser = By.xpath("//span[normalize-space()='Add USER']");
	    private By Threedot = By.xpath("(//button[@aria-label='More'])[3]");
	
	//search box:
	    private By Search = By.id("outlined-name");
	
	
	
	
	public SubisoCreatePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void ISOUSER() throws InterruptedException {
		 //driver.findElement(userMgtadd).click();
		 driver.findElement(add).click();
		 driver.findElement(By.xpath("//span[normalize-space()='Add USER']")).click();
		 
		
		driver.findElement(email).sendKeys("valorautomation+addSubIsoUser@gmail.com");
	     driver.findElement(UserName).sendKeys("SucsISOUSER3");
	     driver.findElement(Phone).sendKeys("7655441254");
	     driver.findElement(firstName).sendKeys("USERVIGNESH");
	     driver.findElement(lastName).sendKeys("WARAN");
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
	  	  System.out.println("SUCESSFULLY BORDING FOR  "+ " "+getEML);
	  	  
	  	  
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
		
		

	

public void SubISO() throws InterruptedException {
	
	//driver.findElement(By.id("emailtype")).sendKeys("vigneshwaransanityiso39");
	//  driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
	//  driver.findElement(continueButton).click();
	
	driver.findElement(userMgtadd).click();
//driver.findElement(By.xpath("userMgtclick")).click();
	Thread.sleep(3000);
driver.findElement(add).click();
driver.findElement(By.xpath("//span[normalize-space()='Add SUB ISO']")).click();
Thread.sleep(3000);
driver.findElement(custName).sendKeys("Automation");
driver.findElement(email).sendKeys("valorautomation+subiso1@gmail.com");
driver.findElement(UserName).sendKeys("SucssSUBISO3");
driver.findElement(Phone).sendKeys("7639552076");
driver.findElement(firstName).sendKeys("Automation");
driver.findElement(lastName).sendKeys("shop");
driver.findElement(address).sendKeys("salem");
driver.findElement(zipCode).sendKeys("10018");
driver.findElement(city).sendKeys("newYork");




	
	
	
	
	
	
}




public void clickNextButton() {
    driver.findElement(nextBtn).click();



}	




public void processorinfo() throws InterruptedException {
	
	driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl']//div[@id='demo-mutiple-chip']")).click();
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	Actions act = new Actions(driver);
	   
	   act.sendKeys(Keys.TAB).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[2]")).click();
	
	
}

public void selectallmodule() {
    driver.findElement(selectmodule).click();
    driver.findElement(submitbutton).click();
}

public void activationISO() throws InterruptedException {
	
	  
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("window.open()");
  //  driver.get("https://accounts.google.com/");
    
    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(3));
    
     driver.get("https://mail.google.com/mail/u/0/#inbox");
    
		/*
		 * driver.findElement(ed).sendKeys("valorautomation@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).
		 * click(); Thread.sleep(3000);
		 * driver.findElement(ps).sendKeys("Amma7639552076");
		 * driver.findElement(By.id("passwordNext")).click();
		 */
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
	    ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tabs1.get(4));
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
	  System.out.println("SUCESSFULLY BORDING FOR  "+ " "+getEML);
	  
	  
	    
}













public void SubIsoUser() throws InterruptedException {
	
	//driver.findElement(By.id("emailtype")).sendKeys("vigneshwaransanityiso32");
	  //driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
	 // driver.findElement(continueButton).click();
	  
	driver.findElement(userMgtadd).click();
	driver.findElement(add).click();
	driver.findElement(By.xpath("//span[normalize-space()='ADD USER']")).click();
	
	 driver.findElement(email).sendKeys("valorautomation+addSubIsoUser@gmail.com");
     driver.findElement(UserName).sendKeys("SucssISOUSER3");
     driver.findElement(Phone).sendKeys("7655441254");
     driver.findElement(firstName).sendKeys("USERVIGNESH");
     driver.findElement(lastName).sendKeys("WARAN");
     driver.findElement(nextBtn).click();
     driver.findElement(submitbutton).click();
     Thread.sleep(3000);
   
     
     JavascriptExecutor jse = (JavascriptExecutor)driver;
     jse.executeScript("window.open()");
   //  driver.get("https://accounts.google.com/");
     
     ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
     driver.switchTo().window(tabs.get(5));
     
      driver.get("https://mail.google.com/mail/u/0/#inbox");
     driver.findElement(By.xpath("(//div[@class='TN bzz aHS-bnt'])[1]")).click();
     
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
		  driver.switchTo().window(tabs1.get(6));
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
  	  System.out.println("SUCESSFULLY BORDING FOR SubISOUser  "+ " "+getEML);
  	  
  	  Thread.sleep(3000);
  	 driver.findElement(By.xpath("(//div[@class='quick-menu dropdown'])[3]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();

     
     
     
     
     
 }

public void DeleteSubIso() throws InterruptedException {
	 // ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    // driver.switchTo().window(tabs.get(1));
	
	 // driver.findElement(By.xpath("(//button[contains(@type,'button')])[6]")).click(); 
 	//  driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
 	  driver.findElement(By.id("emailtype")).sendKeys("vigneshwaransanityiso51");
 	  driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
 	 driver.findElement(continueButton).click();
 	  Thread.sleep(3000);
 	  driver.findElement(loginButton).click();  
 	 driver.findElement(userMgtadd).click();
 	 //driver.findElement(loginButton).click();
 	  driver.findElement(By.xpath("(//p[@class='card-text'])[1]")).click();
 	 // Actions a = new Actions(driver);
 	//  WebElement deleteIsoCopy=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]"));
 	//  deleteIsoCopy.click();  
	//  WebElement deleteIsoPast =driver.findElement(By.id("outlined-name"));
 	 driver.findElement(By.id("outlined-name")).sendKeys("SucssSUBISO3");
	  //a.moveToElement(deleteIsoPast).click().keyDown(Keys.CONTROL).sendKeys("v");
	 // a.keyUp(Keys.CONTROL).build().perform();
	  //ADDISOUSER
	  driver.findElement(Threedot).click();
		 List<WebElement>filter = driver.findElements(By.xpath("//ul[@role='menu']/li"));
		  filter.get(1).click();
		  driver.findElement(Dellogin).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("(//p[@class='card-text'])[1]")).click();
		  
	 // driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
 	 // Actions b = new Actions(driver);
 	//  WebElement deleteIsoUserCopy=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]"));
 	// deleteIsoUserCopy.click();  
	 // WebElement deleteIsoUserPast =driver.findElement(By.id("outlined-name"));
		  driver.findElement(By.xpath("(//*[name()='path'])[3]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("outlined-name")).sendKeys("SucssISOUSER3");
	 // b.moveToElement(deleteIsoUserPast).click().keyDown(Keys.CONTROL).sendKeys("v");
	 // b.keyUp(Keys.CONTROL).build().perform();
		  driver.findElement(Threedot).click();
			 List<WebElement>filter1= driver.findElements(By.xpath("//ul[@role='menu']/li"));
			  filter1.get(1).click();
			  driver.findElement(Dellogin).click();
	System.out.println("Successfully Delete Sub Iso And Delete Subiso User");
	
}

public void ResendActivationMailForISOUser() throws InterruptedException {
	
	 driver.findElement(userMgtadd).click();
	 driver.findElement(add).click();
	 driver.findElement(By.xpath("//span[normalize-space()='Add USER']")).click();
	 
	
	driver.findElement(email).sendKeys("valorautomation+addSubIsoUser@gmail.com");
    driver.findElement(UserName).sendKeys("ResendactivationISOUSER10");
    driver.findElement(Phone).sendKeys("7655441254");
    driver.findElement(firstName).sendKeys("USERVIGNESH");
    driver.findElement(lastName).sendKeys("WARAN");
    driver.findElement(nextBtn).click();
    driver.findElement(submitbutton).click();
Thread.sleep(3000);
	// driver.findElement(userMgtadd).click();
	 driver.findElement(Search).sendKeys("ResendactivationISOUSER10");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[8]")).click();
	 driver.findElement(By.xpath("(//span[contains(text(),'Action')])[1]")).click();
	 List<WebElement>resendactivationoption= driver.findElements(By.xpath("//ul[@role='menu']/li"));
	 resendactivationoption.get(2).click();
	    
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
 	  System.out.println("SUCESSFULLY BORDING FOR Resend Activation "+ " "+getEML);
 	  
 	  
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
	
	
	
	
public void ResendActivationMailSubISO() throws InterruptedException, AWTException {
	 driver.findElement(userMgtadd).click();
	 driver.findElement(add).click();
	 driver.findElement(By.xpath("//span[normalize-space()='Add SUB ISO']")).click();
	 Thread.sleep(3000);
	 driver.findElement(custName).sendKeys("Automation");
	 driver.findElement(email).sendKeys("valorautomation+Resendsubiso2@gmail.com");
	 driver.findElement(UserName).sendKeys("ResendSUBISO11");
	 driver.findElement(Phone).sendKeys("7639552076");
	 driver.findElement(firstName).sendKeys("Automation");
	 driver.findElement(lastName).sendKeys("shop");
	 driver.findElement(address).sendKeys("salem");
	 driver.findElement(zipCode).sendKeys("10018");
	 driver.findElement(city).sendKeys("newYork");
	 driver.findElement(nextBtn).click();
	 driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl']//div[@id='demo-mutiple-chip']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Actions act = new Actions(driver);
		   
		   act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[2]")).click();
		 driver.findElement(selectmodule).click();
		    driver.findElement(submitbutton).click();
	 
	Thread.sleep(3000);
	 driver.findElement(Search).sendKeys("ResendSUBISO11");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[8]")).click();
	 driver.findElement(By.xpath("(//span[contains(text(),'Action')])[1]")).click();
	 List<WebElement>resendactivationoption= driver.findElements(By.xpath("//ul[@role='menu']/li"));
	 resendactivationoption.get(2).click();
	 Thread.sleep(4000);
	 
	    
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
 		Thread.sleep(60000);
 		//driver.findElement(By.xpath("//body[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/span[1]")).click();
 	    driver.findElement(By.xpath("(//span[@class='bqe'][normalize-space()='Registration'])[2]")).click();
 	    Thread.sleep(3000);
 	  Robot robot = new Robot();
 	  robot.keyPress(KeyEvent.VK_PAGE_DOWN);
 	  robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
 	  robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	  robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	  
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
 	  System.out.println("SUCESSFULLY BORDING FOR Resend Activation SUBISO "+ " "+getEML);
 	  
 	  
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
	 
	 
public void ResendActivationMailSubISOUser() throws InterruptedException, AWTException {
	
	
	driver.findElement(By.xpath("(//div[@class='quick-menu dropdown'])[3]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
	  driver.findElement(By.id("emailtype")).sendKeys("ADDSUBISO1");
 	  driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
 	 driver.findElement(continueButton).click();
 	driver.findElement(loginButton).click(); 

	 
	driver.findElement(userMgtadd).click();
	driver.findElement(add).click();
	driver.findElement(By.xpath("//span[normalize-space()='ADD USER']")).click();
	
	 driver.findElement(email).sendKeys("valorautomation+addSubIsoUser@gmail.com");
     driver.findElement(UserName).sendKeys("ResendactivationSUBISOUSER6");
     driver.findElement(Phone).sendKeys("7655441254");
     driver.findElement(firstName).sendKeys("USERVIGNESH");
     driver.findElement(lastName).sendKeys("WARAN");
     driver.findElement(nextBtn).click();
     driver.findElement(submitbutton).click();
     Thread.sleep(3000);
 	// driver.findElement(userMgtadd).click();
 	 driver.findElement(Search).sendKeys("ResendactivationSUBISOUSER6");
 	 Thread.sleep(3000);
 	 driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[8]")).click();
 	 driver.findElement(By.xpath("(//span[contains(text(),'Action')])[1]")).click();
 	 List<WebElement>resendactivationoption= driver.findElements(By.xpath("//ul[@role='menu']/li"));
 	 resendactivationoption.get(2).click();
     
   
     
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
     //driver.findElement(By.xpath("(//div[@class='TN bzz aHS-bnt'])[1]")).click();
     
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
  	  System.out.println("SUCESSFULLY BORDING FOR Resend Activation SUBISOUser  "+ " "+getEML);
  	  
  	 
     
     
     
     
     
 }
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	

}

	
	
	
	
	
	
	






	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



