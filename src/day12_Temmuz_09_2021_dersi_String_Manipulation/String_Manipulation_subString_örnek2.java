package day12_Temmuz_09_2021_dersi_String_Manipulation;

import java.util.Scanner;

public class String_Manipulation_subString_örnek2 {

	public static void main(String[] args) {
		
		/* Soru 7) Kullanicidan ismini, soyismini ve kredi karti 
		 * bilgisini isteyin ve asagidaki gibi yazdirin
		 
		 isim-soyisim : M***** B*******
		 kart no : **** **** **** 1234      */
		 
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen isminizi giriniz ");
		String isim=scan.nextLine();
		
		System.out.println("lütfen soyisminizi giriniz ");
		String soyisim=scan.nextLine();
		
		System.out.println("lütfen kart numaranızı giriniz ");
		String kkNo=scan.nextLine();
		
		String isimDuzenlenmis = isim.substring(0,1).toUpperCase() + //ilk harfi büyüğe çevirir.
								isim.substring(1).replaceAll("\\w", "*"); //ilk harften sonraki tüm harfleri *'a çevirir.
		
		String soyisimDuzenlenmis = soyisim.substring(0,1).toUpperCase() + //ilk harfi büyüğe çevirir.
				soyisim.substring(1).replaceAll("\\S", "*"); //ilk harften sonraki tüm harfleri *'a çevirir.

		String kkNoDuzenlenmis = "**** **** **** " + kkNo.substring(15);
		
		System.out.println("isim-soyisim : " + isimDuzenlenmis + " " + soyisimDuzenlenmis
				+ "\nkart no : " + kkNoDuzenlenmis);
		scan.close();
		
	}

}
