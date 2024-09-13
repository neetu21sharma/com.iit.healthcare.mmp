package betabatch;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import mmplib.AppLibrary;
import mmplib.BaseClass;
import mmplib.MMPLibrary;
import patientModule.pages.EditProfilePage;
import patientModule.pages.MessagesPage;

public class EditProfileTests extends BaseClass {
	public EditProfileTests() throws IOException {
		super();
		
	}


	public void login() {
		MMPLibrary mmpLib = new MMPLibrary(driver);
		mmpLib.login(prop.getProperty("patient_username"), prop.getProperty("patient_password"));
		mmpLib.moduleNavigation("Profile");
	}

	//@Parameters({"fname", "lname","license", "ssn", "address", "age", "weight", "height", "city", "state", "zip", "proinfo", "insinfo"})

	public void validateEditProfile(String fname, String lname, String ssn, String license,  String state, String city, String address, String zip, String age, String height, String weight, String proinfo, String insinfo) throws InterruptedException {
				{
						
				EditProfilePage ep = new EditProfilePage(driver);
			ep.editButton();
				ep.age(age);
				ep.editLicence(license);
				ep.editSSN(ssn);
				ep.state(state);
				ep.city(city);
				/*fm.Address(address);
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
				//fm.RegisterSave(driver);
				Assert.assertTrue(true);*/
			}



	@Test
	public void validateSendMessagesFunc(String subject, String message, String result) throws Exception {
		MMPLibrary mmpLib = new MMPLibrary(driver);
		mmpLib.login(prop.getProperty("patient_username"), prop.getProperty("patient_password"));
		mmpLib.moduleNavigation("Messages");
		MessagesPage msgPage = new MessagesPage(driver);
		String expectedSubject = subject + AppLibrary.generateRandomString();
		String expectedMessage = message + AppLibrary.generateRandomString();
		String expectedResult = result;
		// to confirm if the message was sent successfully
		System.out.println(expectedResult);
		boolean output = msgPage.sendMessages(expectedSubject, expectedMessage, expectedResult);
		AssertJUnit.assertTrue(output);

	}

}

/*
 * public class SendMessagesTests extends BaseClass {
 * 
 * @Parameters({"subject", "message", "result"})
 * 
 * @Test public void validateSendMessagesFunc(String subject, String message,
 * String result) throws InterruptedException{ MMPLibrary mmpLib = new
 * MMPLibrary(driver); mmpLib.login(prop.getProperty("patient_username"),
 * prop.getProperty("patient_password")); mmpLib.moduleNavigation("Messages");
 * MessagesPage msgPage = new MessagesPage(driver); String expectedSubject =
 * subject + AppLibrary.generateRandomString(); String expectedMessage = message
 * + AppLibrary.generateRandomString(); String expectedResult = result; //to
 * confirm if the message was sent successfully
 * System.out.println(expectedResult); boolean output =
 * msgPage.sendMessages(expectedSubject, expectedMessage, expectedResult);
 * Assert.assertTrue(output);
 * 
 * }
 * 
 * }
 */
