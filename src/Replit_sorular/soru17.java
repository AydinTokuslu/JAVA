package Replit_sorular;

import java.util.Scanner;

public class soru17 {

	public static void main(String[] args) {
		/* Kullanıcıdan üç basamaklı bir sayı girmesini ve 
		bu sayının basamaklarının toplamını bulmasını isteyin.

			Örnek Çıktı:

			Verilen tamsayının rakamları toplamı 10'dur.*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 3 basamakli bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int i=sayi;
		int rakam=0;
		int rakamlarToplami=0;
		
		
		while(i>0) {
			rakam=i%10;
			rakamlarToplami+=rakam;
			i/=10;
			
		}
		System.out.println("Verilen tamsayının rakamları toplamı : " + rakamlarToplami);
	}

}
