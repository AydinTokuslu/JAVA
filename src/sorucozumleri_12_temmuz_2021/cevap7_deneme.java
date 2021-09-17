package sorucozumleri_12_temmuz_2021;

import java.util.Scanner;

public class cevap7_deneme {

	public static void main(String[] args) {
		// Kullanıcıdan alacağınız bir stringde boşluk 
		// karakterinin olup olmadığını kontrol ediniz.

		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz");
		String kelime=scan.nextLine();
		
		System.out.println("girdiginiz kelimede bosluk :" + kelime.contains(" "));
		
		boolean varmi=kelime.contains(" ");
		System.out.println(varmi);
		
		scan.close();
	}

}
