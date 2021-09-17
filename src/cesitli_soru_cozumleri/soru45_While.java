package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru45_While {

	public static void main(String[] args) {
		// Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.
		
		Scanner scan=new Scanner(System.in);
		
		int sayac=0;
		int enbuyuk=0;
		
		while(sayac<5) {
			System.out.println("sayi giriniz : ");
			int sayi=scan.nextInt();
			
			enbuyuk=Math.max(enbuyuk, sayi);
			sayac++;
			
			
		}
		
		System.out.println("girilen sayilar icinde en buyuk sayi : " + enbuyuk);		
		
		
		
		
		
		

	}

}
