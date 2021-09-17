package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class Maaş_ve_zam_oranı_girilen_işçinin_zamlı_maaşını_hesaplama {

	public static void main(String[] args) {
		// Maaşı ve zam oranı girilen işçinin zamlı maaşını hesaplayarak ekranda göster

		
		Scanner scan=new Scanner (System.in);
		System.out.println("lutfen maasinizi giriniz");
		int maas=scan.nextInt();
		
		System.out.println("lutfen istediginiz zam oranini giriniz");
		int zamOrani=scan.nextInt();
		
		double yeniMaas=maas+(maas*zamOrani/100);
		System.out.println("zamli yeni maasiniz : "+ yeniMaas);
		
	}

}
