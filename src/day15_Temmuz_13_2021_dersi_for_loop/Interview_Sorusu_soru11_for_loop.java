package day15_Temmuz_13_2021_dersi_for_loop;

import java.util.Scanner;

public class Interview_Sorusu_soru11_for_loop {

	public static void main(String[] args) {
		// Interview Question Kullanicidan bir String isteyin. 
		//Kullanicinin girdigi String’in
		// palindrome olup olmadigini kontrol eden bir program yazin.
		//Palindrom, tersten okunuşu da aynı olan cümle, sözcük ve sayılara denilmektedir.

		
		System.out.println("Lütfen bir isim giriniz");
		Scanner scan = new Scanner(System.in);
		String isim = scan.next();
		String terstenIsim = "";
		for (int i = 0; i < isim.length(); i++) {
			terstenIsim += isim.substring(isim.length() - 1 - i, isim.length() - i);
		}
		if (isim.equals(terstenIsim)) {
			System.out.println("Girilen isim palindromdur");
		} else {
			System.out.println("Girilen isim palindrom degildir");
		}
		scan.close();
		
		
		
		
	}

}
