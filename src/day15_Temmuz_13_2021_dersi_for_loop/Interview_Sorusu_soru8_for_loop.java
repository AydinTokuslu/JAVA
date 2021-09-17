package day15_Temmuz_13_2021_dersi_for_loop;

import java.util.Scanner;

public class Interview_Sorusu_soru8_for_loop {

	public static void main(String[] args) {
		// Interview Question : Kullanicidan bir String isteyin 
		// ve Stringi tersine ceviren bir program yazin 
		// (yazdirin demiyor, variable olarak saklayin diyor).

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen tersten yazdirmak icin bir string ifade giriniz");
		String kelime=scan.nextLine();
		
		String terstenKelime = "";
		
		
		
		for(int i=0 ; i< kelime.length() ; i++) {
			terstenKelime+=kelime.substring(kelime.length()-1-i, kelime.length()-i);
			
		
		}
		System.out.println(terstenKelime);
		
		
		
		
	}

}
