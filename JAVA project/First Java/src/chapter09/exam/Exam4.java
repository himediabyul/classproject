package chapter09.exam;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exam4 {
	
	public static void main(String[] args) {
		
		LocalDate birthDay = LocalDate.of(1993, 2, 13);
		LocalDate now = LocalDate.now();
		
		long days = ChronoUnit.YEARS.between(birthDay, now);
		
		System.out.println(birthDay);
		System.out.println(now);
		System.out.println(days);
		
		LocalDate cDay = LocalDate.of(2022, 12, 25);
		
		long days2 = ChronoUnit.DAYS.between(now, cDay);
		System.out.println(days2);
		
		LocalDate dDay = now.plusDays(88);
		System.out.println(dDay);
	}

}
