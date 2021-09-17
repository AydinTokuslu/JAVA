package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class tek_olan_sayilarin_toplamini_yazdirma {

	public static void main(String[] args) {
		/*
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarının toplamini ekrana yazdırınız.
         girilen sayı dahil
        */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int toplam=0;
		
		for (int i = 0; i <= sayi; i++) {
			if(i%2==1) {
				toplam+=i;
				System.out.print(i+" ,");
			}
		}
		System.out.println("\ngirilen sayiya kadar olan tek sayilarin toplami "+ toplam);
		
		

	}

}
