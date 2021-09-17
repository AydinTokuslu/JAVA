package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru8 {

	public static void main(String[] args) {
		// Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun
        // oldugunu yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen isminizi giriniz");
		String isim=scan.nextLine();
		
		System.out.println("lutfen soyisminizi giriniz");
		String soyisim=scan.nextLine();

		if(isim.length()>soyisim.length()) {
			System.out.println("isminiz, soyisminizden uzundur");
		}else if(soyisim.length()>isim.length()) {
			System.out.println("soyisminiz, isminizden uzundur");
		}else {
			System.out.println("isim ve soyisminiz esit uzunluktadir.");
		}
		
		scan.close();
		
		
		
		
		
	}

}
