package sorucozumleri_26_temmuz_2021;

import java.util.Scanner;

public class soru2_benim_cozumum {

	public static void main(String[] args) {
		// kullanıcıdan alınan bir stringdeki indexi tek  
		// olan karakterleri yazdiriniz.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir metin giriniz");
		String str=scan.next();
		
		int i=0;
		
		do {
			if(i%2==1) {
				System.out.println(str.charAt(i)+" ,");
			}
			
			i++;
		}while(i<str.length());
		

	}

}
