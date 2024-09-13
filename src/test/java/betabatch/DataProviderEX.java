package betabatch;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mmplib.AppLibrary;

public class DataProviderEX {
	@Test(dataProvider="DP")
	public void login(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider(name="DP")
	public String[][] fetchXLSData() throws IOException
	{
		String data[][] = AppLibrary.readXLSX("InputData.xlsx","data");
		return data;
	}
 

}


