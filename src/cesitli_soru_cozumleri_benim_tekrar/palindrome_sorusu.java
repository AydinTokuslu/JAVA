package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Arrays;
import java.util.Scanner;

public class palindrome_sorusu {

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
		System.out.println("lutfen bir palindrome cumle giriniz");
		String cumle=scan.nextLine();
		
		String[] cumleBol=cumle.split("");
		String[] temp=new String[cumle.length()];
		
		for (int i = cumleBol.length-1; i >=0; i--) {
			temp[cumleBol.length-1-i]=cumleBol[i];
		}
		System.out.println(Arrays.toString(temp));
		
		//String str= new temp.toString();
		
		//System.out.println(str);
		
		System.out.println(temp.toString());//bu da yanlis
		
		if(cumle.equalsIgnoreCase(temp.toString())) {
			System.out.println("bu bir palindrome cumledir");
		}else {
			System.out.println("bu bir palindrome cumle degildir");
		}

	}

}
