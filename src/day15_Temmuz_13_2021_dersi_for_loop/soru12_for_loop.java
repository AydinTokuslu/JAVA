package day15_Temmuz_13_2021_dersi_for_loop;

import java.util.Scanner;

public class soru12_for_loop {

	public static void main(String[] args) {
		//  Kullanicidan iki sayi isteyin. 
		// Girilen sayilar ve aralarindaki tum tamsayilari
		// toplayip, sonucu yazdiran bir program yaziniz

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz, ve her sayidan sonra ENTER‘a basiniz. ");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		int toplam=0;
		
		for(int i= sayi1 ; i<=sayi2 ; i++ ) {
			toplam+=i;
			System.out.print(toplam+" , ");
		}
		System.out.println("");
		System.out.print(toplam);
		
		scan.close();
		
	}

}
