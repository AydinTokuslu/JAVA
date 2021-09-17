package day30_Agustos_02_2021_dersi_LocalDate;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDate tarih=LocalDate.now();//bugunun tarihi
		LocalDate date=LocalDate.of(2020, 5, 15);
		
		/*
         * yy: YILIN SON iKi RAKAMI
         * yyyy : yılın tamamını
         * y : yılın tamamını
         * M : ay sırasını verir TEMMUZ için : 7
         * MM:  ay sırasını veriri TEMMUZ için : 07
         * MMM . ay isminin ilkuc harfini verir. JUL
         * MMMM : ay isminin tamamını verir
         * HH 24 saat dilimi/formati uzerinden
         * hh 12 saat dilimi/formati uzerinden
         */
		
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yy");// 02/8/21
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM/yy");// 15/05/20
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MMM/yy");// 02/Aug/21
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd$M$yyyy");// 15$5$2020
		
		System.out.println(dtf.format(tarih));
		System.out.println(dtf1.format(date));
		System.out.println(dtf2.format(tarih));
		System.out.println(dtf3.format(date));
		
		// kac yasindayiz?
		
		LocalDate dt=LocalDate.of(2005, 03, 05);
		System.out.println("bugunun tarihi : "+tarih);//bugunun tarihi : 2021-08-02
		System.out.println("faruk dogum tarihi : "+dt);// faruk dogum tarihi : 2005-03-05
		Period yasim=Period.between(dt, tarih);
		System.out.println("faruk beyin yasi "+yasim);// P16Y4M28D (period 16 year 4 month 28 day)
		System.out.println(yasim.getYears());//16
		
		LocalDate dt2=LocalDate.of(1979, 01, 12);
		System.out.println("bugunun tarihi : "+tarih);//bugunun tarihi : 2021-08-02
		System.out.println("benim dogum tarihi : "+dt2);// faruk dogum tarihi : 1979-01-12
		Period yasim2=Period.between(dt2, tarih);
		System.out.println("benim yasim "+yasim2);// P42Y6M21D (period 42 year 6 month 21 day)
		
		
		
		
		
		
		
		
		
	}

}
