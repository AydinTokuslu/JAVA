package day01_Haziran_26_2021_dersi_Variables_Scanner;

import java.util.Scanner;

public class C03_SCanner02 {

	public static void main(String[] args) {
		
		// kullanıcıdan isim ve soyisim alarak aşağıdaki gibi yazdırın 
		// Isim - soyisim : Aydın Tokuşlu
		
		/* Scanner scan = new Scanner(System.in);

		System.out.println("lütfen isminizi giriniz ");
		
		String name= scan.next();
		
		System.out.println("lütfen soyadınızı giriniz :");

		String surname= scan.next();

		System.out.println("Isim - soyisim : " + name + " " + surname);

*/

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen adınızı ve soyadınızı giriniz,\nisminizi yazdıktan sonra ENTER tuşuna basınız");
		String name=scan.nextLine();
		String surname=scan.nextLine();
		System.out.println("isminiz : " + name + "\nSoyisminiz : " + surname + "\nKursumuza kaydınız alınmıştır, teşekkür ederiz");
		
		scan.close();
	}

}
