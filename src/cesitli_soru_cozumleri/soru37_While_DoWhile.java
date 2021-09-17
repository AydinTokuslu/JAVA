package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru37_While_DoWhile {

	public static void main(String[] args) {
		// sayinin basamak degerlerinin toplamini while loop ile yapiniz

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		
		basamakToplama(sayi);
		
		
	}

	private static void basamakToplama(int sayi) {
		
		int toplam=0;
		
		while(sayi!=0) {
			
			toplam+=sayi%10;
			sayi/=10;
			
			
		}
		System.out.println(toplam);
				
		
		/*int toplam=0;
		while(sayi!=0) {
			toplam+=sayi%10;
			sayi/=10;
			
		}
		System.out.println(toplam);*/
		
		
		
	}

}
