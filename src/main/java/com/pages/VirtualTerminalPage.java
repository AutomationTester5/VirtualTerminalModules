package com.pages;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver.WindowType;

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
	
	//private By cash = By.xpath("//input[@value='5']");
	private By ed = By.id("identifierId");
	private By ps = By.name("Passwd");
	
	private By cmo = By.xpath("//span[@class='y2']");
	//private By cmo = By.xpath("//tr[@class='zA zE x7']//span[@class='y2']");
	 
	
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
	
	/*public void atut()  throws InterruptedException {
	int at =1000;
    
		driver.findElement(amnt).sendKeys("at");
		for(int i = 0; i<4; i++) {
			at +=1000;
}*/
	
	
	public void authoriz() throws InterruptedException {
		
		Thread.sleep(3000);
	driver.findElement(auth).click();
	driver.findElement(amnt).sendKeys("1054");
	
	}
	

	public void refund() throws Exception {
	
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
		
		//for(int i = 0; i<20; i++) {
		//driver.findElement(By.xpath("//*[@id=\":4\"]/div/div[1]/div[1]/div/div/div[5]/div")).click();
		Thread.sleep(20000);
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
	
	
		/*
		 * public void cashTxn() throws InterruptedException {
		 * 
		 * driver.findElement(cash).click(); driver.findElement(amnt).sendKeys("1230");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
}
	
		









