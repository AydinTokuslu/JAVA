package day06_Temmuz_02_2021_dersi_karsilastirma_operatorleri;

import java.util.Scanner;

public class if_statements_örnek2 {

	public static void main(String[] args) {
		// kullanıcıdan dikdörtgenin kenar uzunluklarını isteyin
		// ve dikdörtgenin kare olup olmadığını yazdırın
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen kenar uzunluklarından birini tam sayı olarak giriniz");
		int kenar1=scan.nextInt();
		
		System.out.println("lütfen diğer kenar uzunluğunu tam sayı olarak giriniz");
		int kenar2=scan.nextInt();
		
		if(kenar1==kenar2) {
			System.out.println("girdiğiniz dikdörtgen bir karedir");
			
		}
		
		
		if(kenar1!=kenar2) {
			System.out.println("girdiğiniz dikdörtgen bir kare değildir");
			
		}
		
		
		scan.close();
		
		
		
		
		
		
		

	}

}
