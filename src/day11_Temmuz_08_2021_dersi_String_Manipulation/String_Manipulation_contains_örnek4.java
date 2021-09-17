package day11_Temmuz_08_2021_dersi_String_Manipulation;

import java.util.Scanner;

public class String_Manipulation_contains_örnek4 {

	public static void main(String[] args) {
		// Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa 
		// tum cumleyi buyuk harf olarak, “kucuk” kelimesi iceriyorsa 
		// tum cumleyi kucuk harf olarak yazdirin, iki kelimeyi de 
		// icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.

		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir cümle giriniz");
		String cumle = scan.nextLine().toLowerCase();
		
		if(cumle.contains("buyuk")) {
			System.out.println(cumle.toUpperCase());
		} else if (cumle.contains("kucuk")) {
			System.out.println(cumle.toLowerCase());
		} else {
			System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
		}
		
		
		
		
		
		
		
		
	}

}
