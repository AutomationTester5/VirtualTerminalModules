package dotClickLabs.UsingAutomationUtils;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import javax.mail.Store;

import com.testing.framework.EmailUtils;

public class testutilities {
	public static void main(String[] args) throws Exception {
		
		EmailUtils emailutils = new EmailUtils();
		
		//emailutils.getUnreadMessageByFromEmail(connection, null, null, null);
		Properties prop = new Properties();
		prop.load(new FileInputStream(""));
		Store connection = emailutils.connectToGmail(prop);
	List<String> emailtext=emailutils.getUnreadMessageByFromEmail(connection, "Inbox", "notify@valoraccess.com", "Notify valorpos");
	if (emailtext.size()<1) 
		throw new Exception("No Email recieved");
	else
	{ 
		String regex="[^\\d]+";
		String[] OTP=emailtext.get(0).split(regex);
		System.out.println("OTP is :"+OTP[1]);
		
	}
		
		
	
		
	}

}
