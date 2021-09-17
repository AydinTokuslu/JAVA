package sorucozumleri_13_temmuz_2021;

import java.util.Scanner;

import java.util.Scanner;

public class soru5_string_manipulation {

	public static void main(String[] args) {
		/*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("lutfen kelime giriniz : ");
		String kelime=scanner.nextLine();

		if(kelime.length()>=3) {
			System.out.println(kelime.substring(kelime.length()-2)+ kelime.substring(kelime.length()-2) + kelime.substring(kelime.length()-2));
		
		}else {
			System.out.println("girilen kelime : " + kelime);
		}
		
		
		
		
		
	}

}
