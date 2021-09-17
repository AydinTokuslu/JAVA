package day09_Temmuz_06_2021_dersi_switchCase;

import java.util.Scanner;

public class switch_statement_örnek3 {

	public static void main(String[] args) {
		
	//Soru5 : Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("bugün haftanın hangi günü olduğunu yazın");
		
		String gun = scan.next().toLowerCase();
		
		
		switch(gun) {
		
			case "pazartesi":
			case "sali":	
			case "çarşamba":	
			case "perşembe":	
			case "cuma":	
				System.out.println("girdiğiniz gün hafta içi");
				break;
			case "cumartesi":	
			case "pazar":	
				System.out.println("girdiğiniz gün hafta sonu");
				break;	
			default:
				System.out.println("lütfen geçerli bir gün ismi giriniz");		
				
				
		}
		

	}

}
