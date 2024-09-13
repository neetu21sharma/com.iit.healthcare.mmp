package mmplib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AppLibrary {
	public static String getFutureDate(int noofDays, String dateFormat) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, noofDays);
		Date d = cal.getTime();
		System.out.println(cal.getTime());
		SimpleDateFormat sdfObj = new SimpleDateFormat(dateFormat);
		String s = sdfObj.format(d);
		System.out.println(s);
		return s;
	}
	
	
	/*
	 * Calendar calendar = Calendar.getInstance(); int randomYear = (1900); int
	 * dayOfYear = 1 ; calendar.set(Calendar.YEAR, randomYear);
	 * calendar.set(Calendar.DAY_OF_YEAR, dayOfYear); Date randomDoB =
	 * calendar.getTime();
	 */


	public static String generateRandomString()

	{
		/*
		 * Generate the Random Email ID
		 */
		Random rand = new Random();
		int randomNumber = 1 + rand.nextInt(100);// 0 to 99
		// System.out.println("Random number:" + randomNumber);

		int upperCase = 65 + rand.nextInt(26);// 0 to 25
		char upperCaseChar = (char) upperCase;
		// System.out.println("UpperCase Char:::" + upperCaseChar);

		int lowerCase = 97 + rand.nextInt(26);// 0 to 25
		char lowerCaseChar = (char) lowerCase;
		// System.out.println("lowerCase Char:::" + lowerCaseChar);

		String randomString = "AutoTester" + upperCaseChar + lowerCaseChar + randomNumber;
		System.out.println("randomString:::  " + randomString);

		return randomString;
	}

	public static String generateRandomLicenceNumber() {
		Random random = new Random();
		  HashSet<Integer> set= new HashSet<Integer>();
          while(set.size()<1)
          {
              int ran=random.nextInt(99)+10000000;
              set.add(ran);
          }
          int len = 8;
          String random1 = String.valueOf(len);
          for(int  random3:set)
          {
              System.out.println(random1);
              random1=Integer.toString(random3);

          }
		return random1;
}
		
	

	public static String generateRandomssn() {
		Random random = new Random();
		int areaNumber = random.nextInt(900) + 100; // Area number (100-999)
		int groupNumber = random.nextInt(90) + 10; // Group number (10-99)
		int serialNumber = random.nextInt(9000) + 1000; // Serial number (1000-9999)

		// Format and return the SSN
		return String.format("%03d-%02d-%04d", areaNumber, groupNumber, serialNumber);
	}

	public static String generateRandomZip() {
		Random random = new Random();
		 HashSet<Integer> set= new HashSet<Integer>();
         while(set.size()<1)
         {
             int ran=random.nextInt(99)+10000;
             set.add(ran);
         }
         int len = 5;
         String random1 = String.valueOf(len);
         for(int  random3:set)
         {
             System.out.println(random1);
             random1=Integer.toString(random3);

         }
		return random1;
	}

	public static int generateRandomHeight() {
		Random rand = new Random();
		int randomHeight = 1 + rand.nextInt(100);
		return randomHeight;
	}

	public static int generateRandomAge() {
		Random rand = new Random();
		int randomAge = 1 + rand.nextInt(99);
		return randomAge;
	}
	public static int generateRandomWeight() {
		Random rand = new Random();
		int randomWeight = 1 + rand.nextInt(100);
		return randomWeight;
	}
	
	public static String[][] readXLSX(String fileName, String sheetName) throws IOException {
		File f = new File(fileName);
		FileInputStream fs = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheet(sheetName);
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("number of rows" + rows);
		System.out.println("number of columns" + cols);
		String inputData[][] = new String[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				XSSFCell cell = sheet.getRow(i).getCell(j);
				inputData[i][j] = cell.getStringCellValue();
				System.out.println(inputData[i][j]);
			}
			System.out.println();
		}
		return inputData;

	}

	public static String[][] getDBValues(String uname, String pword, String dbname, String tableName, String hostip)
			throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Driver driver = new Driver();
		/*
		 * url a database url of the form jdbc:subprotocol:subnameuser the database user
		 * on whose behalf the connection is being madepassword the user's password
		 */
		String url = "jdbc:mysql://" + hostip + ":3306/" + dbname;
		String username = uname;
		String password = pword;

		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		// int value = stmt.executeUpdate("INSERT INTO `mmp`.`patient_data` VALUES
		// (11,'James','22/11/2021');");
		// System.out.println("The rows are updated "+ value);

		ResultSet rs = stmt.executeQuery("Select * from " + dbname + "." + tableName);
		rs.last();

		int rows = rs.getRow();
		System.out.println("Number of rows " + rows);
		ResultSetMetaData rsmd = rs.getMetaData();
		int cols = rsmd.getColumnCount();
		System.out.println("Number of cols: " + cols);

		String data[][] = new String[rows][cols];
		int i = 0;
		rs.first();
		while (rs.next()) {
			for (int j = 0; j < cols; j++) {
				data[i][j] = rs.getString(j + 1);
				System.out.println(data[i][j]);
				System.out.println("i :::" + i + "@@@@" + "j:::::" + j);
			}
			i++;
		}
		return data;
	}

}
