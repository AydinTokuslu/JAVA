package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class meslek_yazdirma_soru18 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan IT alanini isteyerek
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		yazdiriniz
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("IT alaninizi kisa kodlarindan (qa,dev,ba,pm) birini secerek giriniz");
		String meslek=scan.next();
		
		switch (meslek) {
		
		case ("qa"):
			System.out.println("mesleginiz : Quality Analyst ");
		break;
		case ("dev"):
			System.out.println("mesleginiz : Developer ");
		break;
		case ("ba"):
			System.out.println("mesleginiz : Busines Analyst ");
		break;
		case ("pm"):
			System.out.println("mesleginiz : Project Manager ");
		break;
		default:
			System.out.println("yanlis deger girdiniz");
		
		
		}
		
		/*
		if(meslek.equalsIgnoreCase("qa")) {
			System.out.println("Mesleginiz : Quality Analyst");
		}else if(meslek.equalsIgnoreCase("dev")) {
			System.out.println("Mesleginiz : Developer");
		}else if(meslek.equalsIgnoreCase("ba")) {
			System.out.println("Mesleginiz : Busines Analyst");
		}else {
			System.out.println("Mesleginiz : Project Manager");
		}
		*/
		
		
		
		

	}

}
