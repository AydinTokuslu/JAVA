package day08_Temmuz_05_2021_dersi_ternary_operator;

import java.util.Scanner;

public class temmuz_05_2021_dersi_1nci_örnek_ikinci_çözüm {

	public static void main(String[] args) {
		/*
		 * Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
		Kural 1: 4 ile bolunemeyen yillar artik yil degildir
		Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
		Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik 		yildir
		 
		 */

	Scanner scan = new Scanner(System.in);
	
	System.out.println("lütfen artık yıl kontrolü için bir yıl giriniz :");
	
	int yil = scan.nextInt();
	
	if (yil % 4 !=0) {
		System.out.println("girdiğiniz yıl artık yıl değildir");
	} else { // 4 ün katı olanlar

		if (yil%100 ==0 && yil %400 == 0) {
			System.out.println("girdiğiniz yıl artık yıl");
		} else if (yil %100 ==0 && yil%400 != 0) {
			System.out.println("girdiğiniz yıl artık yıl değil");
		} else {
			System.out.println("girdiğiniz yıl artık yıldır");
			
			scan.close();
		}
	}
	}
}

