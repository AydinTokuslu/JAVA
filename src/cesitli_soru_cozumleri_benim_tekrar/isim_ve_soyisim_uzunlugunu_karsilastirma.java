package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class isim_ve_soyisim_uzunlugunu_karsilastirma {

	public static void main(String[] args) {
		// Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen isminizi giriniz");
		String isim=scan.nextLine();
		
		System.out.println("lutfen soyisminizi giriniz");
		String soyisim=scan.nextLine();
		
		if(isim.length()>soyisim.length()) {
			System.out.println("isminiz soyisminizden daha uzundur");
		}else if(isim.length()<soyisim.length()){
			System.out.println("soyisminiz isminizden daha uzundur");
		}else {
			System.out.println("isminiz ve soyisminizin uzunlugu esittir.");
		}
		
		
		

	}

}
