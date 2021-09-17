package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru42_While {

	public static void main(String[] args) {
		// INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen gecerli bir pin kodu giriniz");
		int pinkodu=scan.nextInt();
		
		
		int gercekpinkodu=6036;
		
		while(pinkodu!=gercekpinkodu) {
			System.out.println("*************** Yanlis PIN ****************");
			System.out.println("tekrar deneyiniz");
			pinkodu=scan.nextInt();
			
		}
		
		System.out.println("basariyla giris yapildi.");
		
		

	}

}
