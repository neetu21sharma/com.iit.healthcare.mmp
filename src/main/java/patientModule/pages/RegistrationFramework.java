
package patientModule.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import mmplib.AppLibrary;

public class RegistrationFramework {

	WebDriver driver;

	public RegistrationFramework(WebDriver driver) {
		this.driver = driver;

	}

	public void registerUrl() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Register']")).click();

	}

	public void FirstName(String fname) {

		WebElement fnameTextField = driver.findElement(By.id("firstname"));
		fnameTextField.sendKeys(fname);
		System.out.println(fname);
		

	}

	public void LastName(String lname) {
		WebElement lnameTextField = driver.findElement(By.id("lastname"));
		lnameTextField.sendKeys(lname);
		// hMap.put("lastname", lnameTextField.getAttribute("value"));

	}
	
	  public void DateOfBirth(String date) {
		
	  SimpleDateFormat sdf = new SimpleDateFormat("MM/D/YYYY"); 
	  Date d = new Date(); 
	  WebElement dobTextField = driver.findElement(By.id("datepicker"));
	  dobTextField.sendKeys(sdf.format(d)); 
	  System.out.println("The date is :" +  d);
	
	 
	  }
		
		
		
		
		
		// SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY");
		//sdf.format(dob);
		//WebElement dobTextField = driver.findElement(By.id("datepicker"));
		//dobTextField.sendKeys(dob+ AppLibrary.generateRandomString());
		//dobTextField.sendKeys(dob);
		//System.out.println("The date is :" + dob);




	

	public void License(String license) {
		WebElement licTextField = driver.findElement(By.id("license"));
		licTextField.sendKeys(license + AppLibrary.generateRandomLicenceNumber());
		// hMap.put("license", licTextField.getAttribute("value"));
		System.out.println(license);

	}

	public void ssn(String ssn) {

		WebElement ssnTextField = driver.findElement(By.id("ssn"));
		ssnTextField.sendKeys(ssn+ AppLibrary.generateRandomssn());

	}

	public void State(String state) {
		WebElement stateTextField = driver.findElement(By.id("state"));
		stateTextField.sendKeys(state);//+ AppLibrary.generateRandomString());
		// hMap.put("state", stateTextField.getAttribute("value"));

	}
	

	public void City(String city) {
		WebElement cityTextField = driver.findElement(By.id("city"));
		cityTextField.sendKeys(city);//+ AppLibrary.generateRandomString());

	}

	public void Address(String address) {
		WebElement addrTextField = driver.findElement(By.id("address"));
		addrTextField.sendKeys(address);//+ AppLibrary.generateRandomString());

	}

	public void Zipcode(String zipcode) {
		WebElement zipTextField = driver.findElement(By.id("zipcode"));
		zipTextField.sendKeys(zipcode + AppLibrary.generateRandomZip());
		// hMap.put("zipcode", zipTextField.getAttribute("value"));

	}
	

	public void Age(String age) {
		WebElement ageTextField = driver.findElement(By.id("age"));
		ageTextField.sendKeys(age + AppLibrary.generateRandomAge());//generateRandomString());
		// hMap.put("age", ageTextField.getAttribute("value"));
		System.out.println(age);
	}

	public void Height(String height) {
		WebElement heightTextField = driver.findElement(By.id("height"));
		heightTextField.sendKeys(height+ AppLibrary.generateRandomHeight());
		// hMap.put("height", heightTextField.getAttribute("value"));

	}

	public void Weight(String weight) {
		WebElement weightTextField = driver.findElement(By.id("weight"));
		weightTextField.sendKeys(weight);//+ AppLibrary.generateRandomString());
		// hMap.put("weight", weightTextField.getAttribute("value"));

	}

	public void Pharmacy(String pharmacy) {
		WebElement pharmacyTextField = driver.findElement(By.id("pharmacy"));
		pharmacyTextField.sendKeys(pharmacy);//+ AppLibrary.generateRandomString());
		// hMap.put("pharmacy", pharmacyTextField.getAttribute("value"));

	}

	public void PharmaAddress(String pharmacyAddress) {
		WebElement pharmaddrTextField = driver.findElement(By.id("pharma_adress"));
		pharmaddrTextField.sendKeys(pharmacyAddress);//+ AppLibrary.generateRandomString());
		// hMap.put("pharma_adress", pharmaddrTextField.getAttribute("value"));

	}

	public void Email(String email) {
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys(email);//+ AppLibrary.generateRandomString());
		// hMap.put("email", emailTextField.getAttribute("value"));

	}

	public void Password(String password) {
		WebElement passTextField = driver.findElement(By.id("password"));
		passTextField.sendKeys(password);//+ AppLibrary.generateRandomString());
		// hMap.put("password", passTextField.getAttribute("value"));

	}

	public void Username(String username) {
		WebElement uNameTextField = driver.findElement(By.id("username"));
		uNameTextField.sendKeys(username);//+ AppLibrary.generateRandomString());
		// hMap.put("username", uNameTextField.getAttribute("value"));
	}

	public void Confirmpassword(String confirmpassword) {
		WebElement conPassTextField = driver.findElement(By.id("confirmpassword"));
		conPassTextField.sendKeys(confirmpassword);//+ AppLibrary.generateRandomString());
		// hMap.put("password", conPassTextField.getAttribute("value"));

	}

	public void Security(String selSecQuestion) {
		WebElement seleSec = driver.findElement(By.id("security"));
		Select sel = new Select(seleSec);
		sel.selectByValue(selSecQuestion);

	}

	public void Answer(String ans) {
		WebElement answerTextField = driver.findElement(By.id("answer"));
		answerTextField.sendKeys(ans);//+ AppLibrary.generateRandomString());

	}

	public String RegisterSave(WebDriver driver)

	{
		this.driver = driver;
		WebElement submitTextField = driver.findElement(By.name("register"));
		submitTextField.click();
		return "";
	}

}
