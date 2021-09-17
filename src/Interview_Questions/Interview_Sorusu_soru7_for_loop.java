package Interview_Questions;

import java.util.Scanner;

public class Interview_Sorusu_soru7_for_loop {

	public static void main(String[] args) {
		// Interview Question : Kullanicidan bir String isteyin 
		// ve Stringi tersten yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen tersten yazdirmak icin bir string ifade giriniz");
		String kelime=scan.nextLine();
		
		for(int i=0 ; i< kelime.length() ; i++) {
			System.out.print(kelime.substring(kelime.length()-1-i, kelime.length()-1-i+1));
		}
		System.out.println("");
		for(int i=kelime.length()-1 ; i>=0 ; i--) {
			System.out.print(kelime.substring(i, i+1));
		
		}
		System.out.println("");
		for(int i=0; i<kelime.length() ; i++) {
			System.out.print(kelime.substring(kelime.length()-1-i, kelime.length()-i));
		}
		
		scan.close();
		

	}

}
