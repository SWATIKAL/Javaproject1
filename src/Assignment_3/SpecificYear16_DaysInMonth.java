/* Program-16
  
 * No of days in a month in specific year

 */


package Assignment_3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class SpecificYear16_DaysInMonth {
	public static void main(String[] args){
		Calendar ca=new GregorianCalendar(2022,Calendar.DECEMBER,12);
		System.out.println(noOfDaysInaMonth(ca));
	}
	public static int noOfDaysInaMonth(Calendar ca){
		int n=ca.getActualMaximum(Calendar.DAY_OF_MONTH);
	   	return n;
	}

}
