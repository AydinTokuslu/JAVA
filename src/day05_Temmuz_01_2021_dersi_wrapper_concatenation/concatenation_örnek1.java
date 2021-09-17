package day05_Temmuz_01_2021_dersi_wrapper_concatenation;

public class concatenation_örnek1 {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "World";
		int sayi1 = 3;
		int sayi2 = 4;

		// Hello1 yazdırın
		System.out.println(str1 + (sayi2 - sayi1));
		System.out.println(str1 + (sayi2-sayi1));

		// Hello 5 World yazdırın
		
		System.out.println(str1 + " " + ++sayi2 + " " + str2);
		
		
		// Hello 34 yazdırın

		System.out.println(str1 + " " + sayi1+ --sayi2);
		
		
		
		// 7Hello yazdırın

		System.out.println(sayi1+sayi2+str1);
		
		
		// 34 yazdırın

		System.out.println(sayi1+""+sayi2);  //34, bunun data türü String oldu, "" sayıların Stringe çevrilmesini sağlar.
		
		
		// int'i String'e çevirmek için method'a ihtiyaç yok ama istersek kullanabiliriz.

		String intdanCevrilen = ""+sayi1; //"" u yöntem method kullanmadan int'i String'e çevirir.
		
		
		
		
	}

}
