package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class kulalnicinin_girdigi_sayilari_toplama {

	public static void main(String[] args) {
		/* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         *
         */
		
		Scanner scan = new Scanner(System.in);
       
		int toplam=0;
		int sayac=0;
		
		
		
		do {
			System.out.println("lutfen bir sayi giriniz");
			int sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
			
			
			
			
		} while (toplam<100);
		
		System.out.println(sayac+ " kere sayi girdin. Bu kadar sayi yeter, girdigin sayilarin toplami : "+ toplam);
	}

}
