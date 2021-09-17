package day12_Temmuz_09_2021_dersi_String_Manipulation;

import java.util.Scanner;

public class örnek2_deneme {

	public static void main(String[] args) {
		/* Soru 7) Kullanicidan ismini, soyismini ve kredi karti 
		 * bilgisini isteyin ve asagidaki gibi yazdirin
		 
		 isim-soyisim : M***** B*******
		 kart no : **** **** **** 1234      */

		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen isminizi giriniz");
		String isim=scan.nextLine();
		
		System.out.println("lütfen soyisminizi giriniz");
		String soyisim=scan.nextLine();
		
		System.out.println("lütfen 16 haneli kart bilgilerinizi aralarında boşluk bırakarak giriniz");
		String kkNo=scan.nextLine();
		
		String isimDüzenlenmis= isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		String soyisimDüzenlenmis= soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\S", "*");
		String kkNoDüzenlenmis= "**** **** **** " + kkNo.substring(15);
		
		System.out.println("isim-soyisim : " + isimDüzenlenmis + " " + soyisimDüzenlenmis + "\nkart no : " + kkNoDüzenlenmis);
		
		scan.close();
	}

}
