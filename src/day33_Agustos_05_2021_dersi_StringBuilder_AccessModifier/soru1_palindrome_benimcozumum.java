package day33_Agustos_05_2021_dersi_StringBuilder_AccessModifier;

import java.util.Scanner;

public class soru1_palindrome_benimcozumum {

	public static void main(String[] args) {
		/*Bir cümleyi parametre olarak kabul eden, 
		 * StringBuilder kullanarak cümleyi ters çeviren ve 
		 * cümlenin palindrom olup olmadığını kontrol eden 
		 * (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	    (without case sensitivity)
	    Eg : input :I love Java 
	    Output: "Reversed sentence : avaJ evol I .
	       It is not a palindrome"*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		String str=scan.nextLine();
		
		StringBuilder s=new StringBuilder();
		s.append(str);
		
		String terstenokuma=s.reverse().toString();
		
		if(str.equalsIgnoreCase(terstenokuma)) {
			System.out.println("girdiginiz cumle palindrome‘dur =====> " + str);
			
		}else {
			System.out.println("girdiginiz cumle palindrome degildir =====> " + str);
		}
		
		
		
		
		

	}

}
