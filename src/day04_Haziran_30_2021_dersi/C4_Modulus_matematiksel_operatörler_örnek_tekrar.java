package day04_Haziran_30_2021_dersi;

import java.util.Scanner;

public class C4_Modulus_matematiksel_operatörler_örnek_tekrar {

	public static void main(String[] args) {
		//5496 sayısının rakamlarının toplamını bulan ve 
		// girilen bir sayının toplamını bulan program
		
		/*	int sayi=5496;
				int rakamlarToplami=0;
				
				int rakam1 = sayi%10;
				int rakam2 = sayi/10%10;
				int rakam3 = sayi/100%10;
				int rakam4 = sayi/1000;
				
				
				rakamlarToplami = rakam1+rakam2+rakam3+rakam4;
				System.out.println("girdiğiniz sayıların rakamlar toplamı : " + rakamlarToplami); */
						
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen 4 haneli bi rakam giriniz");		
		
		int sayi = scan.nextInt();
		
		int rakamlarToplami=0;
				
				int rakam1 = sayi%10;
				int rakam2 = sayi/10%10;
				int rakam3 = sayi/100%10;
				int rakam4 = sayi/1000;
				
				rakamlarToplami= rakam1 + rakam2 + rakam3 + rakam4;
				
				System.out.println("girdiğiniz sayının rakamlar toplamı :" + rakamlarToplami);
				
				scan.close();
				
				
				
	}

}
