package org.iit.healthcare;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {

	public static void main(String[] args) {
		
		getFutureDate(0,"d/MMMM/YYYY");
		getFutureDate(365,"d/MM/YYYY");
		getFutureDate(200,"d/MMMM/YY");
		getFutureDate(60,"d/MMMM/YYYY");
		
	}
	public static String getFutureDate(int noofDays,String dateFormat)
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, noofDays);
		Date d = cal.getTime();
		System.out.println(cal.getTime());
		SimpleDateFormat sdfObj = new SimpleDateFormat(dateFormat);
		String s = sdfObj.format(d);
		System.out.println(s);
		return s;
//		String dateArr[] = s.split("/");
//		System.out.println("DD::" + dateArr[0]);
//		System.out.println("MMMM::" + dateArr[1]);
//		System.out.println("YYYY::" + dateArr[2]);
	}
}
