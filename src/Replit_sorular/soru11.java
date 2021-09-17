package Replit_sorular;

import java.util.Scanner;

public class soru11 {

	public static void main(String[] args) {
		/* Kullanıcıdan dakika girmesini isteyin, 
		 * Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

			INPUT:

				Dakika sayısı: 3456789

			OUTPUT :

				3456789 dakika yaklaşık 6 yıl 210 gündür. */

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen hesaplamak istediginiz dakika degerini giriniz");
		int dakika=scan.nextInt();
		
		int yil=dakika/525600;
		int kalanYil=dakika%525600;
		int gun=kalanYil/1440;
		
		System.out.println("girilen " + dakika + " dakika yaklasik " + yil + " yil ve " + gun + " gundur");
		
		scan.close();
		
		
	}

}
