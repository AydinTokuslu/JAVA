package day02_03_Haziran_28_ve_29_2021_dersi_datacasting_increment;

import java.util.Scanner;

public class C1_scanner01 {

	public static void main(String[] args) {
		// kullanıcıdan alınan ısım ve soyısmı aşağıdaki gibi veren kod
		// Isminiz : Aydın
		// Soyisminiz : Tokuşlu
		// Kursumuza katılımınız alınmıştır, teşekkürler
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen isminizi ve soyisminizi yazınız, \n isminizi yazdıktam sonra ENTER'a basınız");

		String name= scan.next();
		String surname= scan.nextLine();
		
		System.out.println("isminiz : " + name +"  "+ "\nsoyısmınız : " + surname);

	}

}
