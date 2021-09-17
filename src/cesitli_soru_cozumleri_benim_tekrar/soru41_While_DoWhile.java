package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class soru41_While_DoWhile {

	public static void main(String[] args) {
		// Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir ifade girin yada cikmak icin x girin.");
		String okunan="";
		
		do {
			okunan=scan.next();
			if(okunan.equalsIgnoreCase("x")) break;
				
			System.out.println("program calisiyor..");
			
			
		}while(!okunan.equalsIgnoreCase("x"));
		
		System.out.println("Program bitti");
		
		

	}

}
