package com.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MerchantManagementPage {
	
	

			private WebDriver driver;

	private By merchntmgtadd = By.xpath("//span[contains(text(),'Add')]");
	private By fullboard = By.xpath("//span[contains(text(),'Full Board')]");
	private By dba = By.name("dbaName");
	private By legalname = By.name("legalName");
	private By firstname = By.name("firstName");
	private By lastname = By.name("lastName");
	private By email = By.xpath(
			"//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[3]/div/div[1]/div/div/div[5]/div/div/input");
	private By username = By.xpath(
			"//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[3]/div/div[1]/div/div/div[6]/div/div/input");
	private By phone = By.xpath("//input[@autocomplete='disabled']");
	private By address = By.xpath("//input[@name='legalAddress']");
	private By zipcode = By.name("legalZipCode");
	private By city = By.name("legalCity");
	private By timezone = By.xpath(
			"//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[3]/div/div[1]/div/div/div[12]/div/div/div");
	private By nextBtn = By.xpath("//span[contains(text(),'Next')]");
	private By tzz = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[2]/div/div[1]/div/div/div[12]/div/div/div");
	//private By timez2 = By.xpath("//*[@id=\"menu-\"]/div[3]/ul/");
	private By mcclick = By.xpath("//button[@aria-label='Open']");
	//private By mcccode = By.xpath("//input[@class='MuiInputBase-input-847 MuiInput-input-835 MuiAutocomplete-input-940 MuiAutocomplete-inputFocused-941 MuiInputBase-inputAdornedEnd-852 MuiInputBase-inputMarginDense-848 MuiInput-inputMarginDense-836']");
	private By addbtn = By.xpath("//span[contains(text(),'Add Store')]");
	private By deviceType = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[2]/div/div[1]/div/div/div[6]/div/div/div");
	private By processor = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]");
	private By devname = By.xpath("//input[@value='Device1']");
	private By debitShare = By.xpath("//*[@id=\"mui-component-select-debitShare\"]");
	private By dpfiscol = By.xpath("//input[@name='dpFiscal_token']");
	private By mid = By.name("mid");
	private By vno = By.name("vNumber");
	private By stnumber = By.name("storeNo");
	private By tm = By.name("termNo");
	private By bin = By.xpath("//div[@id='mui-component-select-binnumber']");
	private By industry = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[19]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]");
	private By agtnumber = By.name("agentBank");
	private By chnumber = By.name("chain");
	private By agnt = By.name("agent");
	private By ebtca = By.name("EBTcash");
	private By ebtfd = By.name("EBTfood");
	private By fnsno = By.name("EbtNo");
	private By customfee = By.name("surchargePercentage");
	private By addde = By.xpath("//span[contains(text(),'Add')]");
	//private By ant = By .xpath("//button[@class='MuiButtonBase-root-607 MuiButton-root-772 MuiButton-text-774 jr-btn next-btn hoverBtn MuiButton-contained MuiButton-containedPrimary']//span[@class='MuiButton-label-773']//span");
	private By more = By.xpath("//*[@id=\"body\"]/div[2]/div[3]/div/div[2]/button[1]/span[1]/span");
	private By onboard = By.xpath("//span[@class='y2']");
	
	
	public MerchantManagementPage(WebDriver driver) {
		this.driver = driver;
	}

	public void add() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(merchntmgtadd).click();
	}

	public void fullbr() throws InterruptedException {
		driver.findElement(fullboard).click();
	}

	public void creatmerchant(String dbaname, String legalName, String firstName, String lastName, String mail,
			String userName, String phonNo, String adDress, String zipCode, String cit) throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(dba).sendKeys(dbaname);
		driver.findElement(legalname).sendKeys(legalName);
		driver.findElement(firstname).sendKeys(firstName);
		driver.findElement(lastname).sendKeys(lastName);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(username).sendKeys(userName);
		driver.findElement(phone).sendKeys(phonNo);
		driver.findElement(address).sendKeys(adDress);
		driver.findElement(zipcode).sendKeys(zipCode);
		driver.findElement(city).sendKeys(cit);

	}

	public void tzone() throws InterruptedException {
		driver.findElement(timezone).click();
		
		List<WebElement> timeZone1 = driver.findElements(By.xpath("//li[@role='option']"));
	       System.out.println("this size is"+timeZone1.size());
	       timeZone1.get(1).click();
	}

	public void clickNextButton() {
		driver.findElement(nextBtn).click();

	}

	public void tz2() throws InterruptedException {
		driver.findElement(tzz).click();
	
		List<WebElement> tZone2 = driver.findElements(By.xpath("//li[@role='option']"));
	       System.out.println("this size is"+tZone2.size());
	       tZone2.get(1).click();
        
   }
	
	
       public void m2()  throws InterruptedException {
    	  
		driver.findElement(mcclick).click();
		  Actions action = new Actions(driver);
        action.sendKeys("0763 - AGRICULTURAL CO-OPERATIVE",Keys.ARROW_DOWN,Keys.ENTER).perform();
       }
		
       
       public void adStore() {
    	   
    	   driver.findElement(addbtn).click();
    	   driver.findElement(nextBtn).click();
    	   
    	   }
       
       public void Devic () {
    	   
    	   driver.findElement(deviceType).click();
    		
   		List<WebElement> terminal = driver.findElements(By.xpath("//li[@role='option']"));
   	       System.out.println("this size is"+terminal.size());
   	    terminal.get(5).click();
   	    
       }  
        public void proc () {
    	   
    	   driver.findElement(processor).click();
    		
   		List<WebElement> allprocessor = driver.findElements(By.xpath("//li[@role='option']"));
   	       System.out.println("this size is"+allprocessor.size());
   	    allprocessor.get(0).click();
   	    
       }  
        public void dname()  throws InterruptedException {
      	  
    		driver.findElement(devname).sendKeys("auto");
    		
    		driver.findElement(debitShare).click();
    		List<WebElement> dbshare= driver.findElements(By.xpath("//li[@role='option']"));
    		dbshare.get(0).click();
    		
    		driver.findElement(dpfiscol).sendKeys("1E4095D616");
    		
           }   
    	   
        public void tsysdata(String Midnumber, String vnumb, String stno, String termno,String agb,
    			String cha, String agt) throws InterruptedException {

        	
    		Thread.sleep(3000);
    		driver.findElement(mid).sendKeys(Midnumber);
    		driver.findElement(vno).sendKeys(vnumb);
    		driver.findElement(stnumber).sendKeys(stno);
    		driver.findElement(tm).sendKeys(termno);
    		driver.findElement(bin).click();
    		List<WebElement> bno = driver.findElements(By.xpath("//li[@role='option']"));
    		bno.get(0).click();
    		Thread.sleep(3000);
    		driver.findElement(industry).click();
    		List<WebElement> indselect = driver.findElements(By.xpath("//*[@id=\"menu-industry\"]/div[3]/ul/li"));
    		indselect.get(4).click();
         	driver.findElement(agtnumber).sendKeys(agb);
    		driver.findElement(chnumber).sendKeys(cha);
    		driver.findElement(agnt).sendKeys(agt);
    		driver.findElement(ebtca).click();
    		driver.findElement(ebtfd).click();
    		driver.findElement(fnsno).sendKeys("1234567");
    		driver.findElement(customfee).sendKeys("6000");
    		
        
        
        }
        
        public void dnxt() throws InterruptedException {
        	 
        driver.findElement(addde).click();
        Thread.sleep(3000);
      //  driver.findElement(nextBtn).click();
       
        driver.findElement(more).click();
        driver.findElement(onboard).click();
        
      
    }
}


