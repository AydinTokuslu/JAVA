package sorucozumleri_12_temmuz_2021;

import java.util.Scanner;

public class soru7 {

	public static void main(String[] args) {
		// Kullanıcıdan alacağınız bir stringde boşluk 
		// karakterinin olup olmadığını kontrol ediniz.

		Scanner scan=new Scanner(System.in);
		System.out.print("bir kelime giriniz: ");
		String name1=scan.nextLine();
		
		boolean varmi=name1.contains(" ");
		System.out.println(varmi);
		
		System.out.print("girdiginiz kelimede "+name1.contains(" "));
		
	}

}
