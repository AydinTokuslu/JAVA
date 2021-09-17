package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class girilenSayilariToplama_methodcreation {

	public static void main(String[] args) {
		/*
		 Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
		 Kullanici 2,3 veya 4 degerini girerse, 
		 kullanicidan bu sayilari girmesini isteyin 
		 ve sayilarin toplamini yazdirin. 
		 Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse 
		 “Cok sayi girdiniz, ben toplayamam” yazdirin.
		 2'den kucuk bir sayi girerse "En az 2 sayi girmelisiniz"
		 */
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen kac sayi toplamak istediginizi giriniz");
		int adet= scan.nextInt();
		
		if(adet<2) {
			System.out.println("En az 2 sayi girmelisiniz");
		}else if(adet==2) {
			ikiSayiTopla();
		}else if(adet==3) {
			ucSayiTopla();
		}else if(adet==4) {
			dortSayiTopla();
		}else {
			System.out.println("Cok sayi girdiniz, ben toplayamam");
		}

	}

	private static void dortSayiTopla() {
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen 4 adet sayi giriniz");
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		int sayi3= scan.nextInt();
		int sayi4= scan.nextInt();
		
		System.out.println("girdiginiz 4 sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));
		
	}

	private static void ucSayiTopla() {
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen 3 adet sayi giriniz");
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		int sayi3= scan.nextInt();
		
		System.out.println("girdiginiz 3 sayinin toplami : " + (sayi1+sayi2+sayi3));
		
	}

	private static void ikiSayiTopla() {
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen 2 adet sayi giriniz");
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		
		System.out.println("girdiginiz 2 sayinin toplami : " + (sayi1+sayi2));
		
	}

}
