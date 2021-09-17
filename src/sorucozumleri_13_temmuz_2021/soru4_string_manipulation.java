package sorucozumleri_13_temmuz_2021;

import java.util.Scanner;

public class soru4_string_manipulation {

	public static void main(String[] args) {
		/*
        * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
        * kullanarak harflerin unique(farkli) olup olmadigina bakiniz.
        * 
        * input : ali 
        * output: girdiğiniz kelime 3 harfli ve unique karaktere sahip
        * 
        * input : ece
        * output: girdiğiniz kelime 3 harfli ve unique karaktere sahip değil
        */


		Scanner scanner=new Scanner(System.in);
		System.out.println("lutfen 3 harfli kelime giriniz : ");
		String name=scanner.nextLine();
		
		char c1=name.charAt(0);
		char c2=name.charAt(1);
		char c3=name.charAt(2);
		
		String result=name.length()== 3 ? ((c1!=c2 && c1!=c3 && c2!=c3) ? "girdiginiz kelime unique karakterlerden olusuyor" : "girdiginiz karakterler unique karakterler degil") : "3 karakterden farkli kelime girdiniz";
		
		System.out.println(result);
		
		
	}

}
