package day30_Agustos_02_2021_dersi_LocalDate;

import java.time.LocalDate;

public class C05_ComparingDateAndTime {

	public static void main(String[] args) {
		
		LocalDate bugun=LocalDate.now();//bugunun tarihi
		LocalDate date=LocalDate.of(2020, 11, 15);
		int fark=bugun.compareTo(date);
		System.out.println(bugun);
		System.out.println(date);
		System.out.println(fark);//karsilastirilan iki tarihin en buyuk parcasinin farkini verir
		
		

	}

}
