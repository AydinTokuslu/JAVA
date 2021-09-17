package sorucozumleri_13_temmuz_2021;

import java.util.Scanner;

public class soru3_string_manipulation_regex_karakterler {

	public static void main(String[] args) {
		//Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

		Scanner scanner=new Scanner(System.in);
		System.out.println("lutfen 3 kelimeden olusan adınızı soyadınız giriniz : ");
		String adSoyad=scanner.nextLine();//hakan tetik javaci
		
		String name1=adSoyad.substring(0, adSoyad.indexOf(" "));
		String name2=adSoyad.substring(adSoyad.indexOf(" ")+1, adSoyad.lastIndexOf(" "));
		String name3=adSoyad.substring(adSoyad.lastIndexOf(" "));
		
		/*System.out.println(adSoyad.substring(0, adSoyad.indexOf(" "))+ 
				adSoyad.substring(adSoyad.indexOf(" ")+1, adSoyad.lastIndexOf(" "))+ 
				adSoyad.substring(adSoyad.lastIndexOf(" "))); */
				
		System.out.println("adiniz : " + name1+ " ikinci adiniz : " + name2+ " soyadiniz : " + name3);
		
		char n1=name1.charAt(0);
		char n2=name2.charAt(0);
		char n3=name3.charAt(0);
		
		System.out.println(n1+" "+n2+ " "+n3+" "); 
		
		
	}

}
