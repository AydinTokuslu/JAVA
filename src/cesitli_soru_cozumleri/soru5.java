package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru5 {

	public static void main(String[] args) {
		// Maaşı ve zam oranı girilen işçinin zamlı maaşını hesaplayarak ekranda göster

		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen maaşınızı giriniz");
		int maas=scan.nextInt();
		
		System.out.println("lütfen zam oranınızı % olmadan giriniz");
		int zam=scan.nextInt();
		
		double son_maas= maas + (maas*zam/100);
		
		System.out.println("zamlı maaşınız : " + son_maas + ", güzel günlerde harcayın");
		
		
		scan.close();
		
		
		
	}

}
