package mmplib;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationBase {

	protected WebDriver driver;// null
	ProjectConfiguration projConfig;
	protected Properties prop;
	String environment, browserType;

	public RegistrationBase() throws IOException {
		readPropertyFile();
	}

	public void readPropertyFile() throws IOException {
		projConfig = new ProjectConfiguration();
		prop = projConfig.loadProperties("config/mmp.properties");
		environment = prop.getProperty("environment");
		browserType = prop.getProperty("browserType");
		
		if (environment.equals("qa") && browserType.equals("chrome")) 
		{
			
			//WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			prop = projConfig.loadProperties("config/mmp_registration.properties");
			//System.out.println("Reading the registration_url" +prop.entrySet());
			driver.get(prop.getProperty("patient_url"));
			driver.manage().window().maximize();

		}
		
	}
}
/*
 * // remove comment after testing Registration page - 08/27
 * 
 * // @BeforeClass// for each and every class it will trigger once - keeping 3
 * // classes in mind
 * 
 * public void instantiateDriver() throws IOException { System.out.println(
 * "Executing the testcases on the environment::: " + environment +
 * "::: browserType::::" + browserType);
 * 
 * if (environment.equals("qa") && browserType.equals("chrome")) {
 * 
 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); prop =
 * projConfig.loadProperties("config/mmp_registration.properties");
 * //System.out.println("Reading the patient_url" +prop.entrySet());
 * driver.get(prop.getProperty("registration_url"));
 * driver.manage().window().maximize();
 * 
 * }
 * 
 * } }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * package mmplib;
 * 
 * import java.io.IOException; import java.util.Properties;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import org.testng.annotations.Test;
 * 
 * 
 * public class RegistrationBase {
 * 
 * protected WebDriver driver;//null ProjectConfiguration projConfig; protected
 * Properties prop; String environment,browserType;
 * 
 * //public static void main(String[] args) throws Exception {
 * //RegistrationBase b = new RegistrationBase(); //b.instantiateDriver();
 * //b.readPropertyFile(); //}
 * 
 * @Test public void readPropertyFile() throws IOException { driver = new
 * ChromeDriver(); projConfig = new ProjectConfiguration(); prop =
 * projConfig.loadProperties("config/mmp_registration.properties");
 * 
 * environment = prop.getProperty("environment"); browserType =
 * prop.getProperty("browserType");
 * driver.get(prop.getProperty("registration_url"));
 * 
 * driver.manage().window().maximize();
 * 
 * } } //remove comment after testing Registration page - 08/27
 * 
 * // @BeforeClass// for each and every class it will trigger once - keeping 3
 * // classes in mind public void instantiateDriver() throws IOException {
 * driver = new ChromeDriver();
 * System.out.println("Executing the testcases on the environment::: "
 * +environment +"::: browserType::::" + browserType);
 * 
 * if(environment.equals("dev") && browserType.equals("chrome")) { prop =
 * projConfig.loadProperties("config/mmp_registration.properties"); }
 * 
 * 
 * System.out.println("Reading the patient_url" +prop.entrySet()); //
 * driver.get(prop.getProperty("registration_url"));
 * 
 * //driver.manage().window().maximize();
 * 
 * // }
 * 
 * //}
 * 
 * 
 * 
 * 
 * 
 * 
 */