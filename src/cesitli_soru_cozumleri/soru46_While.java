package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru46_While {

	public static void main(String[] args) {
		// Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true  değilse false yazdırınız.

        // 16 -> evet,  5 -> hayır
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int sayac=1;
		int aranansayi=0;
		
		while(sayac<sayi) {
			if(sayac*sayac==sayi) {
				aranansayi=sayac;
				break;
			}
			sayac++;
			
		}
		
		if(aranansayi>0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.println("aranan sayi : " + aranansayi);
		
		
		

	}

}
