package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru47_While {

	public static void main(String[] args) {
		/*
        sayinin basamak degerlerinin toplamini while loop ile yapiniz
        */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int toplam=0;
		
		while(sayi!=0) {
			
			toplam+=sayi%10;
			sayi/=10;
			
		}
		
		System.out.println("girdiginiz sayinin basamak degerlerinin toplami : " +toplam);
		
		
		

	}

}
