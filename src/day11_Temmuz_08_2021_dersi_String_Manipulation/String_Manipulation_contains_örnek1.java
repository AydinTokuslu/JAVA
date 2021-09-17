package day11_Temmuz_08_2021_dersi_String_Manipulation;

import java.util.Scanner;

public class String_Manipulation_contains_örnek1 {

	public static void main(String[] args) {
		

		/*String str = "çalışırsanız, java öğrenmek çok kolay";
		System.out.println(str.contains("a")); //true
		System.out.println(str.contains("t")); //false
		System.out.println(str.contains("java")); //true
		*/
		
		// kullanıcıdan bir cümle ve kelime alın
		// cümlede kelimenin kullanılıp kullanılmadığını yazdırın
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir cümle giriniz");
		String cumle = scan.nextLine();
		
		System.out.println("lütfen bir kelime giriniz");
		String kelime = scan.next();
		
		// indexof kullanalım
		
		if(cumle.indexOf(kelime)!=-1) {
			System.out.println("kelime cümlede kullanılmış");
		} else {
			System.out.println("kelime cümlede kullanılmamış");
		}
		
		// contains kullanımı
		if(cumle.contains(kelime)) {
			System.out.println("kelime cümlede kullanılmış");
		} else {
			System.out.println("kelime cümlede kullanılmamış");
		}
	}

}
