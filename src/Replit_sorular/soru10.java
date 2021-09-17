package Replit_sorular;

import java.util.Scanner;

public class soru10 {

	public static void main(String[] args) {
		/* Kullanıcıdan karenin kenar uzunluğunu alın ve 
		/karenin alanını ve çevresini konsola yazdıran bir program yazın.

			Ornek Cikti :

				Alan: 9

				Cevre: 12  */

		Scanner scan=new Scanner(System.in);
		System.out.println("karenin kenar uzunlugunu girin");
		int kenar=scan.nextInt();
		
		int alan=kenar*kenar;
		int cevre=4*kenar;
		
		System.out.println("karenin alani : " + alan + " ve cevresi : " + cevre);
		
		
		
		
		
		
	}

}
