package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class ucak_bileti_hesaplama {

	public static void main(String[] args) {
		/*
	    A şehrinden uçamk isteyen bir kişi B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
	    km birim fiyati : 0.10$ 
	    12 yasindan kucukse toplam fiyat %50 indirim 
	    12 ve 24 yas arasindaysa 10% 
	    65 yasindan buyukse 30% 
	    gidis donus alirsa 20% 
	    bu kosullara gore yolcudan gideceği mesafeyi isteyip ucak biletini hesaplayan program
	 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lutfen yasinizi giriniz");
		int yas=scan.nextInt();
		
		System.out.println("lutfen gitmek istediginiz mesafeyi giriniz");
		int mesafe=scan.nextInt();
		
		System.out.println("lutfen tek yon mu gidis donus mu gideceginizi 0 veya 1 girerek belirtiniz");
		int guzergah=scan.nextInt();
		
		double yol_ucreti=mesafe*0.10;
		
		if(guzergah==1) {
			if(yas<12) {
				System.out.println("odemeniz gereken yol ucreti : "+ ((yol_ucreti*0.5)-(yol_ucreti*0.2))+" $‘dir");
			}else if(yas>=12 && yas<24) {
				System.out.println("odemeniz gereken yol ucreti : "+ ((yol_ucreti*0.9)-(yol_ucreti*0.2))+" $‘dir");
			}else if(yas>65) {
				System.out.println("odemeniz gereken yol ucreti : "+ ((yol_ucreti*0.7)-(yol_ucreti*0.2))+" $‘dir");
			}else {
				System.out.println("odemeniz gereken yol ucreti : "+ (yol_ucreti*0.2)+" $‘dir");
			}
			
		}else if(guzergah==0) {
			if(yas<12) {
				System.out.println("odemeniz gereken yol ucreti : "+ (yol_ucreti*0.5)+" $‘dir");
			}else if(yas>=12 && yas<24) {
				System.out.println("odemeniz gereken yol ucreti : "+ (yol_ucreti*0.9)+" $‘dir");
			}else if(yas>65) {
				System.out.println("odemeniz gereken yol ucreti : "+ (yol_ucreti*0.7)+" $‘dir");
			}else {
				System.out.println("odemeniz gereken yol ucreti : "+ yol_ucreti+" $‘dir");
			}
		}else {
			System.out.println("yanlis deger girdiniz");
		}
		
		
		
		

	}

}
