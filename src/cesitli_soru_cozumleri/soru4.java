package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru4 {

	public static void main(String[] args) {
		// Girilen kelimenin harflerini tersten yazdır
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bes harfli bir kelime giriniz");
		String kelime=scan.next();
		int kelime_uzunlugu=kelime.length();
		
		System.out.println(kelime.substring(kelime_uzunlugu-1, kelime_uzunlugu) + 
				kelime.substring(kelime_uzunlugu-2, kelime_uzunlugu-1) + kelime.substring(kelime_uzunlugu-3, kelime_uzunlugu-2) 
				+ kelime.substring(kelime_uzunlugu-4, kelime_uzunlugu-3)+ kelime.substring(kelime_uzunlugu-5, kelime_uzunlugu-4)
				+ kelime.substring(kelime_uzunlugu-6, kelime_uzunlugu-5) + kelime.substring(kelime_uzunlugu-7, kelime_uzunlugu-6)
				+ kelime.substring(kelime_uzunlugu-8, kelime_uzunlugu-7));
	}

}
