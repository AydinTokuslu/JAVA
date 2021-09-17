package Replit_sorular;

import java.util.Scanner;

public class soru31 {

	public static void main(String[] args) {
		/*Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve 
		 * yazdıran bir Java programı yazın. Verilen tamsayılar veya toplam 10'dan 
		 * fazla basamakli olursa, "OverFlow" yazdırın.

		Ornek:

		INPUT :

		25

		46

		OUTPUT :

		Numaralarin Toplami:

		71*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int toplam=sayi1+sayi2;
		
		if(toplam<=0) {
			System.out.println("yanlis deger girdiniz, sayilari pozitif olarak girin");
		}else if(toplam>999999999) {
			System.out.println("OverFlow");
		}else {
			System.out.println("Numaralarin Toplami: \n"+ toplam);
		}
		
		
		
		
		
		

	}

}
