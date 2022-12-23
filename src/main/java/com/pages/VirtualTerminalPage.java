package com.pages;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.Select;

import com.testing.framework.EmailUtils;
import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;


import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;


import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;


public class VirtualTerminalPage {

	//public static final String ACCOUNT_SID = "AC924b662e62bb7fa2ec5ea0d6a198d2c3";
	//public static final String AUTH_TOKEN = "b20da27b3aded58888cddc73b8facbde";


	
	
	//private static final CharSequence OTTP = null;


	private WebDriver driver;
	
	
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
	private By em = By.name("email");
	private By close = By.xpath("//span[contains(text(),'Close')]");
	private By auth = By.xpath("//input[@value='1']");
	private By rf = By.xpath("//input[@value='2']");
	
	private By cash = By.xpath("//input[@value='5']");
	private By ed = By.id("identifierId");
	private By ps = By.name("Passwd");
	
	//Sale with Recurring
	private By saleRecurringBill = By.xpath("//span[@title='Enable']//input[@type='checkbox']");
	private By subscriptionButton = By.xpath("//body/div/div/div/div/main/div/div/div/div/div/div/div[@data-testid='wrapper']/div/div/div/div/div/div/div/div/div[@role='region']/div/div/div/div[@aria-label='transaction']/div/label[1]/span[1]/span[1]");
	private By insatallment = By.xpath("//body/div[@id='app-site']/div[@class='app-main']/div[@class='app-container fixed-drawer']/div[@class='app-main-container']/main[@class='app-main-content-wrapper']/div[@class='app-main-content']/div[@class='app-wrapper']/div/div[@class='col-12']/div[contains(@class,'jr-card')]/div[contains(@class,'jr-card-body')]/div[@class='_loading_overlay_wrapper css-79elbk']/div/div/div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3']/div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-12 MuiGrid-grid-lg-12']/div[@class='MuiPaper-root MuiExpansionPanel-root Mui-expanded MuiExpansionPanel-rounded MuiPaper-elevation1 MuiPaper-rounded']/div[@class='MuiCollapse-container MuiCollapse-entered']/div[@class='MuiCollapse-wrapper']/div[@class='MuiCollapse-wrapperInner']/div[@id='panel1a-content']/div[@class='MuiExpansionPanelDetails-root']/div/div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-6 MuiGrid-grid-md-4 MuiGrid-grid-lg-4']/div[@aria-label='transaction']/div/label[1]/span[1]");
	private By weekly = By.xpath("//div[@class='MuiGrid-root MuiGrid-container']//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-6 MuiGrid-grid-md-4 MuiGrid-grid-lg-4']//div[@aria-label='transaction']//div//span[@class='MuiButtonBase-root MuiIconButton-root jss34 MuiRadio-root MuiRadio-colorSecondary jss35 Mui-checked MuiIconButton-colorSecondary']");
	private By BiWeekly = By.xpath("//div[@class='MuiGrid-root MuiGrid-container']//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-6 MuiGrid-grid-md-4 MuiGrid-grid-lg-4']//div[@aria-label='transaction']//div//span[@class='MuiButtonBase-root MuiIconButton-root jss34 MuiRadio-root MuiRadio-colorSecondary jss35 Mui-checked MuiIconButton-colorSecondary']");
	private By monthly = By.xpath("//div[@class='MuiGrid-root MuiGrid-container']//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-6 MuiGrid-grid-md-4 MuiGrid-grid-lg-4']//div[@aria-label='transaction']//div//span[@class='MuiButtonBase-root MuiIconButton-root jss34 MuiRadio-root MuiRadio-colorSecondary jss35 Mui-checked MuiIconButton-colorSecondary']");
	private By numberOfInstallment = By.xpath("//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl']");
	private By dayOfEveryMonth = By.xpath("//div[contains(text(),'21st')]");
	private By recurringBillingStartsFrom = By.id("date-picker-inline");
	//.set shipping as billing address
	private By setShipping = By.xpath("//div[@id='panel1a-content']//div//input[@type='checkbox']");
	private By customerNameBilling = By.name("customerName");
	private By streetNoBilling = By.name("streetNo");
	private By streetNameBilling = By.name("streetName");
	private By unitBilling = By.name("streetUnit");
	private By zipBilling = By.name("zipCode");
	private By cityBilling = By.name("city");
	private By stateBilling = By.name("state");
	private By valid = By.xpath("//span[contains(text(),'Validate & Save')]");
	private By billingProcess = By.xpath("//span[normalize-space()='Process']");
	
	
	
	private By cmo = By.xpath("//span[@class='y2']");
	//private By cmo = By.xpath("//tr[@class='zA zE x7']//span[@class='y2']");
	private By aprs=By.xpath("//span[contains(text(),'Proceed')]");
	
	//PayNow Link:
	private By payNL = By.xpath("//span[@title='PayNowLink']//input[@type='checkbox']");
	private By flex = By.xpath("//div[@class='col-4']//span[@title='PayNowLink']//input[@type='checkbox']");
	private By nVE = By.xpath("//span[contains(@title,'Never Expire')]//input[contains(@type,'checkbox')]");
	private By custName	= By.name("customerName");
	private By invcn	= By.name("invoiceNumber");
	private By sendPay = By.xpath("//span[normalize-space()='Send PayNow']");
	
	//ValorLite QR:
	private By vLQ =By.xpath("//span[@title='Valor QR']//input[@type='checkbox']");
	private By lab =By.name("label");
	private By decrpt =By.xpath("//input[contains(@name,'description')]");
	
	private By ok  = By.xpath("//span[contains(text(),'OK')]");
	private By coplink = By.xpath("//span[normalize-space()='copy link']");
	private By print = By.xpath("//span[normalize-space()='Print']");
	
	//Generate QR
	private By genrt = By.name("//span[normalize-space()='Generate QR']");
	
	//MANGE:
	private By manage = By.xpath("//span[contains(@class,'MuiButton-label')]//span[contains(text(),'Manage')]");
	
	//E-INVOICE
	private By Einvoice = By.xpath("//span[normalize-space()='E-Invoices']");
	private By Idcopy = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[2]/div/div/div[5]/div/div/div[2]/div/div/div[1]/div/div[1]/h3/span/text()[1]");
	private By Search = By.id("outlined-name");
	private By Fltr = By.xpath("//body/div/div/div/div/main/div/div/div/div/div/div/div/div/div/button[1]");
	private By Datefilter = By.xpath("//body/div[@role='presentation']/div[@role='none presentation']/div[@role='dialog']/div/div/div/button[@name='Date_filter']/span[1]");
	private By Status = By.xpath("//button[@name='Status']");
	private By Freeselect = By.xpath("//button[@name='Free_Select']");
	private By srch = By.xpath("//button[@class='MuiButtonBase-root-3509 MuiButton-root-3482 MuiButton-contained-3490 MuiButton-containedPrimary-3491']");
	private By Reset = By.xpath("//span[contains(text(),'Reset')]");
	private By Close = By.xpath("//span[contains(text(),'Close')]");
	private By Sh = By.xpath("//span[contains(text(),'Search')]");
	private By Action = By.xpath("//span[contains(text(),'Action')]");
	private By Refresh = By.xpath("//button[@title='Refresh ']");
	private By Threedot = By.xpath("//button[@title='Options']");
	private By Back = By.xpath("//button[@class='MuiButtonBase-root-4442 MuiButton-root-4415 MuiButton-contained-4423 m-2 MuiButton-containedPrimary-4424']");
	private By muifilter = By.xpath("//button[@type='button']//span//span//i");
	
	
	//RECURRING BILLING
	private By recurringbill = By.xpath("//span[contains(text(),'Recurring billing')]");
	private By Subscriptionid = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h3[1]/span[1]");
	
	//WHITELIST IPADDRESS
	private By whitelistIP = By.xpath("//span[contains(text(),'Whitelist IPAddress')]");
	private By ipaddress = By.xpath("//input[@id='primaryIP']");
	private By description = By.xpath("//input[@placeholder='description']");
	private By cancel= By.xpath("//span[contains(text(),'Cancel')]");
	
	//APIKEYS
	private By apikeys = By.xpath("//span[normalize-space()='API KEYS']");
	
	
	
	public VirtualTerminalPage(WebDriver driver) {
		this.driver = driver;
	}
	
	

	public void epiD () {
 	   
 	   driver.findElement(epitype).click();
 		
		List<WebElement> terminal = driver.findElements(By.xpath("//ul[@role='menu']/li"));
	       System.out.println("this size is"+terminal.size());
	    terminal.get(2).click();
	    
    }  
	
	public void amount()  throws InterruptedException {
		
         
		 
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
	
	
	
	public void authoriz() throws InterruptedException {
		
		Thread.sleep(3000);
	driver.findElement(auth).click();
	driver.findElement(amnt).sendKeys("1054");
	driver.findElement(cdnumber).sendKeys("4761530001111118");
	//driver.findElement(crdholdr).sendKeys("VigneshAuth");
	
	}
	
	public void Txn() throws InterruptedException {
		
	driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
	driver.findElement(By.id("outlined-name")).sendKeys("1118");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@title='Options']")).click();
	List<WebElement> terminal = driver.findElements(By.xpath("//ul[@role='menu']/li"));
    System.out.println("this capture auth  size is"+terminal.size());
    terminal.get(2).click();
    driver.findElement(aprs).click();
	driver.findElement(close).click();
	
	}
	

	public void refund() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/li[4]/a")).click();
	driver.findElement(epitype).click();
	List<WebElement> terminal = driver.findElements(By.xpath("//ul[@role='menu']/li"));
    System.out.println("this size is"+terminal.size());
 terminal.get(2).click();
		driver.findElement(rf).click();
		driver.findElement(amnt).sendKeys("1034");
		driver.findElement(cdnumber).sendKeys("4111111111111111");
		driver.findElement(cvv).sendKeys("999");
		  
	    driver.findElement(mmyy).sendKeys("12/25");
	    driver.findElement(crdholdr).sendKeys("Vignesh");
	    driver.findElement(prcss).click();
	    String yesWindow= driver.getWindowHandle();
	    Thread.sleep(30000);
	    //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
	 /*   
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		String smsBody = getMessage();
		System.out.println(smsBody);
		String OTPNumber = smsBody.replaceAll("[^-?0-9]+", " ");
		System.out.println(OTPNumber);
		
		driver.findElement(By.id("auth-pv-enter-code")).sendKeys(OTPNumber);

	}

	public static String getMessage() {
		return getMessages().filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND) == 0)
				.filter(m -> m.getTo().equals("91+7639552076")).map(Message::getBody).findFirst()
				.orElseThrow(IllegalStateException::new);
	}

	private static Stream<Message> getMessages() {
		ResourceSet<Message> messages = Message.reader(ACCOUNT_SID).read();
		return StreamSupport.stream(messages.spliterator(), false);
	}
	    
	
	    */
	    
	
	    
	    
	    
	    
	    
	    
		/*
		 * //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * //System.out.println(driver.getTitle());
		 * 
		 * driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		 * //driver.switchTo().window(WindowType.TAB); String selectLinkOpeninNewTab =
		 * Keys.chord(Keys.CONTROL,Keys.RETURN);
		 * driver.findElement(By.linkText("https://accounts.google.com/")).sendKeys(
		 * selectLinkOpeninNewTab);
		 */
		//driver.get("https://mail.google.com/mail/u/0/#inbox");
	    //driver.navigate().to("https://accounts.google.com/");
	    
	    
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
		
		 //String eWindow= driver.getWindowHandle();
		//for(int i = 0; i<20; i++) {
		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
		Thread.sleep(25000);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(cmo).click();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(6000);
		WebElement txt =driver.findElement(By.xpath("//tbody/tr/td[@bgcolor='transparent']/p[1]"));
		String text=txt.getAttribute("innerHTML");
		System.out.println(text);
		//driver.close();
		driver.switchTo().window(yesWindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"alert-dialog-description\"]/div/div[2]/div[4]/div/div/input")).sendKeys(text);
		driver.findElement(prc).click();
		driver.findElement(close).click();
		
		
		}
		
	public void Einvoice() throws Exception {
		
		
		driver.findElement(By.xpath("//input[@value='3']")).click();
		driver.findElement(amnt).sendKeys("1020");
		driver.findElement(phn).sendKeys("7639552000");
		driver.findElement(em).sendKeys("valorautomation@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Send E-Invoice']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Process')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
		
		//driver.switchTo().window(eWindow);
		// String yesWindow= driver.getWindowHandle();
		Thread.sleep(20000);
		    JavascriptExecutor jse = (JavascriptExecutor)driver;
		    jse.executeScript("window.open()");
		  //  driver.get("https://accounts.google.com/");
		    
		    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1));
	        
	         driver.get("https://mail.google.com/mail/u/0/#inbox");
		    
			//driver.findElement(ed).sendKeys("valorautomation@gmail.com");
			//driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
			//Thread.sleep(3000);
			//driver.findElement(ps).sendKeys("Amma7639552076");
			//driver.findElement(By.id("passwordNext")).click();
			
			 //String eWindow= driver.getWindowHandle();
			for(int i = 0; i<20; i++) {
			driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
			//Thread.sleep(3000);
			driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
			}
			
			driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
			driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
			//for(int i = 0; i<5; i++) {
			Thread.sleep(40000);
			driver.findElement(By.xpath("//body[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/span[1]")).click();
			//}
			//driver.switchTo().window(null);
			Thread.sleep(3000);
			
			
			
			//String parentHandle= driver.getWindowHandle();
			//System.out.println("Parent window-"+parentHandle);
			driver.findElement(By.xpath("//a[normalize-space()='Pay Now']")).click();
			Thread.sleep(6000);
			//driver.close();
		//Set<String> handles = driver.getWindowHandles(); 
			// driver.switchTo().window(handles)
			// driver.findElement(By.name("cardnumber")).sendKeys("4111111111111");
			 
			// driver.findElement(By.name("cardnumber")).sendKeys("4111111111111");
			
			 // for (String handle : handles) { System.out.println(handle);
			  
			 // if (!handle.equals(parentHandle)) {
			 // driver.switchTo().window(handle);
			 ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
			  driver.switchTo().window(tabs1.get(3));
			  driver.findElement(By.name("cardnumber")).sendKeys("4111111111111111");
			 // List<WebElement> toAct =driver.findElements(By.id("expiry_month"));
			  Select my = new Select(driver.findElement(By.id("expiry_month")));
			  my.selectByIndex(5);
			  Select yyyy = new Select(driver.findElement(By.id("expiry_year")));
			  yyyy.selectByIndex(5);
			  driver.findElement(By.name("cvv")).sendKeys("999");
			  driver.findElement(By.name("cardholdername")).sendKeys("Vignesh");
			  driver.findElement(By.id("phone")).sendKeys("7639554547");
			  driver.findElement(By.id("tipManual")).sendKeys("1000");
			  driver.findElement(By.name("submit")).click();
			}
			  
	
	public void paynow() throws Exception { 
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tabs1.get(0));
		driver.findElement(payNL).click();
		driver.findElement(amnt).sendKeys("1020");
		driver.findElement(phn).sendKeys("7639552000");
		driver.findElement(em).sendKeys("valorautomati123on@gmail.com");
		driver.findElement(custName).sendKeys("payvignesh");
		driver.findElement(invcn).sendKeys("123456789");
		driver.findElement(decrpt).sendKeys("paytxn");
		driver.findElement(sendPay).click();
		driver.findElement(By.xpath("//span[contains(text(),'Process')]")).click();
		driver.findElement(ok).click();
		//driver.findElement(By.xpath("//span[normalize-space()='copy link']")).click();
		
		
	}
	
	public void paynowwithFlexible() throws Exception { 
		driver.findElement(payNL).click();
		driver.findElement(flex).click();
		driver.findElement(phn).sendKeys("7639552000");
		driver.findElement(em).sendKeys("valorautomatio123n@gmail.com");
		driver.findElement(custName).sendKeys("payvignesh");
		driver.findElement(invcn).sendKeys("123456789");
		driver.findElement(decrpt).sendKeys("paytxn");
		driver.findElement(sendPay).click();
		driver.findElement(By.xpath("//span[contains(text(),'Process')]")).click();
		driver.findElement(ok).click();
		//driver.findElement(By.xpath("//span[normalize-space()='copy link']")).click();
		}
	public void paynowwithNeverExpire() throws Exception { 
		driver.findElement(payNL).click();
		driver.findElement(nVE).click();
		driver.findElement(amnt).sendKeys("1120");
		driver.findElement(phn).sendKeys("7639552000");
		driver.findElement(em).sendKeys("valorautomat123ion@gmail.com");
		driver.findElement(custName).sendKeys("payvignesh");
		driver.findElement(invcn).sendKeys("123456789");
		driver.findElement(decrpt).sendKeys("paytxn");
		driver.findElement(sendPay).click();
		driver.findElement(By.xpath("//span[contains(text(),'Process')]")).click();
		driver.findElement(ok).click();
		//driver.findElement(By.xpath("//span[normalize-space()='copy link']")).click();
		
	}
	
	public void paynowBothFlexandNever() throws Exception { 
		driver.findElement(payNL).click();
		driver.findElement(flex).click();
		driver.findElement(nVE).click();
		driver.findElement(phn).sendKeys("7639552000");
		driver.findElement(em).sendKeys("valorautomati123on@gmail.com");
		driver.findElement(custName).sendKeys("payvignesh");
		driver.findElement(invcn).sendKeys("123456789");
		driver.findElement(decrpt).sendKeys("paytxnFNE");
		driver.findElement(sendPay).click();
		driver.findElement(By.xpath("//span[contains(text(),'Process')]")).click();
		driver.findElement(ok).click();
		
		
		}
	public void valorLiteQR() throws Exception { 
		driver.findElement(vLQ).click();
		driver.findElement(lab).sendKeys("7639552000");
		driver.findElement(decrpt).sendKeys("paytxnVQ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Generate QR']")).click();
		driver.findElement(ok).click();
		//driver.findElement(By.xpath("//span[normalize-space()='copy link']")).click();
		//driver.findElement(print).click();
	}
	
	public void manageEinvoice() throws Exception {
		driver.findElement(manage).click();
		driver.findElement(Einvoice).click();
		 Actions a = new Actions(driver);
		  WebElement IDcopy =driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[2]/div/div/div[5]/div/div/div[2]/div/div/div[1]/div/div[1]/h3/span/i"));
		  IDcopy.click();  
		  WebElement IDPast =driver.findElement(Search);
		  a.moveToElement(IDPast).click().keyDown(Keys.CONTROL).sendKeys("v");
		  a.keyUp(Keys.CONTROL).build().perform();
		//driver.findElement(Threedot).click();
			// List<WebElement>filter = driver.findElements(By.xpath("//ul[@role='menu']/li"));
			//  filter.get(0).click();
		  
	}	  
		  
		  
		
			
			  
			 
			  
			 
			  
			  
		 
	
	
	public void transactionsfilteringoptinclick() throws InterruptedException {

        Thread.sleep(3000);

        driver.findElement(muifilter).click();
        driver.findElement(Datefilter).click();

        List<WebElement> fil = driver.findElements(By.xpath("//ul[@role='menu']/li"));

       

        for (WebElement ftyp : fil) {

              if (ftyp.getText().equals("Today")) {

                    ftyp.click();

                    break;

              }



        }


	}
	
	
	
	public void statusfilteringoptinclick() throws InterruptedException {

        Thread.sleep(3000);

        driver.findElement(Status).click();
        

        List<WebElement> fil = driver.findElements(By.xpath("//ul[@role='menu']/li"));

       

        for (WebElement ftyp : fil) {

              if (ftyp.getText().equals("PAID")) {

                    ftyp.click();

                    break;

              }



        }


	}
	
	
	
	public void IDFilteringOptinclick() throws InterruptedException {

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@name='Free_Select']")).click();
        

        List<WebElement> fil = driver.findElements(By.xpath("//ul[@role='menu']/li"));

       

        for (WebElement ftyp : fil) {

              if (ftyp.getText().equals("Email")) {

                    ftyp.click();

                    break;

              }



        }


	}
	
	public void srchClick() {
		driver.findElement(By.xpath("//div[@role='presentation']//button[3]")).click();
	}
	
	
	
	
	
	
	
	public void manageRecurringBilling() throws Exception {
		driver.findElement(manage).click();
		driver.findElement(recurringbill).click();
		Actions a = new Actions(driver);
		  WebElement IDcopyrecurring =driver.findElement(By.xpath("//span[normalize-space()='Id : 33010']//i[@title='copy to clip']"));
		  IDcopyrecurring.click();  
		  WebElement IDPastrecurring =driver.findElement(Search);
		  a.moveToElement(IDPastrecurring).click().keyDown(Keys.CONTROL).sendKeys("v");
		  a.keyUp(Keys.CONTROL).build().perform();
   		driver.findElement(Threedot).click();
			 List<WebElement>filter = driver.findElements(By.xpath("//ul[@role='menu']/li"));
			  filter.get(0).click();
	}
	
	
	
		  
	
			  
	public void gifttxn() throws Exception { 
		driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/li[4]/a")).click();
		driver.findElement(epitype).click();
		List<WebElement> terminal = driver.findElements(By.xpath("//ul[@role='menu']/li"));
	    System.out.println("this size is"+terminal.size());
	     terminal.get(2).click();
		// ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		 // driver.switchTo().window(tabs1.get(0));
		  driver.findElement(By.xpath("//input[@value='4']")).click();
		  driver.findElement(By.xpath("//div[normalize-space()='SALE']")).click();
		  Thread.sleep(3000);
		  List<WebElement>filter = driver.findElements(By.xpath("//ul[@role='menu']/li"));
		  filter.get(0).click();
			/*
			 * for(WebElement ftype:filter) {
			 * 
			 * if(ftype.getText().equals("SALE"))
			 * 
			 * {
			 * 
			 * ftype.click();
			 * 
			 * break;
			 * 
			 * }
			 * 
			 * }
			 */

         
		  Thread.sleep(3000);
		  driver.findElement(amnt).sendKeys("1020");
		  driver.findElement(phn).sendKeys("7639552000");
		  driver.findElement(em).sendKeys("valorauto123mation@gmail.com");
		  driver.findElement(By.name("cardNo")).sendKeys("7108330000122158319");
		  driver.findElement(By.name("pin")).sendKeys("18500305");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//body/div[@id='app-site']/div/div/div/main/div/div/div/div/div/div/div[@data-testid='wrapper']/div/div/div/div/div[@data-testid='wrapper']/div[4]")).click();
		 // driver.findElement(By.xpath("//div[@class='MuiGrid-root saveButtonVoid MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-12']")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'Process')]")).click();
		  
			driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
		  
		 
		  }


	//driver.findElement(By.id("expiry_month"));
			 // Select
			//  em.selectByValue("5");
			 
			 //Thread.sleep(3000);
			//driver.findElement(By.xpath("//a[normalize-space()='Pay Now']")).click();
			/* driver.switchTo().window(payWindw); */
			
			
		
			
			
			
			
	
	//}
		
	
	
	
	
	
	
	
	
	
	
	//public void windowsclose() throws Exception {
	//driver.quit();	
	//}
		
		
		/*EmailUtils emailutils = new EmailUtils();
		Properties prop = new Properties();
		prop.setProperty("to", "valorautomation@gmail.com");
		prop.setProperty("gmail_from", "notify@valoraccess.com");
		prop.setProperty("gmail_username", "valorautomation@gmail.com");
		prop.setProperty("gmail_password", "akiitvrmiwrboyoz");
		prop.setProperty("gmail_port", "25");
		//Prop.load(new FileInputStream("C:\\Users\\vigneshwaran\\eclipse-workspace\\BDDProject\\src\\test\\resources\\config\\configEmail"));
		emailutils.connectToGmail(prop);
        @SuppressWarnings("unchecked")
		List<String>emailtext=emailutils.getUnreadMessageByFromEmail(emailutils.connectToGmail(prop), "Inbox", "notify@valoraccess.com", "Refund Confirmation OTP");
        if (emailtext.size()<1) 
     	throw new Exception("No OTP RECIEVED");
  else
    { 
	String regex="[^\\d]+";
	String[] arrOTP=emailtext.get(1).split(regex);
	String OTP = arrOTP[1];
	//System.out.println("OTP is :"+OTTP);
	
		driver.findElement(ot).sendKeys(OTP);
		driver.findElement(prcss).click();
		driver.findElement(close).click();
		
    }
		
		}*/
	
	
		
		 public void cashTxn() throws InterruptedException {
		  
		  driver.findElement(cash).click(); driver.findElement(amnt).sendKeys("1230");
		  driver.findElement(amnt).sendKeys("1020");
			driver.findElement(phn).sendKeys("7639552000");
			driver.findElement(em).sendKeys("Vigneshwa11ran@valorpaytech.com");
			 driver.findElement(By.xpath("//span[normalize-space()='Process $']")).click();
			 driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
		 }
		   
		 public void saleWithRecurringBillingTxn() throws InterruptedException {	
			 
			 
			    driver.findElement(sale).click();
				driver.findElement(amnt).sendKeys("5821");
				driver.findElement(phn).sendKeys("7639552000");
				driver.findElement(em).sendKeys("Vigneshwa11ran@valorpaytech.com");
				driver.findElement(cdnumber).sendKeys("4111111111111111");
				driver.findElement(cvv).sendKeys("999");	  
			    driver.findElement(mmyy).sendKeys("12/25");
			    driver.findElement(crdholdr).sendKeys("Vignesh");
			    driver.findElement(recurringbill).click();
			   // driver.findElement(setShipping).click();
				 driver.findElement(customerNameBilling).sendKeys("VigneshRecurringAmount");
				 driver.findElement(streetNoBilling).sendKeys("637502");
				 driver.findElement(streetNameBilling).sendKeys("Starcity");
				 driver.findElement(unitBilling).sendKeys("05-45");
				 driver.findElement(zipBilling).sendKeys("10018");
				// driver.findElement(cityBilling).sendKeys("NEW YORK");
				// driver.findElement(stateBilling).sendKeys("GA - Georgia");
				// List<WebElement>filter = driver.findElements(By.xpath("//ul[@role='menu']/li"));
				//  filter.get(0).click();
				 driver.findElement(valid).click();
				 driver.findElement(billingProcess).click();
				 Thread.sleep(40000);
				 driver.findElement(By.xpath("//*[@id=\"body\"]/div[2]/div[3]/div/div[3]/button")).click();
				 
				 
				 
				 
		 }
		 
		 public void RecurringDateChangeTxn() throws InterruptedException {	
			 
			 driver.findElement(By.xpath("//button[@aria-label='change date']//span[1]")).click();
			 driver.findElement(By.xpath("//div[@role='presentation']//button[2]//span[1]")).click();
			 driver.findElement(By.xpath("//p[normalize-space()='19']")).click();
			 
			 
			 
		 }
			 
			
			 
			 
			
		
		 
		 		 
		 



	
	
}









