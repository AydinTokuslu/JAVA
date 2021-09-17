package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class sayinin_basamak_degerlerinin_toplamini_while_loop_ile_yapma {

	public static void main(String[] args) {
		// sayinin basamak degerlerinin toplamini while loop ile yapiniz

				Scanner scan=new Scanner(System.in);
				System.out.println("lutfen bir sayi giriniz");
				int sayi=scan.nextInt();
				
				int toplam=0;
				
				while(sayi!=0) {
					toplam+=sayi%10;
					sayi/=10;
					
				}
				System.out.println(toplam);
				

			/*	basamakToplama(sayi);
				
				
		}

		private static void basamakToplama(int sayi) {
		
		int toplam=0;
		
		while(sayi!=0) {
			
			toplam+=sayi%10;
			sayi/=10;
			
			
		}
		System.out.println(toplam); */
				
				
				
				
				
	}

}
