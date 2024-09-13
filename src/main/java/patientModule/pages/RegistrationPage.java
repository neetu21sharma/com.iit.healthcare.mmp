package patientModule.pages;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class RegistrationPage {
	
//	public RegistrationPage(WebDriver driver)
	//{
	//	this.driver = driver;
	//}
	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/registration.php");
	
	HashMap<String, String> hMap = new HashMap<String, String>();
	Random rnd = new Random();

	//public void FirstName()
	
		WebElement fnameTextField = driver.findElement(By.id("firstname"));
		fnameTextField.sendKeys("Ram");
		hMap.put("firstname", fnameTextField.getAttribute("value"));
		System.out.println("value");
	
	//public void LastName()
	
		WebElement lnameTextField = driver.findElement(By.id("lastname"));
		lnameTextField.sendKeys("Ram");
		hMap.put("lastname", lnameTextField.getAttribute("value"));
	
	//public void DateOfBirth()
	
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY");
		Date d = new Date();
		WebElement dobTextField = driver.findElement(By.id("datepicker"));                  
		dobTextField.sendKeys(sdf.format(d));
		hMap.put("datapicker", dobTextField.getAttribute("value"));
		System.out.println("The date is :" + d);
		
		WebElement licTextField = driver.findElement(By.id ("license"));
		licTextField.sendKeys("23442666");
		hMap.put("license", licTextField.getAttribute("value"));
		System.out.println(licTextField);
		
		WebElement ssnTextField = driver.findElement(By.id("ssn"));
		ssnTextField.sendKeys("523668871");
		hMap.put("ssn", ssnTextField.getAttribute("value"));
		
		WebElement stateTextField = driver.findElement(By.id("state"));
		stateTextField.sendKeys("Florida");
		hMap.put("state",stateTextField.getAttribute("value"));
		
		WebElement cityTextField = driver.findElement(By.id("city"));
		cityTextField.sendKeys("Orlando");
		hMap.put("city",cityTextField.getAttribute("value"));
		
		WebElement addrTextField = driver.findElement(By.id("address"));
		addrTextField.sendKeys("312 Alley Street");
		//hMap.put("address", addrTextField.getAttribute("value"));
		
		WebElement zipTextField = driver.findElement(By.id("zipcode"));
		zipTextField.sendKeys("80325");
		hMap.put("zipcode", zipTextField.getAttribute("value"));
		
		WebElement ageTextField = driver.findElement(By.id("age"));
		ageTextField.sendKeys("20");
		hMap.put("age", ageTextField.getAttribute("value"));
		System.out.println(ageTextField);
		
		WebElement heightTextField = driver.findElement(By.id("height"));
		heightTextField.sendKeys("162.1");
		hMap.put("height", heightTextField.getAttribute("value"));
		
		WebElement weightTextField = driver.findElement(By.id("weight"));
		weightTextField.sendKeys("120");
		hMap.put("weight", weightTextField.getAttribute("value"));
		
		WebElement pharmacyTextField = driver.findElement(By.id("pharmacy"));
		pharmacyTextField.sendKeys("WalGreens");
		hMap.put("pharmacy",pharmacyTextField.getAttribute("value"));
		
		WebElement pharmaddrTextField = driver.findElement(By.id("pharma_adress"));
		pharmaddrTextField.sendKeys("19th street, Florida Ave, FL");
		hMap.put("pharma_adress", pharmaddrTextField.getAttribute("value"));
		
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys("1233@gmail.com");
		hMap.put("email", emailTextField.getAttribute("value"));
		
		WebElement passTextField = driver.findElement(By.id("password"));
		passTextField.sendKeys("Ramtest01");
		hMap.put("password", passTextField.getAttribute("value"));
		
		WebElement uNameTextField = driver.findElement(By.id("username"));
		uNameTextField.sendKeys("Ram01");
		hMap.put("username",uNameTextField.getAttribute("value"));
		
		WebElement conPassTextField = driver.findElement(By.id("confirmpassword"));
		conPassTextField.sendKeys("Ramtest01");
		hMap.put("password", conPassTextField.getAttribute("value"));
		
		
		WebElement seleSec = driver.findElement(By.id("security"));
		Select sel = new Select(seleSec);
		sel.selectByValue("what is your pet name");
		

		WebElement answerTextField = driver.findElement(By.id("answer"));
		answerTextField.sendKeys("Ani");
		hMap.put("answer",answerTextField.getAttribute("value"));
		
		WebElement submitTextField = driver.findElement(By.name("register"));
		submitTextField.click();
		
		
		
		
		
		
		
		
		
;		
		
		
		
		
		
	}
}
