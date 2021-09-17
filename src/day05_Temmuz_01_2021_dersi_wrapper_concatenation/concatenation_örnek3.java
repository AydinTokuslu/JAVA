package day05_Temmuz_01_2021_dersi_wrapper_concatenation;

public class concatenation_örnek3 {

	public static void main(String[] args) {
		

		int sayi = 7;
		char ilkharf='a';
		String str = "Java";
		
		System.out.println(sayi+str+ilkharf); //7Javaa
		System.out.println(sayi+ilkharf+str); //104Java, 'a'yı ASCII Tablosundan alır ve a 97'dir ve sayi ile toplar.
		
		// 7a yazdırın
		
		System.out.println(sayi+ilkharf); // bu 104 olur
		System.out.println(""+sayi+ilkharf); // concatenation'a çevirmemiz gerekir ve "" ile çeviririz.

	}

}
