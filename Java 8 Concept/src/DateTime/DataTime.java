package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DataTime {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalDate Age = LocalDate.of(1998, Month.JANUARY, 22);
		System.out.println(Age);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);

		LocalTime t1 = LocalTime.of(12, 35);
		System.out.println(t1);

		LocalTime t2 = LocalTime.now(ZoneId.of("ISD"));
		System.out.println(t2);

		for(String s: ZoneId.getAvailableZoneIds()) {
			System.out.println(s+" ");
		}
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		
	
	}
}
