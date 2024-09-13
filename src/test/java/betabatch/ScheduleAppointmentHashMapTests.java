
package betabatch;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScheduleAppointmentHashMapTests {
	WebDriver driver ;
	@Test
	public void bookAppointmentTests()
	{
		HashMap<String,String> expectedHMap = new HashMap<String,String>();
		HashMap<String,String> actualHMap = new HashMap<String,String>();
		
		//System.setProperty("webdriver.chrome.driver","path to the chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");

		//Login
		driver.findElement(By.id("username")).sendKeys("ria1");
		driver.findElement(By.id("password")).sendKeys("Ria12345");
		driver.findElement(By.name("submit")).click();

		String actual = driver.findElement(By.className("panel-title")).getText().trim();
		String expected ="Patient Portal";
		Assert.assertEquals(actual, expected);
		moduleNavigation("Schedule Appointment");

		///Adding the logic 
		//@author 

		driver.findElement(By.xpath("//input[@value='Create new appointment']")).click();

		String expectedDoctor ="Beth";
		selectDoctor("Pediatrician",expectedDoctor);
		expectedHMap.put("doctor", expectedDoctor);
		
		
		driver.switchTo().frame("myframe");

		driver.findElement(By.id("datepicker")).click();

		driver.findElement(By.xpath("//span[text()='Next']")).click();

		List<WebElement> datesList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		Random rand = new Random();
		int index = rand.nextInt(datesList.size());
		datesList.get(index).click();

		String expectedDate = driver.findElement(By.id("datepicker")).getAttribute("value");
		expectedHMap.put("date", expectedDate);
		
		Select timeSelect = new Select(driver.findElement(By.id("time")));
		String expectedTime = "10Am";
		expectedHMap.put("time", expectedTime);
		timeSelect.selectByVisibleText(expectedTime);

		driver.findElement(By.id("ChangeHeatName")).click();
		driver.switchTo().defaultContent();
		String expectedAppointment = generateRandomString();
		expectedHMap.put("sym", expectedAppointment);
		driver.findElement(By.id("sym")).sendKeys(expectedAppointment);
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		actualHMap.put("date",driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[1]")).getText());
		actualHMap.put("time",driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[2]")).getText());
		actualHMap.put("sym",driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[3]")).getText());
		actualHMap.put("doctor",driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[4]")).getText());
 
		Assert.assertTrue(actualHMap.equals(expectedHMap));

	}


public void moduleNavigation(String moduleName)
	{
		driver.findElement(By.xpath("//span[contains(text(),'"+moduleName+"')]")).click();
	}
	public void selectDoctor(String departmentName,String doctorName)
	{
		driver.findElement(By.xpath("//p[text()='Description:"+departmentName+"']/parent::div/preceding-sibling::"
				+ "h4[text()='Dr."+doctorName+"']/ancestor::ul/following-sibling::button")).click();

	}
	public String generateRandomString()
	{
		/*
		 * Generate the Random Email ID
		 */
		Random rand = new Random();
		int randomNumber = 1+rand.nextInt(100);//0 to 99
		//System.out.println("Random number:" + randomNumber);

		int upperCase = 65+rand.nextInt(26);//0 to 25
		char upperCaseChar = (char) upperCase;
		//System.out.println("UpperCase Char:::" + upperCaseChar);


		int lowerCase = 97+rand.nextInt(26);//0 to 25
		char lowerCaseChar = (char) lowerCase;
		//System.out.println("lowerCase Char:::" + lowerCaseChar);


		String randomString="AutoTester"+upperCaseChar+lowerCaseChar+randomNumber;
		System.out.println("randomString:::  " + randomString);

		return randomString;
	}
}