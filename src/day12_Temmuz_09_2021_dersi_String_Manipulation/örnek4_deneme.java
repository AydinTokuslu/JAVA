package day12_Temmuz_09_2021_dersi_String_Manipulation;

import java.util.Scanner;

public class örnek4_deneme {

	public static void main(String[] args) {
		// Kullanicidan 4 harfli bir kelime isteyin 
		// 4 harften uzun veya kısa ise "lütfen 4 harfli bir kelime girin yazın" 
		// yazdırın ve girilen kelimeyi tersten yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen 4 harfli bir kelime giriniz ");
		String kelime=scan.nextLine();
		
		if(kelime.length()!=4) {
			System.out.println("lütfen 4 harfli bir kelime girin yazın");
		}else {
			System.out.println(kelime.substring(3, 4) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1));
		}
		
		scan.close();
	}

}
