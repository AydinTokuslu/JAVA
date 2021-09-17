package sorucozumleri_06_temmuz_2021;

import java.util.Scanner;

public class örnek10_benimcozumum {

	public static void main(String[] args) {
		/* TERNARY VE İF İLE YAPILACAK
	    /*
	    A şehrinden uçmak isteyen bir kişi 
	    B şehrine 500km / C şehrine  700km /  D şehrine  900 km mesafededir.
	    km birim fiyati : 0.10$ 
	    12 yasindan kucukse toplam fiyat %50 indirim 
	    12 ve 24 yas arasindaysa 10% indirim
	    65 yasindan buyukse 30% indirim
	    gidis donus bilet alirsa yaş indirimlerinden hariç 20% indirim
	    bu kosullara gore yolcudan gideceği mesafeyi isteyip ucak bilet 
	    ucretini hesaplayan program yazınız
	    */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("gideceğiniz şehir mesafesini yazınız");
		int mesafe=scan.nextInt();
		
		System.out.println("biletiniz tek yön ise 0'ı, gidiş dönüş ise 1'i tuşlayınız. ");
		int bilet=scan.nextInt();
		
		System.out.println("yasınızı giriniz");
		int yas=scan.nextInt();
		
		double bilet_ucreti=mesafe*0.10;
		
		if (bilet==0) {
			if(yas<12) {
				System.out.println("bilet ücretiniz : " + (bilet_ucreti*0.5)+ " $dır.");
			} else if(12<yas && yas<24) {
				System.out.println("bilet ücretiniz : " + (bilet_ucreti*0.9)+ " $dır.");
			}else if(65<yas) {
				System.out.println("bilet ücretiniz : " + (bilet_ucreti*0.7)+ " $dır.");
			}else {
				System.out.println("bilet ücretiniz : " + bilet_ucreti+ " $dır.");
			}
					
		}else {
			if(yas<12) {
				System.out.println("bilet ücretiniz : " + ((2*bilet_ucreti*0.5)-(2*bilet_ucreti*0.2))+ " $dır.");
			} else if(12<yas && yas<24) {
				System.out.println("bilet ücretiniz : " + ((2*bilet_ucreti*0.9)-(2*bilet_ucreti*0.2))+ " $dır.");
			}else if(65<yas) {
				System.out.println("bilet ücretiniz : " + ((2*bilet_ucreti*0.7)-(2*bilet_ucreti*0.2))+ " $dır.");
			}else {
				System.out.println("bilet ücretiniz : " + (2*bilet_ucreti)*0.8+ " $dır.");
			}
			
		} 
		
		
		
		
		
		
	}

}
