package sorucozumleri_26_temmuz_2021;

import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		// kullanıcıdan alınan bir stringdeki indexi tek  
		// olan karakterleri yazdiriniz.
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");//yunusciftci
        String str=scan.nextLine();
        
         int i=0;
        do {
            if (i%2==1) {
                System.out.print(str.charAt(i)+", ");//indexi tek olan char yazdırdık
                
            }
            i++;
        } while (i<str.length());
       

	}

}
