package day10_Temmuz_07_2021_dersi_String_Manipulation;

import java.util.Scanner;

public class String_Manipulation_indexOf_örnek2 {

	public static void main(String[] args) {
		
		//kullanıcı string bir ifade girsin, java varsa aferin 
		// yoksa daha çok çalışman lazım yazsın
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lütfen bir string ifade giriniz");
		
		String cumle = scan.nextLine();
		
		//cumle.indexOf("java") //cümlede java varsa index dönecek, yoksa -1 dönecek
		
		if(cumle.indexOf("java")==-1) { //-1, olmayan karakteri sorguladığımızda java bize -1 sonucunu verir.
			System.out.println("daha çok çalışman lazım");
		} else {
			System.out.println("aferin");
		}
		
		
		System.out.println(cumle.indexOf("java") == -1 ? "Daha cok calisman lazim." : "Aferin.");
		scan.close();
		
		

	}

}
