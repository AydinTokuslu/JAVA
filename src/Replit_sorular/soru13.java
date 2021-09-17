package Replit_sorular;

import java.util.Scanner;

public class soru13 {

	public static void main(String[] args) {
		/* Kullanıcıya günde ne kadar çay içtiğini ve 
		 * ne kadar şeker kullandığını sorun. 
		 * Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
		 

			1 şeker = 1.7 gr

			Örnek Çıktı:

			Yılda 12.41 kg şeker kullanıyor. */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen gunde kac tane cay ictiginizi sayi olarak giriniz");
		int cay=scan.nextInt();
		
		System.out.println("lutfen her cay kac tane seker attiginizi sayi olarak giriniz");
		int seker=scan.nextInt();
		
		double toplamSekerMiktari=(cay*(seker*1.7))*365;
		System.out.println("Yilda : " + (toplamSekerMiktari/1000) + " kg seker kullaniyor." );
		
		scan.close();

	}

}
