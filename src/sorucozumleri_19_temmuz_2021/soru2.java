package sorucozumleri_19_temmuz_2021;

public class soru2 {

	public static void main(String[] args) {
		// 0-255 e kadar olan harflerin , 
		// sayı ve harf değerini konsola yazdırınız.
		
		for(int i=0; i<=255; i++) {
			char harf=(char)i;
			System.out.println(i+"-"+harf);
		}

		System.err.println("*******2nci yol********");// ama bu sadece harfleri verir, sayilari vermez.
		
		for(char i=0; i<=255; i++) {
			char harf=i;
			System.out.println(i+"-"+harf);
		}
		
		
	}

}
