package day21_Temmuz_23_2021_dersi_multi_dimensional_arrays;

import java.util.Scanner;

public class ODEV_soru5_benimdenemem {

	public static void main(String[] args) {
		// Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		
		int sayac=1;
		
		System.out.println(cumle.length());
		
		for (int i = 0; i < cumle.length(); i++) {
			if(cumle.charAt(i)==' ') {
				sayac++;
			}
			
		}
		
		System.out.println("cumledeki kelime sayisi : "+ sayac);
		
		


	}

}
