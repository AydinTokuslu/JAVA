package Replit_sorular;

import java.util.Scanner;

public class soru12 {

	public static void main(String[] args) {
		/* Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve 
		 * dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

			Örnek Çıktı:

				Alan: 32

				Çevre: 24 */

		Scanner scan=new Scanner(System.in);
		System.out.println("dikdortgenin uzun kenar uzunlugunu girin");
		int uzunKenar=scan.nextInt();
		
		System.out.println("dikdortgenin kisa kenar uzunlugunu girin");
		int kisaKenar=scan.nextInt();
		
		int alan=kisaKenar*uzunKenar;
		int cevre=2*(kisaKenar+uzunKenar);
		
		System.out.println("Alani : " + alan);
		System.out.println("Cevre : " + cevre);
		
		scan.close();
		
		
		
		
	}

}
