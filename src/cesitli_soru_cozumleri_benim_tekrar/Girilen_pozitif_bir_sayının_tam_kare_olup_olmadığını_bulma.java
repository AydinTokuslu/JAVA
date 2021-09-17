package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class Girilen_pozitif_bir_sayının_tam_kare_olup_olmadığını_bulma {

	public static void main(String[] args) {
		// Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true  değilse false yazdırınız.

        // 16 -> evet,  5 -> hayır
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int sayac=1;
		int arananSayi=0;
		
		while(sayac<sayi) {
			if(sayac*sayac==sayi) {
				arananSayi=sayac;
				break;
			}
			
			sayac++;
		}
		
		if(arananSayi>0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.println("tam kare aranan sayi "+ arananSayi);
		
	}

}
