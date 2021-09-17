package day12_Temmuz_09_2021_dersi_String_Manipulation;

import java.util.Scanner;

public class örnek3_deneme {

	public static void main(String[] args) {
		/* Kullanicidan bir sifre girmesini isteyin. 
		 * Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”, 
		 * sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” 
		 * yazdirin
		 - Ilk harf buyuk harf olmali
		 - Son harf kucuk harf olmali
		 - Sifre bosluk icermemeli
		 - Sifre uzunlugu en az 8 karakter olmali */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir şifre giriniz ");
		String sifre=scan.nextLine();
		
		boolean ilkharfkontrol = sifre.charAt(0)>='A' && sifre.charAt(0)<='Z';
		boolean sonharfkontrol = sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(0)<='z';
		boolean spacekontrol = !sifre.contains(" ");
		boolean sifreuzunluk = sifre.length()>=8;
		
		if(ilkharfkontrol && sonharfkontrol && spacekontrol && sifreuzunluk) {
			System.out.println("Sifre basari ile tanimlandi");
		}else {
			System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
		}
		
		scan.close();

	}

}
