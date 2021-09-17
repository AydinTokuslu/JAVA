package Replit_sorular;

import java.util.Scanner;

public class soru20 {

	public static void main(String[] args) {
		/*Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

		Input : 
			
		30

		40
			
			Beklenen Cikti:

		30 ve 40 icin GCD = 10

		30 ve 40 icin LCM = 120*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 2 tam sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int GCD=0;
		int LCM=0;
		
		for (int i = 1; i < sayi1 && i<sayi2; i++) {
			if(sayi1%i==0 && sayi2%i==0) {
				GCD=i;
			}LCM=(sayi1*sayi2)/GCD;
		}
		
		System.out.println("girilen sayilarin GCD‘si : " + GCD+ " ve LCM‘si : " + LCM);
	}

}
