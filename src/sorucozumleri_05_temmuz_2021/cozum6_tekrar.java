package sorucozumleri_05_temmuz_2021;

import java.util.Scanner;

public class cozum6_tekrar {

	public static void main(String[] args) {
		/*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve 
         *  son iki basamagindaki rakamlari toplamini bulunuz
         *  
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen 5 basamaklı bir sayı giriniz");
		int sayi=scan.nextInt();
		
		int onbinler=sayi/10000;
		int binler=sayi/1000%10;
		int birler=sayi%10;
		int onlar=sayi/10%10;
		int toplam = birler+onlar+binler+onbinler;
		
		System.out.println("girilen sayının ilk 2 ve son 2 basamagındaki rakamların toplamı : " + toplam);
		
		
		
		
		
	}

}
