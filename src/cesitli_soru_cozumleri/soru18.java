package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru18 {

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
		System.out.println("qa\ndev\nba\npm\nCalistiginiz IT alanini yaziniz");
		String meslek=scan.next();
		
		if(meslek.equalsIgnoreCase("qa")) {
			System.out.println("Mesleginiz : Quality Analyst");
		}else if(meslek.equalsIgnoreCase("dev")) {
			System.out.println("Mesleginiz : Developer");
		}else if(meslek.equalsIgnoreCase("ba")) {
			System.out.println("Mesleginiz : Busines Analyst");
		}else {
			System.out.println("Mesleginiz : Project Manager");
		}
		

	}

}
