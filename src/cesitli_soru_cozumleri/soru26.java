package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru26 {

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

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen gideceginiz mesafeyi km olarak giriniz");
		int mesafe=scan.nextInt();
		
		System.out.println("lutfen yasinizi giriniz");
		int yas=scan.nextInt();
		
		System.out.println("lutfen gidis donus mu yoksa tek yon mu oldugunu yaziniz, gidis donus icin : 1, tek yon icin : 0 yaziniz.");
		int bilet=scan.nextInt();
		
		double odeme=mesafe*0.10;
		
		if(bilet==1) {
			if(yas<12) {
				System.out.println("bilet ucretiniz : " + ((odeme*0.5)-(odeme*0.2)) + "$‘dir.");
			}else if(yas>=12 && yas<=24) {
				System.out.println("bilet ucretiniz : " + ((odeme*0.9)-(odeme*0.2)) + "$‘dir.");
			}else if(yas>65) {
				System.out.println("bilet ucretiniz : " + ((odeme*0.7)-(odeme*0.2)) + "$‘dir.");
			}else {
				System.out.println("bilet ucretiniz : " + (odeme-(odeme*0.2)) + "$‘dir.");
			}
			
		}else if(bilet==0) {
			if(yas<12) {
				System.out.println("bilet ucretiniz : " + (odeme*0.5) + "$‘dir.");
			}else if(yas>=12 && yas<=24) {
				System.out.println("bilet ucretiniz : " + (odeme*0.9) + "$‘dir.");
			}else if(yas>65) {
				System.out.println("bilet ucretiniz : " + (odeme*0.7) + "$‘dir.");
			}else {
				System.out.println("bilet ucretiniz : " + odeme + "$‘dir.");
			}
		}else {
			System.out.println("hatali giris yaptiniz");
		}
		
		scan.close();
		
	}

}
