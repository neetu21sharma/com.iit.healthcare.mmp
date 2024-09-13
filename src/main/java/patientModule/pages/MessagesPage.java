package patientModule.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import mmplib.MMPLibrary;

public class MessagesPage {
	
	WebDriver driver;
	public MessagesPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public boolean sendMessages(String subject,String message,String expected) throws InterruptedException
	{
		driver.findElement(By.id("subject")).sendKeys(subject);
		driver.findElement(By.id("message")).sendKeys(message);
		driver.findElement(By.xpath("//input[@value ='Send']")).submit();
		MMPLibrary mmpLib = new MMPLibrary(driver);
		//you call handleAlerts() method from MMpLibrary and it will return the message. Then you compare the actual with 
		//expected.
		String actual = mmpLib.handleAlerts();
		return actual.equals(expected);
	}

	

}
