package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Arrays;
import java.util.Scanner;

public class Girilen_kelimenin_harflerini_tersten_yazdırma {

	public static void main(String[] args) {
		// Girilen kelimenin harflerini tersten yazdır
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bes harfli bir kelime giriniz");
		String kelime=scan.next();
		
		String[] kelimeBol=kelime.split("");
		String terstenKelime[]=new String[kelime.length()];
		
		for (int i = kelimeBol.length-1; i >=0; i--) {
			terstenKelime[kelimeBol.length-1-i]=kelimeBol[i];
		}
		System.out.println("girilen kelimenin tersten okunusu : "+ Arrays.toString(terstenKelime));
	}

}
