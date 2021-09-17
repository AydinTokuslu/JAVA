package sorucozumleri_26_temmuz_2021;

import java.util.Scanner;

public class soru3_benim_cozumum {

	public static void main(String[] args) {
		// Kullanicidan 2 sayi aliniz.
        //1. sayi taban
        //2. sayi Ust
        //1 sayinin ussunu hesaplatan bir kod yaziniz.
        // 3, 2 --> 3^2 = 3*3 = 9
        // 2, 5 --> 2^5= 2*2*2*2*2 = 32
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen taban ve ust giriniz");
		int taban=scan.nextInt();
		int ust=scan.nextInt();
		
		int sonuc=1;
		
		while(ust!=0) {
			sonuc*=taban;
			ust--;
			
		}System.out.println("while ile girdiginiz tabanin ust kuvveti"+ sonuc);
		
		for (int i = 1; i < ust; i++) {
			sonuc*=taban;
		}System.out.println("for ile girdiginiz tabanin ust kuvveti"+ sonuc);
		

	}

}
