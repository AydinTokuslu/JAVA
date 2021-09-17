package day30_Agustos_02_2021_dersi_LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("aktuel tarih ve zaman : "+ldt);//aktuel tarih ve zaman : 2021-08-02T22:04:37.768207
		
		LocalDate d=LocalDate.of(2016, 1, 10);
		LocalTime t=LocalTime.of(13, 30);
		
		LocalDateTime ldt1=LocalDateTime.of(d, t);
		System.out.println(d);// 2016-01-10
		System.out.println(t);// 13:30
		System.out.println(ldt1);// 2016-01-10T13:30
		
		System.out.println(ldt.getHour()); // 22
		

	}

}
