package sorucozumleri_06_temmuz_2021;

import java.util.Scanner;

public class cozum8_tekrar {

	public static void main(String[] args) {
		/* kullanıcı tarfından girilen bir sayının
		 * mutlak değerini yazdırmak için program
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir sayı giriniz");
		int sayi=scan.nextInt();
		if (sayi<0) {
			System.out.println("sayının mutlak değeri : " + (sayi*-1));
		}else {
			System.out.println("sayının mutlak değeri : " + sayi);
		}
		
		
		
		
		

	}

}
