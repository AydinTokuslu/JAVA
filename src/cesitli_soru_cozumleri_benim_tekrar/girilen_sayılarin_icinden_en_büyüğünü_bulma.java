package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class girilen_sayılarin_icinden_en_büyüğünü_bulma {

	public static void main(String[] args) {
		// Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.
		
				Scanner scan=new Scanner(System.in);
				
				int sayac=0;
				int enBuyuk=0;
				
				while(sayac<5) {
					System.out.println("lutfen bir sayi giriniz");
					int sayi=scan.nextInt();
					
					enBuyuk=Math.max(enBuyuk, sayi);
					sayac++;
				}
				System.out.println("girilen sayilarin icinde en buyuk sayi : "+ enBuyuk);
	}

}
