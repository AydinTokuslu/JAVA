package sorucozumleri_05_temmuz_2021;

import java.util.Scanner;

public class cozum3_tekrar {

	public static void main(String[] args) {
		/*
         * Kullanicidan uc basamakli bir sayi alin 
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         * 
         * 
         * Ornek : Inputs : 853 
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5 
         *          Girdiginiz sayinin yuzler basamagi : 8
         * 
         * 
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen üç basamaklı bir sayi giriniz");
		int sayi = scan.nextInt();
		
		int birler= sayi%10;
		int onlar = sayi/10%10;
		int yuzler = sayi/100;
		
		System.out.println("Girdiginiz sayinin birler basamagi :" + birler + "\n" + "Girdiginiz sayinin onlar basamagi :" + onlar + "\n" + "Girdiginiz sayinin yuzler basamagi :" + yuzler);
		
		
		

	}

}
