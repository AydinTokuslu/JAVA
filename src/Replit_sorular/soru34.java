package Replit_sorular;

import java.util.Scanner;

public class soru34 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. 
		 * Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

		Eger aynı karakterlere sahipse

		"isim ayni karakterlere sahiptir." yazdirin.

		Eger ayni kaakterlere sahip degilse

		"Dizenin benzersiz karakterleri var" yazdirin.

		Ternary kullanin.*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 3 harfli bir isim giriniz");
		String isim=scan.next();
		
		if(isim.length()>3) {
			System.out.println("3 harfli bir isim girmeliydiniz, tekrar girin");
		}else if(isim.substring(0, 1).equals(isim.substring(1, 2)) || isim.substring(0, 1).equals(isim.substring(2, 3)) ||
				isim.substring(1, 2).equals(isim.substring(2, 3))) {
			System.out.println("isim ayni karakterlere sahiptir.");
		}else {
			System.out.println("Dizenin benzersiz karakterleri var");
		}
	

	}

}
