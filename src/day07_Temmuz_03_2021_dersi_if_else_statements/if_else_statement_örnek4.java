package day07_Temmuz_03_2021_dersi_if_else_statements;

import java.util.Scanner;

public class if_else_statement_örnek4 {

	public static void main(String[] args) {
		// kullanıcıya yaşınızı sorun, eğer yas 65'e eşit ve küçük ise "emekli olamazsın, 
		// çalışmalısın", 65'den büyükse "emekli olabilirsin" yazdırın.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen yaşınızı giriniz.");
		int yas = scan.nextInt();
		
		if (yas<=65) {
			System.out.println("emekli olamazsın,çalışmalısın");
			
		} else {
			System.out.println("emekli olabilirsin");
		}
		
		scan.close();
		
		
	}

}
