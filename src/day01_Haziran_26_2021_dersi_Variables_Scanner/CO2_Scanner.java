package day01_Haziran_26_2021_dersi_Variables_Scanner;

import java.util.Scanner;

public class CO2_Scanner {

	public static void main(String[] args) {
		
	// kullanıcıdan iki tamsayı alıp bu sayıların toplan, fark ve carpımlarını yazdırın.
		
	// kullanıcıdan değer almak için 3 adım atmalıyız.
		// 1- scanner objesi oluşturalım

		Scanner scan = new Scanner (System.in);   //obje oluşturduk, scan objesi

		// 2- kullanıcıdan ne istediğimizi yazalım
		
		System.out.println("Lütfen iki tamsayı giriniz");
		
		// 3- next methodunu kullanarak girilen değerleri alıp, oluşturacağımız variable'lara atayalım.
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println("girdiğiniz sayıların toplamı : " + (sayi1+sayi2));
		
		
		Scanner scan2 = new Scanner (System.in);
		System.out.println("Lütfen iki tamsayı giriniz");
		int sayi3 = scan2.nextInt();
		int sayi4 = scan2.nextInt();
		
		System.out.println("girdiğiniz sayıların toplamı : " + (sayi3+sayi4));
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
