package day06_Temmuz_02_2021_dersi_karsilastirma_operatorleri;

import java.util.Scanner;

public class if_statements_örnek1 {

	public static void main(String[] args) {
		// kullanıcıdan bir tam sayı isteyin, tek mi çift mi olduğunu yazdırı.
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir sayı giriniz");
		
		int girilenSayi=scan.nextInt();

		if(girilenSayi%2==0) {
			System.out.println("girdiğiniz sayı çifttir");
						
		}
		
		if(girilenSayi%2==1) {
			System.out.println("girdiğiniz sayı tektir");
		}
		
		if(girilenSayi<0) {
			System.out.println("lütfen pozitif bir sayı girin");
			int girilenSayi2=scan.nextInt();

			if(girilenSayi2%2==0) {
				System.out.println("girdiğiniz sayı çifttir");
							
			}
			
			if(girilenSayi2%2==1) {
				System.out.println("girdiğiniz sayı tektir");
			}
		
		}*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lütfen bir sayı giriniz");
		int sayi=scan.nextInt();
		
		int sayi2;
		if (sayi<0) {
			System.out.println("lütfen pozitif bir sayı giriniz");
			
		} else if (sayi%2==0) {
			System.out.println("girdiğiniz sayi çifttir");
		} else {
			System.out.println("girdiğiniz sayı tektir");
		}
		
				
		
		scan.close();
		

	}

}
