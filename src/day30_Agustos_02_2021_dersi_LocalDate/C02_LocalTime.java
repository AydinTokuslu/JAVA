package day30_Agustos_02_2021_dersi_LocalDate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C02_LocalTime {

	public static void main(String[] args) {
		

		LocalTime zaman=LocalTime.now();
		System.out.println("aktuel zaman : "+zaman);
		
		LocalTime time1=LocalTime.of(12, 35, 23);
		System.out.println(time1);
		
		System.out.println("su zamandan 2 saat ileri 34 dk geri 45 sn ileri : "+zaman.plusHours(2).minusMinutes(34).plusSeconds(45));
		
		LocalTime zaman2=LocalTime.now();
		System.out.println();
		System.out.println(zaman2);
		
		//ulke saatleri hesaplama:
		ZonedDateTime Japan=ZonedDateTime.now(ZoneId.of("Japan"));
		System.out.println(Japan);
		
		ZonedDateTime baskaUlke=ZonedDateTime.now(ZoneId.of("Europe/Amsterdam"));
	    System.out.println(baskaUlke);
		
		
	}

}
