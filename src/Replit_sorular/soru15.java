package Replit_sorular;

import java.util.Scanner;

public class soru15 {

	public static void main(String[] args) {
		// Kullanıcıdan bir Float değer girmesini isteyin, 
		// bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.

		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir Float değer giriniz");
		float deger=scan.nextFloat();
		
		short deger2=(short) deger;
		System.out.println(deger2);
		
	}

}
