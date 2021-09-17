package Replit_sorular;

import java.util.Scanner;

public class soru18 {

	public static void main(String[] args) {
		/*Girilen zamanı saniyeye çeviren bir program yazınız.

			Örnek Çıktı:

			1 saat 10 dakika 50 saniye ==> 4250 saniye */

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen saat degerini giriniz");
		int saat=scan.nextInt();
		
		System.out.println("lutfen dakika degerini giriniz");
		int dakika=scan.nextInt();
		
		System.out.println("lutfen saniye degerini giriniz");
		int saniye=scan.nextInt();
		
		int toplamSure=(saat*3600)+(dakika*60)+saniye;
		
		System.out.println(saat + " saat " + dakika + " dakika " + saniye + " saniye ==> " + toplamSure + " saniye");
		
		
		
		
		
	}

}
