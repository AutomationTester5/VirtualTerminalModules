package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	    
	    private WebDriver driver;
	    
	    private By userMgtclick = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/li[2]/a/span/span");
	    private By merMgtclick = By.xpath("//span[contains(text(),'Merchant Management')]");
	    private By virterminalclick = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/li[4]/a");
	    
	    
	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	        
	    }
	    
	    public String getHomePageTitle() {
	        return driver.getTitle();
	    }
	    
	    
	    public UserManagementPage umclick() throws InterruptedException {
	    	Thread.sleep(3000);
	        driver.findElement(userMgtclick).click();
	        return new UserManagementPage(driver);
	        
	    }
	    
	       
	    
	    public MerchantManagementPage merchantclick() throws InterruptedException {
	    	Thread.sleep(3000);
	        driver.findElement(merMgtclick).click();
	        return new MerchantManagementPage(driver);
	        
	    }
	        
	    public VirtualTerminalPage virtualclick() throws InterruptedException {
	    	Thread.sleep(3000);
	    	driver.findElement(virterminalclick).click();
	    	return new VirtualTerminalPage(driver);
	    
	    }
	        
	    public SubisoCreatePage sbclick() throws InterruptedException {
	    	Thread.sleep(3000);
	        driver.findElement(userMgtclick).click();
	        return new SubisoCreatePage(driver);
	        
	    }
	    
	    public OperatorFromMerchantLoginPage OPclick() throws InterruptedException {
	    	Thread.sleep(3000);
	        driver.findElement(userMgtclick).click();
	        return new OperatorFromMerchantLoginPage(driver);
	        
	    }

	    public AdminPage Adclick() throws InterruptedException {
	    	Thread.sleep(3000);
	        driver.findElement(userMgtclick).click();
	        return new AdminPage(driver);
	    }

}

