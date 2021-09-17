package sorucozumleri_26_temmuz_2021;

import java.util.Scanner;

public class soru7_benim_cozumum {

	public static void main(String[] args) {
		/*123=1+2+3=6
	     * kullanıcıdan alınan bir sayinin basamaktaki rakam  degerlerinin toplamini do while loop ile hesaplayan bbir method yazınız.
	     */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		rakamTopla(sayi);
		
		
		

	}

	private static int rakamTopla(int sayi) {
		int toplam=0;
		do {
			toplam+=sayi%10;
			sayi/=10;
			
		}while(sayi>0);
		
		System.out.println("girdiginiz sayilarin toplami: " + toplam);
		return toplam;
		
		
	}

}
