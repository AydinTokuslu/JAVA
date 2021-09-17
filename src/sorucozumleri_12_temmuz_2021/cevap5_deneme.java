package sorucozumleri_12_temmuz_2021;

import java.util.Scanner;

public class cevap5_deneme {

	public static void main(String[] args) {
		/* StringMethods
        String girildiginde ilk iki karakteri haric stringin 
        kalan harflerini yaziniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise 
        bu karakterler de return edilsin
       ORNEK:
        INPUT      :  goat
                      photo
                      ghost
                      kalem
        OUTPUT :      gat
                      hoto
                      ghost
                      lem
      */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("lutfen bir kelime giriniz: ");
		String kelime=scan.next();
		
		if(kelime.startsWith("gh")) {
			System.out.println(kelime);
		}else if(kelime.startsWith("g")) {
			System.out.println(kelime.charAt(0)+kelime.substring(2));
		}else if(kelime.charAt(1)=='h') {
			System.out.println(kelime.substring(1));
		}else {
			System.out.println(kelime.substring(2));
		}
		
		scan.close();
		
		

	}

}
