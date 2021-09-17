package day07_Temmuz_03_2021_dersi_if_else_statements;

import java.util.Scanner;

public class if_else_statement_örnek5 {

	public static void main(String[] args) {
		// kullanıcıdan dikdörtgenin kenar uzunluklarını isteyin
		// eğer uzunluklardan birisi 0 veya daha küçükse
		// "geçerli uzunluk giriniz" yazdırın
		// uzunlukların ikisi de pozitif ise
		// dikdörtgen olup olmadığını yazdırın
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen dikdörtgenin kenarlarını giriniz, \nilk kenarı yazınca ENTER'a basınız");
		
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
		if(kenar1<=0 || kenar2<=0) {
			System.out.println("lütfen geçerli uzunluk giriniz");
				
		} else if (kenar1 == kenar2) {
			System.out.println("girdiğiniz dikdörtgen karedir");
		} else {
			System.out.println("girdiğiniz dikdörtgen kare değildir");
		}
		
		scan.close();
		
		

	}

}
