package day30_Agustos_02_2021_dersi_LocalDate;

import java.time.LocalDate;

public class C01_LocalDate {

	public static void main(String[] args) {
		
		LocalDate tarih=LocalDate.now();
		System.out.println("bugunun tarihi : " + tarih);//bugunun tarihi : 2021-08-03
		
		System.out.println("bugunden 21 gun sonrasi : " + tarih.plusDays(21));
		
		System.out.println("bugunden 3 yil sonrasi : " + tarih.plusYears(3));
		
		System.out.println("bugunden 3 gun 5 ay 2 yil sonrasi : " + tarih.plusDays(3).plusMonths(5).plusYears(2));
		
		System.out.println("bugunden 40 gun oncesi : " + tarih.minusDays(40));
		
		System.out.println("bugunun 5 yil oncesi 2 ay sonrasi 3 hafta ertesi : " + tarih.minusYears(5).plusMonths(2).plusWeeks(3));
		
		
		
		/*
		 * LocalDate classindan uretilen obje method chain kuralina uyar ve methodlar ayni (homojen) olmak zorunda degildir. EX15.satir.
		 */
		
		System.out.println(tarih.getDayOfMonth());//3
		System.out.println(tarih.getDayOfYear());//215
		System.out.println(tarih.getYear());//2021
		System.out.println(tarih.getDayOfWeek());//TUESDAY
		System.out.println(tarih.getMonth());//AUGUST
		System.out.println(tarih.getEra());//CE
		
		LocalDate dogmGnDate=LocalDate.of(1979, 1, 12);
		System.out.println("dogum tarihi : " + dogmGnDate);// dogum tarihi : 1979-01-12
		System.out.println("dogum gunu : " + dogmGnDate.getDayOfWeek()); // dogum gunu : FRIDAY
		
		System.out.println(tarih.isAfter(dogmGnDate));//true
		System.out.println(dogmGnDate.isBefore(tarih));//true
		
		System.out.println("bugun artik yil mi : "+ tarih.isLeapYear());//artik yili bulma//false
		
		
		
		
		
	}

}
