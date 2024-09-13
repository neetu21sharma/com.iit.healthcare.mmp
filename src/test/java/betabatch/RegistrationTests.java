package betabatch;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mmplib.AppLibrary;
import mmplib.MMPLibrary;
import mmplib.RegistrationBase;
import patientModule.pages.MessagesPage;
import patientModule.pages.RegistrationFramework;

public class RegistrationTests extends RegistrationBase {
	private int noofDays;
	private String d;



	public RegistrationTests() throws IOException {
		super();
		
	}


		
	@Parameters({"fname", "lname", "dob", "license", "ssn", "state", "city", "address", "zipcode", "age", "height", "weight", "pharmacy","pharmacyAddress", "email", "password", "username", "confirmpassword", "selectSecQuestion", "answer" })
		@Test
		public void validateRegister(String fname, String lname, String dob, String license, String ssn, String state, String city, String address, String zipcode, String age, String height, String weight, String pharmacy, String pharmacyAddress, String email, String password, String username, String confirmpassword, String selectSecQuestion, String answer) throws InterruptedException {

		RegistrationFramework fm = new RegistrationFramework(driver);
		fm.registerUrl();
		fm.FirstName(fname);
		fm.LastName(lname );
		fm.DateOfBirth(dob);
		fm.License(license);
		fm.ssn(ssn);
		fm.State(state);
		fm.City(city);
		fm.Address(address);
		fm.Zipcode(zipcode);
		fm.Age(age);
		fm.Height(height);
		fm.Weight(weight);
		fm.Pharmacy(pharmacy);
		fm.PharmaAddress(pharmacyAddress);
		fm.Email(email);
		fm.Password(password);
		fm.Username(username);
		fm.Confirmpassword(confirmpassword);
		fm.Security(selectSecQuestion);
		fm.Answer(answer);
		fm.RegisterSave(driver);
		Assert.assertTrue(true);
	}



@Test
public void validateSendMessagesFunc(String subject, String message, String result) throws Exception
{
MMPLibrary mmpLib = new MMPLibrary(driver);
	mmpLib.login(prop.getProperty("patient_username"), prop.getProperty("patient_password"));
	mmpLib.moduleNavigation("Messages");
	MessagesPage msgPage = new MessagesPage(driver);
	String expectedSubject = subject + AppLibrary.generateRandomString();
	String expectedMessage = message + AppLibrary.generateRandomString();
	String expectedResult = result;
	//to confirm if the message was sent successfully 
	System.out.println(expectedResult);
	boolean output = msgPage.sendMessages(expectedSubject, expectedMessage, expectedResult);
	Assert.assertTrue(output);
	
}

}















/*
 * @Parameters({ "fname" })
 * 
 * @Test(priority = 1) public void validateFirstName(String fname) {
 * 
 * 
 * driver.findElement(By.id("firstname")).clear();
 * driver.findElement(By.id("firstname")).sendKeys(fname);
 * System.out.println(fname); }
 * 
 * @Parameters({ "lname" })
 * 
 * @Test(priority = 2) public void validateLastNameFunc(String lname) {
 * 
 * driver.findElement(By.id("lastname")).clear();
 * driver.findElement(By.id("lastname")).sendKeys(lname);
 * System.out.println(lname); }
 * 
 * @Parameters({ "dob" })
 * 
 * @Test(priority = 3) public void validateDob(String dob) {
 * driver.findElement(By.id("datepicker")).clear();
 * driver.findElement(By.id("datepicker")).sendKeys(dob);
 * System.out.println(dob);
 * 
 * }
 * 
 * @Parameters({ "license" })
 * 
 * @Test(priority = 4) public void validateLicenceFunc(String license) {
 * driver.findElement(By.id("license")).clear();
 * driver.findElement(By.id("license")).sendKeys(license); //String
 * expectedLicence = licence + AppLibrary.generateRandomString();
 * System.out.println(license);
 * 
 * }
 * 
 * @Parameters({ "ssn" })
 * 
 * @Test(priority = 5) public void validateSSNFunc(String ssn) {
 * driver.findElement(By.id("ssn")).clear();
 * driver.findElement(By.id("ssn")).sendKeys(ssn); //String expectedssn = ssn +
 * AppLibrary.generateRandomString(); System.out.println(ssn); }
 * 
 * @Parameters({ "state" })
 * 
 * @Test(priority = 6) public void validateState(String state) {
 * 
 * driver.findElement(By.id("state")).clear();
 * driver.findElement(By.id("state")).sendKeys(state); //String expectedstate =
 * state + AppLibrary.generateRandomString(); System.out.println(state); }
 * 
 * @Parameters({ "city" })
 * 
 * @Test(priority = 7) public void validateCity(String city) {
 * driver.findElement(By.id("city")).clear();
 * driver.findElement(By.id("city")).sendKeys(city); System.out.println(city); }
 * 
 * @Parameters({ "address" })
 * 
 * @Test(priority = 8) public void validateAddressFunc(String address) {
 * driver.findElement(By.id("address")).clear();
 * driver.findElement(By.id("address")).sendKeys(address); //String
 * expectedaddress = address + AppLibrary.generateRandomString();
 * System.out.println(address);
 * 
 * }
 * 
 * @Parameters({ "zipcode" })
 * 
 * @Test(priority = 9) public void validateZip(String zipcode) {
 * 
 * driver.findElement(By.id("zipcode")).clear();
 * driver.findElement(By.id("zipcode")).sendKeys(zipcode); //String expectedzip
 * = zipcode + AppLibrary.generateRandomString(); System.out.println(zipcode); }
 * 
 * @Parameters({ "age" })
 * 
 * @Test(priority = 10) public void validateAgeFunc(String age) {
 * driver.findElement(By.id("age")).clear();
 * driver.findElement(By.id("age")).sendKeys(age); //String expectedage = age +
 * AppLibrary.generateRandomString(); System.out.println(age); }
 * 
 * @Parameters({ "height" })
 * 
 * @Test(priority = 11) public void validateHeight(String height) {
 * driver.findElement(By.id("height")).clear();
 * driver.findElement(By.id("height")).sendKeys(height); String expectedheight =
 * height + AppLibrary.generateRandomString();
 * System.out.println(expectedheight); }
 * 
 * @Parameters({ "weight" })
 * 
 * @Test(priority = 12) public void validateWeightFunc(String weight) {
 * driver.findElement(By.id("weight")).clear();
 * driver.findElement(By.id("weight")).sendKeys(weight); //String expectedweight
 * = weight + AppLibrary.generateRandomString(); System.out.println(weight); }
 * 
 * @Parameters({ "pharmacy" })
 * 
 * @Test(priority = 13) public void validatePharmacy(String pharmacy) {
 * 
 * driver.findElement(By.id("pharmacy")).clear();
 * driver.findElement(By.id("pharmacy")).sendKeys(pharmacy); //String
 * expectedPharmacyInfo = Pharmacy + AppLibrary.generateRandomString();
 * System.out.println(pharmacy); }
 * 
 * @Parameters({ "pharmacyAddress" })
 * 
 * @Test(priority = 14) public void validatePharmacyAddress(String
 * pharmacyAddress) {
 * 
 * driver.findElement(By.id("pharma_adress")).clear();
 * driver.findElement(By.id("pharma_adress")).sendKeys(pharmacyAddress);
 * //String expectedPharAdd = pharmacyAddress +
 * AppLibrary.generateRandomString(); System.out.println(pharmacyAddress); }
 * 
 * @Parameters({ "email" })
 * 
 * @Test(priority = 15) public void validateEmail(String email) {
 * 
 * driver.findElement(By.id("email")).clear();
 * driver.findElement(By.id("email")).sendKeys(email); //String expectedEmail =
 * email + AppLibrary.generateRandomString(); System.out.println(email); }
 * 
 * @Parameters({ "password" })
 * 
 * @Test(priority = 16) public void validatePassword(String password) {
 * 
 * driver.findElement(By.id("password")).clear();
 * driver.findElement(By.id("password")).sendKeys(password); //String
 * expectedPassword = password + AppLibrary.generateRandomString();
 * System.out.println(password); }
 * 
 * @Parameters({ "username" })
 * 
 * @Test(priority = 17) public void validateUsername(String username) {
 * 
 * driver.findElement(By.id("username")).clear();
 * driver.findElement(By.id("username")).sendKeys(username); //String
 * expectedUsername = username + AppLibrary.generateRandomString();
 * System.out.println(username); }
 * 
 * @Parameters({ "confirmpassword" })
 * 
 * @Test(priority = 18) public void validateConfirmpassword(String
 * confirmpassword) {
 * 
 * driver.findElement(By.id("confirmpassword")).clear();
 * driver.findElement(By.id("confirmpassword")).sendKeys(confirmpassword);
 * //String expectedPassword = confirmpassword +
 * AppLibrary.generateRandomString(); System.out.println(confirmpassword); }
 * 
 * @Parameters({ "selectSecQuestion" })
 * 
 * @Test(priority = 19) public void validateSecurityQue(String
 * selectSecQuestion) { driver.findElement(By.id("security")).clear();
 * WebElement seleSec = driver.findElement(By.id("security")); Select sel = new
 * Select(seleSec); sel.selectByValue("what is your pet name");
 * 
 * }
 * 
 * @Parameters({ "answer" })
 * 
 * @Test(priority = 20) public void validateAnswer(String answer) {
 * 
 * driver.findElement(By.id("answer")).clear();
 * driver.findElement(By.id("answer")).sendKeys(answer); //String
 * expectedUsername = username + AppLibrary.generateRandomString();
 * System.out.println(answer); }
 * 
 * 
 * }
 * 
 */	