package day07_Temmuz_03_2021_dersi_if_else_statements;

import java.util.Scanner;

public class if_else_statement_örnek1 {

	public static void main(String[] args) {
		// kullanıcıdan gün ismini alıp, haftaiçi veya haftasonu olduğunu yazdıran program
		// gün=pazar, output="hafta sonu
		//String için equals method'unu kullanın.
		
		// bayrak kullanımı (flag), yanlış ifade girildiğinde girişi düzeltmesi için kulanılır.
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("bugünün hangi gün olduğunu giriniz");
		
		String gun = scan.next().toLowerCase();
		
		int flag=0;
		
		if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")) {
			System.out.println("bugün hafta için");
			flag++;
		}
		if (gun.equals("cumartesi") || gun.equals("pazar")) {
			System.out.println("bugün hafta sonu");
			flag++;
		}
		
	
		if(flag==0) {
			System.out.println("geçerli bir gün ismi giriniz");
		}
		
		
		scan.close();
		
		

	}

}
