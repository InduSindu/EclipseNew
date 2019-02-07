package system;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class GetCurrentDate {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		Month month = date.getMonth();
		//System.out.println(date.getMonth());
		DayOfWeek DOW = date.getDayOfWeek();
		
		int years = date.getYear();
		System.out.println(date.plusDays(30));
		System.out.println(date.minusDays(15));
	  // System.out.println("Month=" + month + "DOW=" + DOW + "Years=" + years);

	}

}
