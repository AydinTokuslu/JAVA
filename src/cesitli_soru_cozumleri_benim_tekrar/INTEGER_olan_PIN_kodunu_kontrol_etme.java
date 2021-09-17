package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class INTEGER_olan_PIN_kodunu_kontrol_etme {

	public static void main(String[] args) {
		// INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen pinkodunu giriniz");
		int pinkodu=scan.nextInt();
		
		int gercekpinkodu=6036;
		
		while(pinkodu!=gercekpinkodu){
			System.out.println("yanlis cevap bilemediniz");
			System.out.println("tekrar pin kodunu giriniz");
			pinkodu=scan.nextInt();
		}
		
		System.out.println("tebrikler pin kodunu buldunuz");
		

	}

}
