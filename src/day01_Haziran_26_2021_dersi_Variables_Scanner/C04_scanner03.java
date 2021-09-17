package day01_Haziran_26_2021_dersi_Variables_Scanner;

import java.util.Scanner;

public class C04_scanner03 {

	public static void main(String[] args) {
		// kullanıcıdan ismini alıp baş harfini yazdırın

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen isminizi giriniz");
		
		char ilkharf=scan.next().charAt(0);
		
		System.out.println("girilen ismin ilk harfi : " + ilkharf);
		
		scan.close();
	}

}
