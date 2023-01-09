package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage {

	private WebDriver driver;

	private By userMgtadd = By.xpath("//span[contains(text(),'Add')]");
	private By umaddCust = By.xpath("//span[contains(text(),'ADD CUSTOMER')]");
	private By custName = By.xpath("//input[@id='custName']");
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
	private By bin = By.xpath("//input[@name='bin']");
	private By addBin = By.xpath("//*[@id='binDataAdd-bin_details']/span[1]");
	private By agent = By.xpath("//input[@name='agent']");
	private By addagent = By.xpath("//*[@id='agentbankDataAdd-agentbank_details']/span[1]");
	private By agentcode = By.xpath("//input[@id='agentDataAdd-agent_details']");
	private By addagentcode = By.xpath("//*[@id='agentDataAdd-agent_details']/span[1]");
	private By chainNumber = By.xpath("//input[@id='chainDataAdd-chain_details']");
	private By addchainnumber = By.xpath("//*[@id='chainDataAdd-chain_details']/span[1]");
	private By label = By.xpath("//*[@id='label-label']");
	private By debitsharing = By.xpath("//*[@id='debit_sharing-debit_sharing']");
	private By abaNumber = By.xpath("//*[@id='aba_number-aba_number']");
	private By addaba = By.xpath("//*[@id='drgdrg']/span[1]");
	private By selectmodule = By.xpath("//input[@value='jason']");
	private By submitbutton = By.xpath(
			"//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained jr-btn next-btn MuiButton-containedPrimary'][2]");
	// ActivatISO:
	private By ed = By.id("identifierId");
	private By ps = By.name("Passwd");
	private By registration = By.xpath("//div[@role='link']//div//div//span//span[contains(text(),'Registration')]");
	private By activate = By.xpath("//u[normalize-space()='Click Here For Activation']");

	// DPFISCAL:
	private By dpFiscal = By.xpath("(//span[@class='MuiIconButton-label'])[5]");

	// Processortype:

	private By prcssrType = By.xpath("//div[contains(text(),'TSYS SIERRA')]");

	// FDDetail:

	private By TPPid = By.name("tpp_id");
	private By Serviceid = By.name("service_id");
	private By AppName = By.name("app_name");

	// ADD USER:
	private By userMgtclick = By
			.xpath("//*[@id=\"app-site\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/li[2]/a/span/span");

	// NEW ISO login:

	private By continueButton = By.xpath("//span[@class='MuiButton-label']");
	private By loginButton = By.xpath("//span[contains(text(),'YES')]");

	public AdminPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addISO() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(userMgtadd).click();
	}

	public void addcust() throws InterruptedException {

		driver.findElement(umaddCust).click();
	}

	public void createISO(String custname, String mail, String username, String phone, String firstname,
			String lastname, String add, String zip, String cit) throws InterruptedException {


		Thread.sleep(3000);
		driver.findElement(custName).sendKeys(custname);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(UserName).sendKeys(username);
		driver.findElement(Phone).sendKeys(phone);
		driver.findElement(firstName).sendKeys(firstname);
		driver.findElement(lastName).sendKeys(lastname);
		driver.findElement(address).sendKeys(add);
		driver.findElement(zipCode).sendKeys(zip);
		driver.findElement(city).sendKeys(cit);
		/*
		 * Select select = new Select(driver.findElement(state));
		 * select.selectByValue("XX - India");
		 */

	}

	public void clickNextButton() {
		driver.findElement(nextBtn).click();

	}

	public void DPFiscal() {

		driver.findElement(dpFiscal).click();

	}

	public void processorType() {

		driver.findElement(prcssrType).click();
		List<WebElement> PrcsrType = driver.findElements(By.xpath("(//ul[@role='menu'])[1]/li"));
		System.out.println("Successfully clicked Processor Type" + PrcsrType.size());
		PrcsrType.get(1).click();

	}

	public void Processordetails(String BinNumber, String AgentBankNo, String AgentCode, String ChainNumber,
			String Label, String DebitSharing, String AbaNumber) {

		driver.findElement(bin).sendKeys(BinNumber);
		driver.findElement(addBin).click();
		driver.findElement(agent).sendKeys(AgentBankNo);
		driver.findElement(addagent).click();
		driver.findElement(agentcode).sendKeys(AgentCode);
		driver.findElement(addagentcode).click();
		driver.findElement(chainNumber).sendKeys(ChainNumber);
		driver.findElement(addchainnumber).click();
		driver.findElement(label).sendKeys(Label);
		driver.findElement(debitsharing).sendKeys(DebitSharing);
		driver.findElement(abaNumber).sendKeys(AbaNumber);
		driver.findElement(addaba).click();
		// To click add button on processor info

		// driver.findElement(addagentcode).click();

		driver.findElement(nextBtn).click();

	}

	public void selectallmodule() {
		driver.findElement(selectmodule).click();
		driver.findElement(submitbutton).click();
	}

	public void activationISO() throws InterruptedException {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.open()");
		// driver.get("https://accounts.google.com/");

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://mail.google.com/mail/u/0/#inbox");

		driver.findElement(ed).sendKeys("valorautomation@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(ps).sendKeys("Amma7639552076");
		driver.findElement(By.id("passwordNext")).click();
		for (int i = 0; i < 20; i++) {
			driver.findElement(By.xpath(
					"//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]"))
					.click();
			// Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]"))
					.click();
		}

		driver.findElement(By.xpath(
				"//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]"))
				.click();
		driver.findElement(By.xpath(
				"//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]"))
				.click();
		Thread.sleep(40000);
		// driver.findElement(By.xpath("//body[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Dear Automation shop, VALOR PAYTECH, your payment ')]"))
				.click();
		Thread.sleep(6000);
		WebElement newEML = driver.findElement(By.xpath("//td[@bgcolor='transparent']//p//span"));
		String getEML = newEML.getAttribute("innerHTML");
		System.out.println(getEML);
		driver.findElement(activate).click();
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(2));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='app-login-main-content']//div[1]//div[1]//input[1]"))
				.sendKeys("Valor123");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Valor123");
		driver.findElement(By.xpath("//button[@type='sumbit']")).click();
		// ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		// driver.switchTo().window(tabs2.get(0));

		// driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();

		driver.findElement(By.id("emailtype")).sendKeys(getEML);
		driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
		driver.findElement(continueButton).click();
		// driver.findElement(loginButton).click();
		System.out.println("SUCESSFULLY BORDING FOR ISO  " + " " + getEML);

	}

	public void AddUser() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='quick-menu dropdown'])[3]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
		driver.findElement(By.id("emailtype")).sendKeys("vigneshwaran@valorpaytech.com");
		driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
		driver.findElement(continueButton).click();
		Thread.sleep(3000);
		driver.findElement(loginButton).click();

		driver.findElement(userMgtclick).click();
		driver.findElement(userMgtadd).click();
		List<WebElement> AdminBoardingType = driver.findElements(By.xpath("(//ul[@role='menu'])[1]/li"));
		System.out.println("Successfully clicked for AdminUser" + AdminBoardingType.size());
		AdminBoardingType.get(1).click();
	}
	public void AddUserDetail(String AddUserEmail, String AddUserName, String AddUserMobileNumber, String AddUserFirstName,
			String AddUserLastName) throws InterruptedException {
		
		driver.findElement(email).sendKeys(AddUserEmail);
		driver.findElement(UserName).sendKeys(AddUserName);
		driver.findElement(Phone).sendKeys(AddUserMobileNumber);
		driver.findElement(firstName).sendKeys(AddUserFirstName);
		driver.findElement(lastName).sendKeys(AddUserLastName);
		driver.findElement(nextBtn).click();
		driver.findElement(submitbutton).click();
	}
	public void AddUserActivation() throws InterruptedException {
		
	
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.open()");
		// driver.get("https://accounts.google.com/");

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(3));

		driver.get("https://mail.google.com/mail/u/0/#inbox");
		for (int i = 0; i < 20; i++) {
			driver.findElement(By.xpath(
					"//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]"))
					.click();
			// Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]"))
					.click();
		}

		driver.findElement(By.xpath(
				"//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]"))
				.click();
		driver.findElement(By.xpath(
				"//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]"))
				.click();
		Thread.sleep(40000);
		// driver.findElement(By.xpath("//body[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("//span[@class='bog']//span[@class='bqe'][normalize-space()='Registration']"))
				.click();
		Thread.sleep(6000);
		WebElement ADU1 = driver.findElement(By.xpath("//td[@bgcolor='transparent']//p//span"));
		String ADU2 = ADU1.getAttribute("innerHTML");
		System.out.println(ADU2);
		driver.findElement(activate).click();
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(4));
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Valor123");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Valor123");
		driver.findElement(By.xpath("//button[@type='sumbit']")).click();
		// ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		// driver.switchTo().window(tabs2.get(0));

		// driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();

		driver.findElement(By.id("emailtype")).sendKeys(ADU2);
		driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
		driver.findElement(continueButton).click();
		// driver.findElement(loginButton).click();
		System.out.println("SUCESSFULLY BORDING For AdminUser " + " " + ADU2);

		// driver.findElement(By.xpath("(//button[contains(@type,'button')])[6]")).click();
		// driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();

	}

	public void userLevelUM() throws InterruptedException {
		driver.findElement(userMgtclick).click();

	}

	public void userLevelISO2(String custname2, String UserLevelMail, String UserLevelname, String UserLevelphone, String UserLevelfirstname,
			String UserLevellastname, String UserLeveladd, String UserLevelzip, String UserLevelcit) throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(custName).sendKeys(custname2);
		driver.findElement(email).sendKeys(UserLevelMail);
		driver.findElement(UserName).sendKeys(UserLevelname);
		driver.findElement(Phone).sendKeys(UserLevelphone);
		driver.findElement(firstName).sendKeys(UserLevelfirstname);
		driver.findElement(lastName).sendKeys(UserLevellastname);
		driver.findElement(address).sendKeys(UserLeveladd);
		driver.findElement(zipCode).sendKeys(UserLevelzip);
		driver.findElement(city).sendKeys(UserLevelcit);
		/*
		 * Select select = new Select(driver.findElement(state));
		 * select.selectByValue("XX - India");
		 */

	}
	
	public void UserLevelProcessordetails(String BinNumber, String AgentBankNo, String AgentCode, String ChainNumber,
			String Label, String DebitSharing, String AbaNumber) {
		
		driver.findElement(bin).sendKeys(BinNumber);
		driver.findElement(addBin).click();
		driver.findElement(agent).sendKeys(AgentBankNo);
		driver.findElement(addagent).click();
		driver.findElement(agentcode).sendKeys(AgentCode);
		driver.findElement(addagentcode).click();
		driver.findElement(chainNumber).sendKeys(ChainNumber);
		driver.findElement(addchainnumber).click();
		driver.findElement(label).sendKeys(Label);
		driver.findElement(debitsharing).sendKeys(DebitSharing);
		driver.findElement(abaNumber).sendKeys(AbaNumber);
		driver.findElement(addaba).click();
		// To click add button on processor info

		// driver.findElement(addagentcode).click();

		driver.findElement(nextBtn).click();

		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

	public void userLevelactivationISO2() throws InterruptedException {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.open()");
		// driver.get("https://accounts.google.com/");

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(5));

		driver.get("https://mail.google.com/mail/u/0/#inbox");
		/*
		 * driver.findElement(ed).sendKeys("valorautomation@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).
		 * click(); Thread.sleep(3000);
		 * driver.findElement(ps).sendKeys("Amma7639552076");
		 * driver.findElement(By.id("passwordNext")).click();
		 */
		for (int i = 0; i < 20; i++) {
			driver.findElement(By.xpath(
					"//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]"))
					.click();
			// Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]"))
					.click();
		}

		driver.findElement(By.xpath(
				"//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]"))
				.click();
		driver.findElement(By.xpath(
				"//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]"))
				.click();
		Thread.sleep(40000);
		// driver.findElement(By.xpath("//body[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Dear Automation shop, VALOR PAYTECH, your payment ')]"))
				.click();
		Thread.sleep(6000);
		WebElement newEML = driver.findElement(By.xpath("//td[@bgcolor='transparent']//p//span"));
		String getEML = newEML.getAttribute("innerHTML");
		System.out.println(getEML);
		driver.findElement(activate).click();
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(6));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='app-login-main-content']//div[1]//div[1]//input[1]"))
				.sendKeys("Valor123");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Valor123");
		driver.findElement(By.xpath("//button[@type='sumbit']")).click();
		// ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		// driver.switchTo().window(tabs2.get(0));

		// driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();

		driver.findElement(By.id("emailtype")).sendKeys(getEML);
		driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
		driver.findElement(continueButton).click();
		// driver.findElement(loginButton).click();
		System.out.println("SUCESSFULLY BORDING FOR UserLevelISO  " + " " + getEML);

	}
	
	
	

	public void FDOMAHA(String Tppid, String serviceid, String Appname) throws InterruptedException {

		driver.findElement(TPPid).sendKeys(Tppid);
		driver.findElement(Serviceid).sendKeys(serviceid);
		
		driver.findElement(AppName).sendKeys(Appname);
		
		
		
		

	}

	
	
	
	
}
