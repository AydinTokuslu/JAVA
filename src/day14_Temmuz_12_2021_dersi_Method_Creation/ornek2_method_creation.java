package day14_Temmuz_12_2021_dersi_Method_Creation;

import java.util.Scanner;

public class ornek2_method_creation {

	public static void main(String[] args) {
		/* Kullaniciya kac sayi toplamak istedigini sorun. 
		 * Kullanici 2,3 veya 4 degerini girerse, 
		 * kullanicidan bu sayilari girmesini isteyin ve 
		 * sayilarin toplamini yazdirin. 
		 * Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse 
		 * “Cok sayi girdiniz, ben toplayamam” yazdirin. */

		Scanner scan=new Scanner(System.in);
		System.out.print("kac sayi toplamak istiyorsunuz : ");
		int sayiAdedi=scan.nextInt();
		
		if(sayiAdedi<2) {
			System.out.print("toplamak icin en az iki sayi girmelisin.");
		}else if(sayiAdedi==2) {
			ikiSayiTopla();
		}else if(sayiAdedi==3) {
			ucSayiTopla();
		}else if(sayiAdedi==4) {
			dortSayiTopla();
		}else {
			System.out.print("Cok sayi girdiniz, ben toplayamam");
		}
		scan.close();
		
	}

	private static void dortSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.print("lutfen dort sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		int sayi4=scan.nextInt();
		System.out.print("dort sayi girmeyi tercih ettiniz " 
				+ "\nGirilen dort sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));
		
		scan.close();
	}

	private static void ucSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.print("lutfen uc sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		System.out.print("uc sayi girmeyi tercih ettiniz " 
				+ "\nGirilen uc sayinin toplami : " + (sayi1+sayi2+sayi3));
		
		scan.close();
	}

	public static void ikiSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.print("lutfen iki sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		System.out.print("iki sayi girmeyi tercih ettiniz " 
				+ "\nGirilen iki sayinin toplami : " + (sayi1+sayi2));
		
		scan.close();
		
		
	}

}
