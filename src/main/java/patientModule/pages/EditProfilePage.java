package patientModule.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
@Test
public class EditProfilePage {
	int i;
	WebDriver driver;

	public EditProfilePage(WebDriver driver) {
		this.driver = driver;
	}

	public void editButton() {
		driver.findElement(By.id("Ebtn")).click();
		 driver.findElement(By.xpath("//form[@name ='myform']"));
	}
	
	

	public void editFirstName(String fname) {

		// driver.findElement(By.xpath("//input[@type = 'text']")).clear();

		driver.findElement(By.id("fname")).click();
		driver.findElement(By.id("fname")).clear();
		driver.findElement(By.id("fname")).sendKeys(fname);

	}

	public String editLastName(String lname) {
		driver.findElement(By.id("lname")).clear();
		driver.findElement(By.id("lname")).sendKeys(lname);
		return lname;
	}

	public String editLicence(String licn) {
		driver.findElement(By.id("licn")).clear();
		driver.findElement(By.id("licn")).sendKeys(licn);
		return licn;
	}

	public String editSSN(String ssn) {
		driver.findElement(By.id("ssn")).clear();
		driver.findElement(By.id("ssn")).sendKeys(ssn);
		return ssn;
	}

	public String address(String addr) {
		driver.findElement(By.id("addr")).clear();
		driver.findElement(By.id("addr")).sendKeys(addr);
		return addr;
	}

	public String age(String age) {
		driver.findElement(By.id("age")).clear();
		driver.findElement(By.id("age")).sendKeys(age);
		return age;
	}

	public String weight(String weight) {
		driver.findElement(By.id("weight")).clear();
		driver.findElement(By.id("weight")).sendKeys(weight);
		return weight;
	}

	public String height(String height) {
		driver.findElement(By.id("height")).clear();
		driver.findElement(By.id("height")).sendKeys(height);
		return height;
	}

	public String city(String city) {
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys(city);
		return city;
	}

	public String state(String state) {
		driver.findElement(By.id("state")).clear();
		driver.findElement(By.id("state")).sendKeys(state);
		return state;
	}

	public String zip(String zip) {
		driver.findElement(By.id("zip")).clear();
		driver.findElement(By.id("zip")).sendKeys(zip);
		return zip;
	}

	public String proInfo(String proinfo) {
		driver.findElement(By.id("proinfo")).clear();
		driver.findElement(By.id("proinfo")).sendKeys(proinfo);
		return proinfo;
	}

	public String insInfo(String Insinfo) throws InterruptedException {
		driver.findElement(By.id("Insinfo")).clear();
		driver.findElement(By.id("Insinfo")).sendKeys(Insinfo);
		Thread.sleep(3000);
		return Insinfo;

	}

	// public boolean Save(String expected) {
	// driver.findElement(By.id("Sbtn")).submit();
	// MMPLibrary mmpLib = new MMPLibrary(driver);
	// mmpLib.handleAlerts();
	// String actual = mmpLib.handleAlerts();
	// System.out.println(expected);
	// return actual.equals(expected);

//	}

}

/*
 * public boolean sendMessages(String subject,String message,String expected)
 * throws InterruptedException {
 * driver.findElement(By.id("subject")).sendKeys(subject);
 * driver.findElement(By.id("message")).sendKeys(message);
 * driver.findElement(By.xpath("//input[@value ='Send']")).submit(); MMPLibrary
 * mmpLib = new MMPLibrary(driver); String actual = mmpLib.handleAlerts();
 * return actual.equals(expected); }
 */

/*
 * @Test public void editPatientProfileTests() { i=10; //
 * System.setProperty("webdriver.chrome.driver","path to the chromedriver.exe");
 * // WebDriverManager.chromedriver().setup(); // driver = new ChromeDriver();
 * //driver.get(
 * "http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php")
 * ;
 * 
 * 
 * driver.findElement(By.id("username")).sendKeys("ria1");
 * driver.findElement(By.id("password")).sendKeys("Ria12345");
 * driver.findElement(By.name("submit")).click(); String actual =
 * driver.findElement(By.className("panel-title")).getText().trim(); String
 * expected ="Patient Portal"; Assert.assertEquals(actual, expected); MMPLibrary
 * mmpLib = new MMPLibrary(driver); mmpLib.moduleNavigation("Profile");
 * 
 * driver.findElement(By.xpath("//input[@id= 'Ebtn']")).click();
 * //driver.findElement(By.xpath("//form[@name ='myform']")).clear(); - are we
 * supposed to clear the form first driver.findElement(By.xpath("")).clear();
 * driver.findElement(By.id("fname")).sendKeys("");
 * driver.findElement(By.id("lname")).sendKeys("");
 * driver.findElement(By.id("ssn")).sendKeys("");
 * driver.findElement(By.id("addr")).sendKeys("");
 * driver.findElement(By.id("age")).sendKeys("");
 * driver.findElement(By.id("weight")).sendKeys("");
 * driver.findElement(By.id("height")).sendKeys("");
 * driver.findElement(By.id("city")).sendKeys("");
 * driver.findElement(By.id("height")).sendKeys("");
 * driver.findElement(By.id("state")).sendKeys("");
 * driver.findElement(By.id("zip")).sendKeys(""); driver.findElement(By.
 * xpath("//th[normalize-space() ='Medical RelationShips']"));
 * driver.findElement(By.id("proinfo")).sendKeys("");
 * driver.findElement(By.id("Insinfo")).sendKeys("");
 * driver.findElement(By.id("Sbtn")).click();
 * 
 * 
 * 
 * 
 * 
 * 
 * //String text = Your Profile, has been updated - ok //a[1]/button['View
 * History'] or //button[normalize-space()='View History'] //a[2]/button['View
 * Reports'] or //button[normalize-space()='View Reports']
 * 
 * 
 */
