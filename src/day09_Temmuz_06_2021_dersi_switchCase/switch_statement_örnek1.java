package day09_Temmuz_06_2021_dersi_switchCase;

import java.util.Scanner;

public class switch_statement_örnek1 {

	public static void main(String[] args) {
		
		/* Soru1 : Kullanicidan haftanin kacinci gunu oldugunu sorun ve 
		 * gun ismini yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("bugün haftanın kaçıncı günü olduğunu yazın");
		
		int gunNo = scan.nextInt();
		
		
		switch(gunNo) {
		
			case 1:
				System.out.println("bugün pazartesi");
				break;
				
			case 2:
				System.out.println("bugün salı");
				break;
		
			case 3:
				System.out.println("bugün çarşamba");
				break;
		
			case 4:
				System.out.println("bugün perşembe");
				break;
				
			case 5:
				System.out.println("bugün cuma");
				break;
				
			case 6:
				System.out.println("bugün cumartesi");
				break;
				
			case 7:
				System.out.println("bugün pazar");	
				break;
			default:
				System.out.println("Lütfen geçerli gün numarası giriniz");
				
				scan.close();
		
		}
		
		
		
		
		
		

	}

}
