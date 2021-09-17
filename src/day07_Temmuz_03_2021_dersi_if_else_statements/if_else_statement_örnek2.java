package day07_Temmuz_03_2021_dersi_if_else_statements;

import java.util.Scanner;

public class if_else_statement_örnek2 {

	public static void main(String[] args) {
		// kullanıcıdan dikdörtgenin kenar uzunluklarını isteyin
				// ve dikdörtgenin kare olup olmadığını yazdırın
				
				
				Scanner scan = new Scanner(System.in);
				System.out.println("lütfen dikdörtgenin kenarlarını giriniz \nilk kenarı yazınca ENTER'a basınız.");
				double kenar1=scan.nextDouble();
				double kenar2=scan.nextDouble();
					
				if(kenar1==kenar2) {
					System.out.println("girdiğiniz dikdörtgen bir karedir");
					
				}
				
				
				else { 
					System.out.println("girdiğiniz dikdörtgen bir kare değildir");
					
				}
				
				
				scan.close();
				

	}

}
